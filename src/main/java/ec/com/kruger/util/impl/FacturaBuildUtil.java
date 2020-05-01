package ec.com.kruger.util.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ec.com.kruger.bean.factura.Adicional;
import ec.com.kruger.bean.factura.Cabecera;
import ec.com.kruger.bean.factura.Detalle;
import ec.com.kruger.bean.factura.Impuesto;
import ec.com.kruger.bean.factura.Retencion;
import ec.com.kruger.bean.factura.formaPago.FormaPago;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class FacturaBuildUtil implements DocumentTransformUtil, Serializable {
	
	private static final long serialVersionUID = 1L;

	public static Cabecera getCabeceraFactura(String pLine) {
		Cabecera cabecera = new Cabecera();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC01_TIPO_REGISTRO);
		cabecera.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_COD_DOC);
		cabecera.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_ESTAB);
		cabecera.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_PTO_EMISION);
		cabecera.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_SECUENCIAL);
		cabecera.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_FECHA_EMISION);
		cabecera.setFechaEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_HORA_EMISION);
		cabecera.setHoraEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_DIR_ESTABLECIMIENTO);
		cabecera.setDirEstablecimiento(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_TIPO_IDENTIF_COMPRADOR);
		cabecera.setTipoIDentifComprador(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_RAZON_SOC_COMPRADOR);
		cabecera.setRazonSocComprador(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_IDENTIF_COMPRADOR);
		cabecera.setIdentifiComprador(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_TOTAL_SIN_IMPUESTO);
		cabecera.setTotalSinImpuesto(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_TOTAL_DESCUENTO);
		cabecera.setTotalDescuento(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_PROPINA);
		cabecera.setPropina(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_IMPORTE_TOTAL);
		cabecera.setImporteTotal(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_MONEDA);
		cabecera.setMoneda(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_GUIA_REMISION);
		cabecera.setGuiaRemision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_VALOR_PAGAR);
		cabecera.setValorPagar(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_NUM_GENERADO);
		cabecera.setNumGenerado(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_FECHA_VIGENCIA);
		cabecera.setFechaVigencia(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_OFICINA_BG);
		cabecera.setOficinaBg(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_PORC_IVA);
		cabecera.setPorcIva(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_CLAVE_ACCESO_BG);
		cabecera.setClaveAcceso(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_DIR_COMPRADOR);
		cabecera.setDirComprador(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_COMP_CODIGO);
		cabecera.setCompCodigo(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_COMP_TARIFA);
		cabecera.setCompTarifa(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC01_COMP_SOLIDARIA);
		cabecera.setCompSolidaria(lineProperty.getValue());
		
		cabecera.setFillerCabFac(lineProperty.getNewLine().trim());

		return cabecera;
	}

	public static Impuesto getImpuestosFactura(String pLine) {
		Impuesto impuesto = new Impuesto();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEI01_TIPO_REGISTRO);
		impuesto.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_COD_DOC);
		impuesto.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_ESTAB);
		impuesto.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_PTO_EMISION);
		impuesto.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_SECUENCIAL);
		impuesto.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_TOT_CODIGO);
		impuesto.setTotCodigo(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_TOT_CODIGO_PORCENTAJE);
		impuesto.setTotCodigoPorcentaje(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_TOT_BASE_IMPONIBLE);
		impuesto.setTotBaseImponible(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_TOT_VALOR);
		impuesto.setTotValor(lineProperty.getValue());

		int iteradorImpuesto = Integer.valueOf(UGEI01_FORM_PAGO_ITE).intValue();
		List<FormaPago> listaFormaPago = new ArrayList<FormaPago>();

		for (int i = 0; i < iteradorImpuesto; i++) {
			FormaPago formaPago = new FormaPago();
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_PAG_FORM_PAGO);
			formaPago.setPagFormPago(lineProperty.getValue());
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_PAG_TOTAL);
			formaPago.setPagTotal(lineProperty.getValue());
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_PAG_PLAZO);
			formaPago.setPagPlazo(lineProperty.getValue());
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI01_PAG_UNIDAD_T);
			formaPago.setPagUnidadT(lineProperty.getValue());
			
			listaFormaPago.add(formaPago);
		}

		impuesto.setFormaPago(listaFormaPago);
		impuesto.setFillerImpFac(lineProperty.getNewLine().trim());

		return impuesto;
	}

	public static Detalle getDetalleFactura(String pLine) {
		Detalle detalle = new Detalle();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGED01_TIPO_REGISTRO);
		detalle.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_COD_DOC);
		detalle.setCodigoDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_ESTAB);
		detalle.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_PTO_EMISION);
		detalle.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_SECUENCIAL);
		detalle.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_CODIGO_PRINCIPAL);
		detalle.setCodigoPrincipal(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_CODIGO_AUX);
		detalle.setCodigoAuxiliar(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_DESCRIPCION);
		detalle.setDescripcion(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_CANTIDAD);
		detalle.setCantidad(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_PRECIO_UNITARIO);
		detalle.setPrecioUnitario(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_DESCUENTO);
		detalle.setDescuento(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_PRECIO_TOTAL_SIN_IMP);
		detalle.setPrecioTotalSinImp(lineProperty.getValue());

		int impuestoIterator = Integer.valueOf(UGED01_IMP_DET_ITE).intValue();
		List<Impuesto> listaImpuesto = new ArrayList<Impuesto>();

		for (int i = 0; i < impuestoIterator; i++) {
			Impuesto impuesto = new Impuesto();
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_IMP_CODIGO);
			impuesto.setTotCodigo(lineProperty.getValue());
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_IMP_CODIGO_PORCENTAJE);
			impuesto.setTotCodigoPorcentaje(lineProperty.getValue());
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_IMP_TARIFA);
			impuesto.setTarifa(lineProperty.getValue());
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_IMP_BASE_IMPONIBLE);
			impuesto.setTotBaseImponible(lineProperty.getValue());
			
			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED01_IMP_VALOR);
			impuesto.setTotValor(lineProperty.getValue());

			listaImpuesto.add(impuesto);
		}

		detalle.setImpuestoDetalle(listaImpuesto);
		detalle.setFillerDetFac(lineProperty.getNewLine().trim());

		return detalle;
	}

	public static List<FormaPago> getFormasPago(String formaPago, String pagTotal, String pagPlazo, String pagUnidad) {
		String[] formaPagoArray = formaPago.split(CARACTER_SEPARADOR_ITERADOR);
		String[] pagTotalArray = pagTotal.split(CARACTER_SEPARADOR_ITERADOR);
		String[] pagPlazoArray = pagPlazo.split(CARACTER_SEPARADOR_ITERADOR);
		String[] pagUnidadArray = pagUnidad.split(CARACTER_SEPARADOR_ITERADOR);
		List<FormaPago> listaFormaPag = new ArrayList<FormaPago>();

		for (int i = 0; i < formaPagoArray.length; i++) {
			FormaPago formaPagoObj = new FormaPago();
			formaPagoObj.setPagFormPago(formaPagoArray[i]);
			formaPagoObj.setPagPlazo(pagPlazoArray[i]);
			formaPagoObj.setPagUnidadT(pagUnidadArray[i]);
			formaPagoObj.setPagTotal(pagTotalArray[i]);
			listaFormaPag.add(formaPagoObj);
		}
		
		return listaFormaPag;
	}

	public static List<Impuesto> getImpuestosFromArrayLine(String impCodigo, String impCodigoPorcentaje, String tarifa, String baseImponible, String impValor) {
		String[] impCodigoArray = impCodigo.split(CARACTER_SEPARADOR_ITERADOR);
		String[] impCodigoPorcentajeArray = impCodigoPorcentaje.split(CARACTER_SEPARADOR_ITERADOR);
		String[] baseImponibleArray = baseImponible.split(CARACTER_SEPARADOR_ITERADOR);
		String[] tarifaArray = tarifa.split(CARACTER_SEPARADOR_ITERADOR);
		String[] impValorArray = impValor.split(CARACTER_SEPARADOR_ITERADOR);
		List<Impuesto> listaImpuesto = new ArrayList<Impuesto>();
		
		for (int i = 0; i < impCodigoArray.length; i++) {
			Impuesto impuestoObj = new Impuesto();
			impuestoObj.setTotCodigo(impCodigoArray[i]);
			impuestoObj.setTotCodigoPorcentaje(impCodigoPorcentajeArray[i]);
			impuestoObj.setTarifa(tarifaArray[i]);
			impuestoObj.setTotBaseImponible(baseImponibleArray[i]);
			impuestoObj.setTotValor(impValorArray[i]);
			listaImpuesto.add(impuestoObj);
		}

		return null;
	}

	public static Retencion getRetencionFactura(String pLine) {
		Retencion retencion = new Retencion();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGER01_TIPO_REGISTRO);
		retencion.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_COD_DOC);
		retencion.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_ESTAB);
		retencion.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_PTO_EMISION);
		retencion.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_SECUENCIAL);
		retencion.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_CODIGO);
		retencion.setCodigo(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_CODIGO_PORCENTAJE);
		retencion.setCodigoPorcentaje(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_TARIFA);
		retencion.setTarifa(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER01_VALOR);
		retencion.setValor(lineProperty.getValue());

		return retencion;
	}

	public static Adicional getAdicionalFactura(String pLine) {
		Adicional adicional = new Adicional();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEA01_TIPO_REGISTRO);
		adicional.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA01_COD_DOC);
		adicional.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA01_ESTAB);
		adicional.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA01_PTO_EMISION);
		adicional.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA01_SECUENCIAL);
		adicional.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA01_INFO_ADICIONAL_1);
		adicional.setInfoAdicional1(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA01_INFO_ADICIONAL_2);
		adicional.setInfoAdicional2(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA01_INFO_ADICIONAL_3);
		adicional.setInfoAdicional3(lineProperty.getValue());
		
		adicional.setFillerAdFac(lineProperty.getNewLine().trim());

		return adicional;
	}

}
