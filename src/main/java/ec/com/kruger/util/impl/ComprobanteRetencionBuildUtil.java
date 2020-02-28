package ec.com.kruger.util.impl;

import java.io.Serializable;

import ec.com.kruger.bean.retencion.v2.CabeceraComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.DocumentoSustentoComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.ImpuestoComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.ImpuestosComprobanteRetencion;
import ec.com.kruger.bean.retencion.v2.InformacionAdicionalComprobanteRetencion;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class ComprobanteRetencionBuildUtil implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	public static CabeceraComprobanteRetencion getCabeceraComprobanteRetencion(String pLine) {
		CabeceraComprobanteRetencion cabecera = new CabeceraComprobanteRetencion();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		cabecera.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		cabecera.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		cabecera.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		cabecera.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		cabecera.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FECHA_EMISION);
		cabecera.setFechaEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_HORA_EMISION);
		cabecera.setHoraEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_DIRECCION_ESTABLECIMIENTO);
		cabecera.setDirEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TIPO_IDENTIFICACION_RETENIDO);
		cabecera.setTipoIdentificacionRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_RAZON_SOCIAL_RETENIDO);
		cabecera.setRazonSocialRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_IDENTIFICACION_RETENIDO);
		cabecera.setIdentificacionRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PERIODO_FISCAL);
		cabecera.setPeridoFiscal(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_NUMERO_GENERADO);
		cabecera.setNumeroGenerado(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FECHA_VIGENCIA);
		cabecera.setFechaVigencia(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_OFICINA_BG);
		cabecera.setOficinaBg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL_BG);
		cabecera.setSecuencialBg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PORCENTAJE_IVA);
		cabecera.setPorcentajeIva(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CLAVE_ACCESO_BG);
		cabecera.setClaveAcceso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PARTE_RELACIONADA);
		cabecera.setParteRelacionada(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FORMA_PAGO);
		cabecera.setFormaPago(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TOTAL_PAGO);
		cabecera.setTotalPago(lineProperty.getValue());

		cabecera.setFillerCabeceraComprobanteRetencion(lineProperty.getNewLine().trim());

		return cabecera;
	}

	public static DocumentoSustentoComprobanteRetencion getDocumentoSustentoComprobanteRetencion(String pLine) {
		DocumentoSustentoComprobanteRetencion documentoSustento = new DocumentoSustentoComprobanteRetencion();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		documentoSustento.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		documentoSustento.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		documentoSustento.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		documentoSustento.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		documentoSustento.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_SUSTENTO);
		documentoSustento.setCodigoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO_SUSTENTO);
		documentoSustento.setCodigoDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_NUMERO_DOCUMENTO_SUSTENTO);
		documentoSustento.setNumeroDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FECHA_EMISION_DOCUMENTO_SUSTENTO);
		documentoSustento.setFechaEmisionDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FECHA_REGISTRO_CONTABLE);
		documentoSustento.setFechaRegistroContable(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_NUMERO_AUTORIZACION_DOCUMENTO_SUSTENTO);
		documentoSustento.setNumeroAutorizacionDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PAGO_LOCAL_EXTERIOR);
		documentoSustento.setPagoLocalExterior(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TOTAL_SIN_IMPUESTO);
		documentoSustento.setTotalSinImpuesto(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_IMPORTE_TOTAL);
		documentoSustento.setImporteTotal(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TOTAL_COMPROBANTE_REEMBOLSO);
		documentoSustento.setTotalComprobanteReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TOTAL_BASE_IMPUESTO_REEMBOLSO);
		documentoSustento.setTotalBaseImponibleReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TOTAL_IMPUESTO_REEMBOLSO);
		documentoSustento.setTotalImpuestoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TIPO_REGIMEN);
		documentoSustento.setTipoRegimen(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PAIS_EFECTIVO_PAGO);
		documentoSustento.setPaisEfectivoPago(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_APLICA_CONVENIO_DOBLE_TRIB);
		documentoSustento.setAplicaConvenioDobleTrib(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PAG_EXT_SUJ_RET_NOM_LEG);
		documentoSustento.setPagoExtSujRetNomLeg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PAGO_REG_FIS);
		documentoSustento.setPagoRegFis(lineProperty.getValue());

		return documentoSustento;
	}

	public static ImpuestoComprobanteRetencion getImpuestoComprobanteRetencion(String pLine) {
		ImpuestoComprobanteRetencion impuesto = new ImpuestoComprobanteRetencion();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		impuesto.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		impuesto.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		impuesto.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		impuesto.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		impuesto.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO);
		impuesto.setCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_RETENCION);
		impuesto.setCodigoRetencion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_BASE_RETENCION);
		impuesto.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PORCENTAJE_RETENER);
		impuesto.setPorcentajeRetener(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_VALOR_RETENIDO);
		impuesto.setValorRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FECHA_PAGO_DIV);
		impuesto.setFechaPagoDiv(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_IMPUESTO_RENTA_SOC);
		impuesto.setImpuestoRentaSoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_EJERCICIO_FISCAL_ULT_DIV);
		impuesto.setEjercicioFiscalUltDiv(lineProperty.getValue());

		impuesto.setFillerImpuestoComprobanteRetencion(lineProperty.getNewLine().trim());

		return impuesto;
	}

	public static ImpuestosComprobanteRetencion getImpuestosComprobanteRetencion(String pLine) {
		ImpuestosComprobanteRetencion impuestos = new ImpuestosComprobanteRetencion();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		impuestos.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		impuestos.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		impuestos.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		impuestos.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		impuestos.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO_SUSTENTO_IMP);
		impuestos.setCodigoDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_PORCENTAJE);
		impuestos.setCodigoPorcentaje(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_BASE_IMPONIBLE);
		impuestos.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TARIFA);
		impuestos.setTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_VALOR_IMPUESTO);
		impuestos.setValorImpuesto(lineProperty.getValue());

		impuestos.setFillerImpuestosComprobanteRetencion(lineProperty.getNewLine().trim());

		return impuestos;
	}

	public static InformacionAdicionalComprobanteRetencion getInformacionAdicionalComprobanteRetencion(String pLine) {
		InformacionAdicionalComprobanteRetencion informacionAdicional = new InformacionAdicionalComprobanteRetencion();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		informacionAdicional.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		informacionAdicional.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		informacionAdicional.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		informacionAdicional.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		informacionAdicional.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_V2_INFORMACION_ADICIONAL_INFO_ADICIONAL_1);
		informacionAdicional.setInformacionAdicionalUno(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_V2_INFORMACION_ADICIONAL_INFO_ADICIONAL_2);
		informacionAdicional.setInformacionAdicionalDos(lineProperty.getValue());

		informacionAdicional.setFillerInformacionAdicionalComprobanteRetencion(lineProperty.getNewLine().trim());

		return informacionAdicional;
	}

}
