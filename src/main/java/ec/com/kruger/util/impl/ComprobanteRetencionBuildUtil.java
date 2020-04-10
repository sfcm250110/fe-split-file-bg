package ec.com.kruger.util.impl;

import java.io.Serializable;

import ec.com.kruger.bean.retencion.ats.CabeceraComprobanteRetencionAts;
import ec.com.kruger.bean.retencion.ats.DocumentoSustentoComprobanteRetencionAts;
import ec.com.kruger.bean.retencion.ats.ImpuestoAts;
import ec.com.kruger.bean.retencion.ats.InformacionAdicionalComprobanteRetencionAts;
import ec.com.kruger.bean.retencion.ats.RetencionAts;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class ComprobanteRetencionBuildUtil implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	public static CabeceraComprobanteRetencionAts getCabeceraComprobanteRetencion(String pLine) {
		CabeceraComprobanteRetencionAts cabecera = new CabeceraComprobanteRetencionAts();

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

	public static DocumentoSustentoComprobanteRetencionAts getDocumentoSustentoComprobanteRetencion(String pLine) {
		DocumentoSustentoComprobanteRetencionAts documentoSustento = new DocumentoSustentoComprobanteRetencionAts();

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

	public static RetencionAts getRetencion(String pLine) {
		RetencionAts retencion = new RetencionAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		retencion.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		retencion.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		retencion.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		retencion.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		retencion.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO);
		retencion.setCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_RETENCION);
		retencion.setCodigoRetencion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_BASE_RETENCION);
		retencion.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PORCENTAJE_RETENER);
		retencion.setPorcentajeRetener(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_VALOR_RETENIDO);
		retencion.setValorRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FECHA_PAGO_DIV);
		retencion.setFechaPagoDiv(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_IMPUESTO_RENTA_SOC);
		retencion.setImpRentaSoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_EJERCICIO_FISCAL_ULT_DIV);
		retencion.setEjercFisUltDiv(lineProperty.getValue());

		retencion.setFiller(lineProperty.getNewLine().trim());

		return retencion;
	}

	public static ImpuestoAts getImpuesto(String pLine) {
		ImpuestoAts impuesto = new ImpuestoAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		impuesto.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		impuesto.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		impuesto.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		impuesto.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		impuesto.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO_SUSTENTO_IMP);
		impuesto.setCodigoDocSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_PORCENTAJE);
		impuesto.setCodigoPorcentaje(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_BASE_IMPONIBLE);
		impuesto.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TARIFA);
		impuesto.setTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_VALOR_IMPUESTO);
		impuesto.setValorImpuesto(lineProperty.getValue());

		impuesto.setFiller(lineProperty.getNewLine().trim());

		return impuesto;
	}

	public static InformacionAdicionalComprobanteRetencionAts getInformacionAdicionalComprobanteRetencion(String pLine) {
		InformacionAdicionalComprobanteRetencionAts informacionAdicional = new InformacionAdicionalComprobanteRetencionAts();

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
