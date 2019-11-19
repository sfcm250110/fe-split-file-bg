package ec.com.kruger.util.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ec.com.kruger.bean.factura.Impuesto;
import ec.com.kruger.bean.factura.formaPago.FormaPago;
import ec.com.kruger.bean.liquidacion.compras.CabeceraLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.DetalleLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.ImpuestoDetalleLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.ImpuestoLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.ImpuestoReembolso;
import ec.com.kruger.bean.liquidacion.compras.InformacionAdicionalLiquidacionCompras;
import ec.com.kruger.bean.liquidacion.compras.ReembolsoLiquidacionCompras;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class LiquidacionComprasBuildUtil implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	public static CabeceraLiquidacionCompras getCabeceraLiquidacionCompras(String pLine) {
		CabeceraLiquidacionCompras cabecera = new CabeceraLiquidacionCompras();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC03_TIPO_REGISTRO);
		cabecera.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_CODIGO_DOCUMENTO);
		cabecera.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_ESTABLECIMIENTO);
		cabecera.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_PUNTO_EMISION);
		cabecera.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_SECUENCIAL);
		cabecera.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_FECHA_EMISION);
		cabecera.setFechaEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_HORA_EMISION);
		cabecera.setHoraEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_DIRECCION_ESTABLECIMIENTO);
		cabecera.setDirEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_TIPO_IDENTIFICACION_PROVEEDOR);
		cabecera.setTipoIdentificacionProveedor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_RAZON_SOCIAL_PROVEEDOR);
		cabecera.setRazonSocialProveedor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_IDENTIFICACION_PROVEEDOR);
		cabecera.setIdentificacionProveedor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_DIRECCION_PROVEEDOR);
		cabecera.setDireccionProveedor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_TOTAL_SIN_IMPUESTO);
		cabecera.setTotalSinImpuesto(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_TOTAL_DESCUENTO);
		cabecera.setTotalDescuento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_CODIGO_DOCUMENTO_REEMBOLSO);
		cabecera.setCodigoDocumentoReebolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_TOTAL_COMPROBANTE_REEMBOLSO);
		cabecera.setTotalComprobanteReebolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_TOTAL_BASE_IMPONIBLE_REEMBOLSO);
		cabecera.setTotalBaseImponibleReebolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_TOTAL_IMPUESTO_REEMBOLSO);
		cabecera.setTotalImpuestoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_IMPORTE_TOTAL);
		cabecera.setImporteTotal(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_MONEDA);
		cabecera.setMoneda(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_FECHA_VIGENCIA);
		cabecera.setFechaVigencia(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_OFICINA_BG);
		cabecera.setOficinaBg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_PORCENTAJE_IVA);
		cabecera.setPorcentajeIva(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC03_CLAVE_ACCESO);
		cabecera.setClaveAcceso(lineProperty.getValue());

		cabecera.setFillerCabeceraLiquidacionCompras(lineProperty.getNewLine().trim());

		return cabecera;
	}

	public static DetalleLiquidacionCompras getDetalleLiquidacionCompras(String pLine) {
		DetalleLiquidacionCompras detalle = new DetalleLiquidacionCompras();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGED03_TIPO_REGISTRO);
		detalle.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_COD_DOC);
		detalle.setCodigoDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_ESTAB);
		detalle.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_PTO_EMISION);
		detalle.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_SECUENCIAL);
		detalle.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_CODIGO_PRINCIPAL);
		detalle.setCodigoPrincipal(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_CODIGO_AUX);
		detalle.setCodigoAuxiliar(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_DESCRIPCION);
		detalle.setDescripcion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_CANTIDAD);
		detalle.setCantidad(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_PRECIO_UNITARIO);
		detalle.setPrecioUnitario(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_DESCUENTO);
		detalle.setDescuento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_PRECIO_TOTAL_SIN_IMP);
		detalle.setPrecioTotalSinImp(lineProperty.getValue());

		int impuestoIterator = Integer.valueOf(UGED03_IMP_DET_ITE).intValue();
		List<ImpuestoDetalleLiquidacionCompras> impuestos = new ArrayList<ImpuestoDetalleLiquidacionCompras>();

		for (int i = 0; i < impuestoIterator; i++) {
			ImpuestoDetalleLiquidacionCompras impuesto = new ImpuestoDetalleLiquidacionCompras();

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_IMP_CODIGO);
			impuesto.setCodigo(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_IMP_CODIGO_PORCENTAJE);
			impuesto.setCodigoPorcentaje(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_IMP_TARIFA);
			impuesto.setTarifa(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_IMP_BASE_IMPONIBLE);
			impuesto.setBaseImponible(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_IMP_VALOR);
			impuesto.setValor(lineProperty.getValue());

			impuestos.add(impuesto);
		}

		detalle.setImpuestoDetalle(impuestos);
		detalle.setFillerDetalleLiquidacionCompras(lineProperty.getNewLine().trim());

		return detalle;
	}

	public static ImpuestoLiquidacionCompras getImpuestoLiquidacionCompras(String pLine) {
		ImpuestoLiquidacionCompras impuesto = new ImpuestoLiquidacionCompras();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEI03_TIPO_REGISTRO);
		impuesto.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_CODIGO_DOCUMENTO);
		impuesto.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_ESTABLECIMIENTO);
		impuesto.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_PUNTO_EMISION);
		impuesto.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_SECUENCIAL);
		impuesto.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_TOTAL_CODIGO);
		impuesto.setTotalCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_TOTAL_CODIGO_PORCENTAJE);
		impuesto.setTotalCodigoPorcentaje(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_TOTAL_DESCUENTO_ADICIONAL);
		impuesto.setTotalDescuentoAdicional(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_TOTAL_BASE_IMPONIBLE);
		impuesto.setTotalBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_TOTAL_TARIFA);
		impuesto.setTotalTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_TOTAL_VALOR);
		impuesto.setTotalValor(lineProperty.getValue());

		int iteradorImpuesto = Integer.valueOf(UGEI03_FORMA_PAGO_ITEM).intValue();
		List<FormaPago> formasPago = new ArrayList<FormaPago>();

		for (int i = 0; i < iteradorImpuesto; i++) {
			FormaPago formaPago = new FormaPago();

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_PAGO_FORMA_PAGO);
			formaPago.setPagFormPago(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_PAGO_TOTAL);
			formaPago.setPagTotal(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_PAGO_PLAZO);
			formaPago.setPagPlazo(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI03_PAGO_UNIDAD_T);
			formaPago.setPagUnidadT(lineProperty.getValue());

			formasPago.add(formaPago);
		}

		impuesto.setFormasPago(formasPago);
		impuesto.setFiller(lineProperty.getNewLine().trim());

		return impuesto;
	}

	public static ReembolsoLiquidacionCompras getReembolsoLiquidacionCompras(String pLine) {
		ReembolsoLiquidacionCompras reembolso = new ReembolsoLiquidacionCompras();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGED03_REEMBOLSO_TIPO_REGISTRO);
		reembolso.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_CODIGO_DOCUMENTO);
		reembolso.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_ESTABLECIMIENTO);
		reembolso.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_PUNTO_EMISION);
		reembolso.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_SECUENCIAL);
		reembolso.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_TIPO_IDENTIFICACION_PROVEEDOR);
		reembolso.setTipoIdentificacionProveedor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_IDENTIFICACION_PROVEEDOR);
		reembolso.setIdentificacionProveedor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_CODIGO_PAIS_PAGO_PROVEEDOR);
		reembolso.setCodigoPaisPagoProveedor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_TIPO_PROVEEDOR_REEMBOLSO);
		reembolso.setTipoProveedoReembolsor(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_CODIGO_DOCUMENTO_REEMBOLSO);
		reembolso.setCodigoDocumentoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_ESTABLECIMIENTO_DOCUMENTO);
		reembolso.setEstablecimientoDocumentoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_PUNTO_EMISION_DOCUMENTO);
		reembolso.setPuntoEmisionDocumentoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_SECUENCIAL_DOCUMENTO);
		reembolso.setSecuencialDocumentoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_FECHA_EMISION_DOCUMENTO);
		reembolso.setFechaEmisionDocumentoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_NUMERO_AUTORIZACION_DOCUMENTO);
		reembolso.setNumeroAutorizacionDocumentoReembolso(lineProperty.getValue());

		int impuestoIterator = Integer.valueOf(UGED03_REEMBOLSO_IMPUESTO_ITEM).intValue();
		List<ImpuestoReembolso> listaImpuesto = new ArrayList<ImpuestoReembolso>();

		for (int i = 0; i < impuestoIterator; i++) {
			ImpuestoReembolso impuesto = new ImpuestoReembolso();

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_IMP_CODIGO);
			impuesto.setCodigo(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_IMP_CODIGO_PORCENTAJE);
			impuesto.setCodigoPorcentaje(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_IMP_TARIFA);
			impuesto.setTarifa(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_IMP_BASE_IMPONIBLE);
			impuesto.setBaseImponible(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED03_REEMBOLSO_IMP_REEMBOLSO);
			impuesto.setImpuestoReembolso(lineProperty.getValue());

			listaImpuesto.add(impuesto);
		}

		reembolso.setImpuestosReembolso(listaImpuesto);
		reembolso.setFillerDetalleLiquidacionCompras(lineProperty.getNewLine().trim());

		return reembolso;
	}

	public static InformacionAdicionalLiquidacionCompras getInformacionAdicionalLiquidacionCompras(String pLine) {
		InformacionAdicionalLiquidacionCompras informacionAdicional = new InformacionAdicionalLiquidacionCompras();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEA03_INFORMACION_ADICIONAL_TIPO_REGISTRO);
		informacionAdicional.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA03_INFORMACION_ADICIONAL_CODIGO_DOCUMENTO);
		informacionAdicional.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA03_INFORMACION_ADICIONAL_ESTABLECIMIENTO);
		informacionAdicional.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA03_INFORMACION_ADICIONAL_PUNTO_EMISION);
		informacionAdicional.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA03_INFORMACION_ADICIONAL_SECUENCIAL);
		informacionAdicional.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA03_INFORMACION_ADICIONAL_INFO_ADICIONAL_1);
		informacionAdicional.setInfoAdicional1(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA03_INFORMACION_ADICIONAL_INFO_ADICIONAL_2);
		informacionAdicional.setInfoAdicional2(lineProperty.getValue());

		informacionAdicional.setFiller(lineProperty.getNewLine().trim());

		return informacionAdicional;
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

}
