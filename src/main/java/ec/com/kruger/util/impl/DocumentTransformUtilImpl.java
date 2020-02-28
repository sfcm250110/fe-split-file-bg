package ec.com.kruger.util.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ec.com.kruger.bean.factura.Adicional;
import ec.com.kruger.bean.factura.Cabecera;
import ec.com.kruger.bean.factura.Detalle;
import ec.com.kruger.bean.factura.Factura;
import ec.com.kruger.bean.factura.Impuesto;
import ec.com.kruger.bean.factura.Retencion;
import ec.com.kruger.bean.factura.notacredito.AdicionalNC;
import ec.com.kruger.bean.factura.notacredito.CabeceraNC;
import ec.com.kruger.bean.factura.notacredito.DetalleNC;
import ec.com.kruger.bean.factura.notacredito.ImpuestoNC;
import ec.com.kruger.bean.factura.notacredito.NotaCreditoNC;
import ec.com.kruger.bean.factura.notadebito.AdicionalND;
import ec.com.kruger.bean.factura.notadebito.CabeceraND;
import ec.com.kruger.bean.factura.notadebito.ImpuestoND;
import ec.com.kruger.bean.factura.notadebito.MotivoND;
import ec.com.kruger.bean.factura.notadebito.NotaDebitoND;
import ec.com.kruger.bean.factura.retencion.AdicionalR;
import ec.com.kruger.bean.factura.retencion.CabeceraR;
import ec.com.kruger.bean.factura.retencion.ImpuestoR;
import ec.com.kruger.bean.factura.retencion.RetencionR;
import ec.com.kruger.bean.liquidacion.compras.CabeceraLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.DetalleLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.ImpuestoLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.InformacionAdicionalLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.LiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.ReembolsoLiquidacionCompras;
import ec.com.kruger.bean.retencion.v2.CabeceraComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.ComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.DocumentoSustentoComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.ImpuestoComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.ImpuestosComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.InformacionAdicionalComprobanteRetencion;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class DocumentTransformUtilImpl implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(DocumentTransformUtilImpl.class.getName());

	public static Factura obtenerFactura(String pFactura) throws Exception {
		Cabecera cabecera = new Cabecera();
		Adicional adicional = new Adicional();
		Detalle detalle = new Detalle();
		Impuesto impuesto = new Impuesto();
		Retencion retencion = new Retencion();
		Factura factura = new Factura();
		ArrayList<Impuesto> listaImpuestos = new ArrayList<Impuesto>();
		ArrayList<Detalle> listaDetalle = new ArrayList<Detalle>();
		ArrayList<Adicional> listaAdicional = new ArrayList<Adicional>();
		ArrayList<Retencion> listaRetencion = new ArrayList<Retencion>();
		List<String> lista = Arrays.asList(pFactura.split(BREAL_LINE));
		String tipoLinea = EMPTY;

		for (String line : lista) {
			tipoLinea = DocumentTransformUtilImpl.getTipoLinea(line);

			if (tipoLinea.equals(TIPO_LINEA_CABECERA_FACT)) {
				cabecera = FacturaBuildUtil.getCabeceraFactura(line);

			} else if (tipoLinea.equals((TIPO_LINEA_DET))) {
				detalle = FacturaBuildUtil.getDetalleFactura(line);
				listaDetalle.add(detalle);
				detalle = new Detalle();

			} else if (tipoLinea.equals((TIPO_LINEA_IMP))) {
				impuesto = FacturaBuildUtil.getImpuestosFactura(line);
				listaImpuestos.add(impuesto);
				impuesto = new Impuesto();

			} else if (tipoLinea.equals((TIPO_LINEA_RET))) {
				retencion = FacturaBuildUtil.getRetencionFactura(line);
				listaRetencion.add(retencion);
				retencion = new Retencion();

			} else if (tipoLinea.equals((TIPO_LINEA_ADICIONAL))) {
				adicional = FacturaBuildUtil.getAdicionalFactura(line);
				listaAdicional.add(adicional);
				adicional = new Adicional();
			}
		}

		try {
			factura.setCabecera(cabecera);
			factura.setImpuestos(listaImpuestos);
			factura.setAdicional(listaAdicional);
			factura.setRetenciones(listaRetencion);
			factura.setDetalles(listaDetalle);

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}

		return factura;
	}

	public static NotaCreditoNC obtenerNotaCredito(String pNotaCredito) throws Exception {
		CabeceraNC cabecera = new CabeceraNC();
		AdicionalNC adicional = new AdicionalNC();
		DetalleNC detalle = new DetalleNC();
		ImpuestoNC impuesto = new ImpuestoNC();
		NotaCreditoNC notaCredito = new NotaCreditoNC();
		ArrayList<ImpuestoNC> listaImpuestos = new ArrayList<ImpuestoNC>();
		ArrayList<DetalleNC> listaDetalle = new ArrayList<DetalleNC>();
		ArrayList<AdicionalNC> listaAdicional = new ArrayList<AdicionalNC>();
		List<String> lista = Arrays.asList(pNotaCredito.split(BREAL_LINE));

		for (String linea : lista) {
			String tipoLinea = DocumentTransformUtilImpl.getTipoLinea(linea);

			if (tipoLinea.equals(TIPO_LINEA_CABECERA_FACT)) {
				cabecera = NotaCreditoBuildUtil.getCabeceraNotaCredito(linea);

			} else if (tipoLinea.equals(TIPO_LINEA_DET)) {
				detalle = NotaCreditoBuildUtil.getDetalleNotaCredito(linea);
				listaDetalle.add(detalle);
				detalle = new DetalleNC();

			} else if (tipoLinea.equals(TIPO_LINEA_IMP)) {
				impuesto = NotaCreditoBuildUtil.getImpuestosNotaCredito(linea);
				listaImpuestos.add(impuesto);
				impuesto = new ImpuestoNC();

			} else if (tipoLinea.equals(TIPO_LINEA_ADICIONAL)) {
				adicional = NotaCreditoBuildUtil.getAdicionalNotaCredito(linea);
				listaAdicional.add(adicional);
				adicional = new AdicionalNC();
			}
		}

		try {
			notaCredito.setCabecera(cabecera);
			notaCredito.setImpuestos(listaImpuestos);
			notaCredito.setAdicional(listaAdicional);
			notaCredito.setDetalles(listaDetalle);

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}

		return notaCredito;
	}

	public static NotaDebitoND obtenerNotaDebito(String pNotaDebito) throws Exception {
		CabeceraND cabecera = new CabeceraND();
		AdicionalND adicional = new AdicionalND();
		ImpuestoND impuesto = new ImpuestoND();
		MotivoND motivo = new MotivoND();
		NotaDebitoND notaDebito = new NotaDebitoND();
		ArrayList<ImpuestoND> listaImpuestos = new ArrayList<ImpuestoND>();
		ArrayList<AdicionalND> listaAdicional = new ArrayList<AdicionalND>();
		ArrayList<MotivoND> listaMotivos = new ArrayList<MotivoND>();
		List<String> lista = Arrays.asList(pNotaDebito.split(BREAL_LINE));

		for (String linea : lista) {
			String tipoLinea = DocumentTransformUtilImpl.getTipoLinea(linea);

			if (tipoLinea.equals(TIPO_LINEA_CABECERA_FACT)) {
				cabecera = NotaDebitoBuildUtil.getCabeceraNotaDebito(linea);

			} else if (tipoLinea.equals(TIPO_LINEA_IMP)) {
				impuesto = NotaDebitoBuildUtil.getImpuestosNotaDebito(linea);
				listaImpuestos.add(impuesto);
				impuesto = new ImpuestoND();

			} else if (tipoLinea.equals(TIPO_LINEA_MOTIVO)) {
				motivo = NotaDebitoBuildUtil.getMotivoNotaDebito(linea);
				listaMotivos.add(motivo);
				motivo = new MotivoND();

			} else if (!tipoLinea.equals(TIPO_LINEA_ADICIONAL)) {
				continue;
			}

			adicional = NotaDebitoBuildUtil.getAdicionalNotaDebito(linea);
			listaAdicional.add(adicional);
			adicional = new AdicionalND();
		}

		try {
			notaDebito.setCabecera(cabecera);
			notaDebito.setImpuestos(listaImpuestos);
			notaDebito.setAdicional(listaAdicional);
			notaDebito.setMotivos(listaMotivos);

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}

		return notaDebito;
	}

	public static RetencionR obtenerRetencion(String pRetencion) throws Exception {
		CabeceraR cabecera = new CabeceraR();
		AdicionalR adicional = new AdicionalR();
		ImpuestoR impuesto = new ImpuestoR();
		RetencionR retencion = new RetencionR();
		ArrayList<ImpuestoR> listaImpuestos = new ArrayList<ImpuestoR>();
		ArrayList<AdicionalR> listaAdicional = new ArrayList<AdicionalR>();
		List<String> lista = Arrays.asList(pRetencion.split(BREAL_LINE));

		for (String linea : lista) {
			String tipoLinea = DocumentTransformUtilImpl.getTipoLinea(linea);

			if (tipoLinea.equals(TIPO_LINEA_CABECERA_FACT)) {
				cabecera = RetencionBuildUtil.getCabeceraRetencion(linea);

			} else if (tipoLinea.equals(TIPO_LINEA_IMP)) {
				impuesto = RetencionBuildUtil.getImpuestosRetencion(linea);
				listaImpuestos.add(impuesto);
				impuesto = new ImpuestoR();

			} else if (tipoLinea.equals((TIPO_LINEA_ADICIONAL))) {
				adicional = RetencionBuildUtil.getAdicionalRetencion(linea);
				listaAdicional.add(adicional);
				adicional = new AdicionalR();
			}
		}

		try {
			retencion.setCabecera(cabecera);
			retencion.setImpuestos(listaImpuestos);
			retencion.setAdicional(listaAdicional);

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}

		return retencion;
	}

	public static LiquidacionCompras obtenerLiquidacionCompras(String pLiquidacionCompra) throws Exception {
		CabeceraLiquidacionCompras cabecera = new CabeceraLiquidacionCompras();
		List<DetalleLiquidacionCompras> detalles = new ArrayList<DetalleLiquidacionCompras>();
		List<ImpuestoLiquidacionCompras> impuestos = new ArrayList<ImpuestoLiquidacionCompras>();
		List<ReembolsoLiquidacionCompras> reembolsos = new ArrayList<ReembolsoLiquidacionCompras>();
		List<InformacionAdicionalLiquidacionCompras> informacionesAdicional = new ArrayList<InformacionAdicionalLiquidacionCompras>();

		List<String> lineas = Arrays.asList(pLiquidacionCompra.split(BREAL_LINE));
		String tipoLinea = EMPTY;

		for (String linea : lineas) {
			tipoLinea = DocumentTransformUtilImpl.getTipoLinea(linea);

			if (tipoLinea.equals(TIPO_LINEA_CABECERA_COMPROBANTE)) {
				cabecera = LiquidacionComprasBuildUtil.getCabeceraLiquidacionCompras(linea);

			} else if (tipoLinea.equals(TIPO_LINEA_IMP)) {
				ImpuestoLiquidacionCompras impuesto = LiquidacionComprasBuildUtil.getImpuestoLiquidacionCompras(linea);
				impuestos.add(impuesto);

			} else if (tipoLinea.equals(TIPO_LINEA_DET)) {
				DetalleLiquidacionCompras detalle = LiquidacionComprasBuildUtil.getDetalleLiquidacionCompras(linea);
				detalles.add(detalle);

			} else if (tipoLinea.equals(TIPO_LINEA_REEMBOLSO)) {
				ReembolsoLiquidacionCompras reembolso = LiquidacionComprasBuildUtil.getReembolsoLiquidacionCompras(linea);
				reembolsos.add(reembolso);

			} else if (tipoLinea.equals((TIPO_LINEA_ADICIONAL))) {
				InformacionAdicionalLiquidacionCompras informacionAdicional = LiquidacionComprasBuildUtil.getInformacionAdicionalLiquidacionCompras(linea);
				informacionesAdicional.add(informacionAdicional);
			}
		}

		LiquidacionCompras liquidacionCompras = new LiquidacionCompras();
		try {
			liquidacionCompras.setCabecera(cabecera);
			liquidacionCompras.setDetalles(detalles);
			liquidacionCompras.setImpuestos(impuestos);
			liquidacionCompras.setReembolsos(reembolsos);
			liquidacionCompras.setInformacionesAdicional(informacionesAdicional);

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}

		return liquidacionCompras;
	}
	
	public static ComprobanteRetencion obtenerComprobanteRetencion(String pComprobanteRetencion) throws Exception {
		CabeceraComprobanteRetencion cabecera = new CabeceraComprobanteRetencion();
		List<DocumentoSustentoComprobanteRetencion> documentoSustento = new ArrayList<DocumentoSustentoComprobanteRetencion>();
		List<ImpuestoComprobanteRetencion> impuestoLista = new ArrayList<ImpuestoComprobanteRetencion>();
		List<ImpuestosComprobanteRetencion> impuestosLista = new ArrayList<ImpuestosComprobanteRetencion>();
		List<InformacionAdicionalComprobanteRetencion> informacionesAdicional = new ArrayList<InformacionAdicionalComprobanteRetencion>();

		List<String> lineas = Arrays.asList(pComprobanteRetencion.split(BREAL_LINE));
		String tipoLinea = EMPTY;

		for (String linea : lineas) {
			tipoLinea = DocumentTransformUtilImpl.getTipoLinea(linea);

			if (tipoLinea.equals(TIPO_LINEA_CABECERA_COMPROBANTE)) {
				cabecera = ComprobanteRetencionBuildUtil.getCabeceraComprobanteRetencion(linea);

			} else if (tipoLinea.equals(TIPO_LINEA_IMP)) {
				ImpuestoComprobanteRetencion impuesto = ComprobanteRetencionBuildUtil.getImpuestoComprobanteRetencion(linea);
				impuestoLista.add(impuesto);

			} else if (tipoLinea.equals(TIPO_LINEA_DET)) {
				DocumentoSustentoComprobanteRetencion detalle = ComprobanteRetencionBuildUtil.getDocumentoSustentoComprobanteRetencion(linea);
				documentoSustento.add(detalle);

			} else if (tipoLinea.equals(TIPO_LINEA_RET)) {
				ImpuestosComprobanteRetencion impuestos = ComprobanteRetencionBuildUtil.getImpuestosComprobanteRetencion(linea);
				impuestosLista.add(impuestos);

			} else if (tipoLinea.equals((TIPO_LINEA_ADICIONAL))) {
				InformacionAdicionalComprobanteRetencion informacionAdicional = ComprobanteRetencionBuildUtil.getInformacionAdicionalComprobanteRetencion(linea);
				informacionesAdicional.add(informacionAdicional);
			}
		}

		ComprobanteRetencion comprobanteRetencion = new ComprobanteRetencion();
		try {
			comprobanteRetencion.setCabecera(cabecera);
			comprobanteRetencion.setDocumentosSustento(documentoSustento);
			comprobanteRetencion.setImpuestos(impuestoLista);
			comprobanteRetencion.setImpuestosLista(impuestosLista);
			comprobanteRetencion.setInformacionesAdicional(informacionesAdicional);

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}

		return comprobanteRetencion;
	}

	public static String getTipoDocumentoByLine(String pLineCabecera) {
		int inicioSubstr = Integer.valueOf(UGEC01_TIPO_REGISTRO).intValue();
		int cantidadSubstr = Integer.valueOf(UGEC01_COD_DOC).intValue() + 1;

		return pLineCabecera.substring(inicioSubstr, cantidadSubstr);
	}

	public static String getTipoLinea(String linea) {
		String tipoLinea = EMPTY;

		if (linea != null && !EMPTY.equals(linea)) {
			tipoLinea = linea.substring(0, 1);
		}

		return tipoLinea;
	}

	public static String getFormatoLineaDecimal(String linea, String posiciones) {
		String resultLine = DECIMAL;

		if (!EMPTY.equals(linea)) {
			String cantidadEntero = posiciones.split(CARACTER_SEPARADOR_DECIMAL)[0];
			String cantidadDecimal = posiciones.split(CARACTER_SEPARADOR_DECIMAL)[1];
			Integer valorEnteroExtraer = Integer.valueOf(cantidadEntero) - Integer.valueOf(cantidadDecimal);
			String elementoEntero = linea.substring(0, valorEnteroExtraer);
			String elementoDecimal = linea.substring(valorEnteroExtraer, linea.length());
			resultLine = elementoEntero + POINT + elementoDecimal;
		}

		return resultLine;
	}

	public static String getDecisionTransformarLineaIterator(String linea, String keyValor) {
		Integer iterador = Integer.valueOf(keyValor.split(CARACTER_SEPARADOR_ITERADOR)[1]);
		String nextSplitLine = keyValor.split(CARACTER_SEPARADOR_ITERADOR)[0];
		Integer lineaSinIterador = 0;
		Integer cantidadDecimales = 0;

		if (nextSplitLine.contains(CARACTER_SEPARADOR_DECIMAL)) {
			lineaSinIterador = Integer.valueOf(nextSplitLine.split(CARACTER_SEPARADOR_DECIMAL)[0]);
			cantidadDecimales = Integer.valueOf(nextSplitLine.split(CARACTER_SEPARADOR_DECIMAL)[1]);

		} else {
			lineaSinIterador = Integer.valueOf(nextSplitLine);
		}

		return keyValor.contains(CARACTER_SEPARADOR_DECIMAL) ? DocumentTransformUtilImpl.getFormatoLineaDecimalIterator(linea, lineaSinIterador, iterador, cantidadDecimales) : DocumentTransformUtilImpl.getFormatoLineaIterator(linea, lineaSinIterador, iterador, cantidadDecimales);
	}

	public static String getFormatoLineaDecimalIterator(String linea, Integer cantidadCaracteres, Integer iterador, Integer cantidadDecimales) {
		return DocumentTransformUtilImpl.getShapeLineIterattor(linea, cantidadCaracteres, iterador, cantidadDecimales, Boolean.TRUE);
	}

	public static String getFormatoLineaIterator(String linea, Integer cantidadCaracteres, Integer iterador, Integer cantidadDecimales) {
		return DocumentTransformUtilImpl.getShapeLineIterattor(linea, cantidadCaracteres, iterador, cantidadDecimales, Boolean.FALSE);
	}

	public static String getShapeLineIterattor(String linea, Integer cantidadCaracteres, Integer iterador, Integer cantidadDecimales, Boolean isDeciml) {
		String lineaTemporal = EMPTY;
		String lineaAcumulativa = EMPTY;
		String lineaTransformada = EMPTY;

		if (isDeciml.booleanValue()) {
			for (int i = 0; i < iterador; ++i) {
				lineaTemporal = linea.substring(0, cantidadCaracteres);
				Integer valorEnteroExtraer = cantidadCaracteres - cantidadDecimales;
				String elementoEntero = lineaTemporal.substring(0, valorEnteroExtraer);
				String elementoDecimal = lineaTemporal.substring(valorEnteroExtraer, lineaTemporal.length());
				lineaAcumulativa = elementoEntero + POINT + elementoDecimal;
				lineaTransformada = lineaTransformada + lineaAcumulativa.concat(CARACTER_SEPARADOR_ITERADOR);
				linea = linea.substring(cantidadCaracteres, linea.length());
			}

		} else {
			for (int i = 0; i < iterador; ++i) {
				lineaTemporal = linea.substring(0, cantidadCaracteres);
				lineaTransformada = lineaTransformada + lineaTemporal.concat(CARACTER_SEPARADOR_ITERADOR);
				linea = linea.substring(cantidadCaracteres, linea.length());
			}
		}

		return lineaTransformada;
	}

	public static LineProperty getLineProperty(String pLine, String pLength) {
		Integer sizeCharacters = Integer.valueOf(pLength.split(CARACTER_SEPARADOR_DECIMAL)[0]);
		String newLine = pLine.substring(sizeCharacters, pLine.length());
		String value = pLine.substring(0, sizeCharacters).trim();

		if (pLength.contains(CARACTER_SEPARADOR_DECIMAL)) {
			value = getFormatoLineaDecimal(value, pLength);
		}

		LineProperty lineProperty = new LineProperty();
		lineProperty.setValue(value);
		lineProperty.setNewLine(newLine);

		return lineProperty;
	}

}
