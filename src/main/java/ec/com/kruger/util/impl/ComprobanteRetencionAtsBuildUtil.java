package ec.com.kruger.util.impl;

import java.io.Serializable;

import ec.com.kruger.bean.retencion.ats.CabeceraComprobanteRetencionAts;
import ec.com.kruger.bean.retencion.ats.DocumentoSustentoComprobanteRetencionAts;
import ec.com.kruger.bean.retencion.ats.ImpuestoAts;
import ec.com.kruger.bean.retencion.ats.InformacionAdicionalComprobanteRetencionAts;
import ec.com.kruger.bean.retencion.ats.RetencionAts;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class ComprobanteRetencionAtsBuildUtil implements DocumentTransformUtil, Serializable {

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

	public static RetencionAts getRetencionAts(String pLine) {
		RetencionAts retencionAts = new RetencionAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		retencionAts.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		retencionAts.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		retencionAts.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		retencionAts.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		retencionAts.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO);
		retencionAts.setCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_RETENCION);
		retencionAts.setCodigoRetencion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_BASE_RETENCION);
		retencionAts.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PORCENTAJE_RETENER);
		retencionAts.setPorcentajeRetener(UtilidadesFE.obtenerPorcentajeRetener(lineProperty.getValue()));

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_VALOR_RETENIDO);
		retencionAts.setValorRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_FECHA_PAGO_DIV);
		retencionAts.setFechaPagoDiv(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_IMPUESTO_RENTA_SOC);
		retencionAts.setImpuestoRentaSoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_EJERCICIO_FISCAL_ULT_DIV);
		retencionAts.setEjercicioFiscalUltDiv(lineProperty.getValue());

		retencionAts.setFillerRetencionRetencionAts(lineProperty.getNewLine().trim());

		return retencionAts;
	}

	public static ImpuestoAts getImpuestoAts(String pLine) {
		ImpuestoAts impuestoAts = new ImpuestoAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_V2_TIPO_REGISTRO);
		impuestoAts.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO);
		impuestoAts.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_ESTABLECIMIENTO);
		impuestoAts.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_PUNTO_EMISION);
		impuestoAts.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_SECUENCIAL);
		impuestoAts.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_DOCUMENTO_SUSTENTO_IMP);
		impuestoAts.setCodigoDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_CODIGO_PORCENTAJE);
		impuestoAts.setCodigoPorcentaje(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_BASE_IMPONIBLE);
		impuestoAts.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_TARIFA);
		impuestoAts.setTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_V2_VALOR_IMPUESTO);
		impuestoAts.setValorImpuesto(lineProperty.getValue());

		impuestoAts.setFillerImpuestoAts(lineProperty.getNewLine().trim());

		return impuestoAts;
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
