package ec.com.kruger.util.impl;

import java.io.Serializable;

import ec.com.kruger.bean.retencion.ats.CabeceraAts;
import ec.com.kruger.bean.retencion.ats.DocumentoSustentoAts;
import ec.com.kruger.bean.retencion.ats.ImpuestoAts;
import ec.com.kruger.bean.retencion.ats.InformacionAdicionalAts;
import ec.com.kruger.bean.retencion.ats.RetencionAts;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class ComprobanteRetencionAtsBuildUtil implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	public static CabeceraAts getCabeceraAts(String pLine) {
		CabeceraAts cabeceraAts = new CabeceraAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_ATS_TIPO_REGISTRO);
		cabeceraAts.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_COD_DOC);
		cabeceraAts.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_ESTAB);
		cabeceraAts.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PTO_EMISION);
		cabeceraAts.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_SECUENCIAL);
		cabeceraAts.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_FECHA_EMISION);
		cabeceraAts.setFechaEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_HORA_EMISION);
		cabeceraAts.setHoraEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_DIR_ESTABLECIMIENTO);
		cabeceraAts.setDirEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_TIPO_IDENTIF_RETENIDO);
		cabeceraAts.setTipoIdentificacionRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_RAZON_SOC_RETENIDO);
		cabeceraAts.setRazonSocialRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_ID_RETENIDO);
		cabeceraAts.setIdentificacionRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PERIODO_FISCAL);
		cabeceraAts.setPeridoFiscal(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_NUM_GENERADO);
		cabeceraAts.setNumeroGenerado(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_FECHA_VIGENCIA);
		cabeceraAts.setFechaVigencia(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_OFICINA_BG);
		cabeceraAts.setOficinaBg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_SECUENCIAL_BG);
		cabeceraAts.setSecuencialBg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PORC_IVA);
		cabeceraAts.setPorcentajeIva(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_ACCESO_BG);
		cabeceraAts.setClaveAcceso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PARTEREL);
		cabeceraAts.setParteRelacionada(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_LOCEXT);
		cabeceraAts.setLocalExterior(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_FORMA_PAGO);
		cabeceraAts.setFormaPago(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_TOTAL_PAGO);
		cabeceraAts.setTotalPago(lineProperty.getValue());

		return cabeceraAts;
	}

	public static DocumentoSustentoAts getDocumentoSustentoAts(String pLine) {
		DocumentoSustentoAts documentoSustentoAts = new DocumentoSustentoAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_ATS_TIPO_REGISTRO);
		documentoSustentoAts.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_COD_DOC);
		documentoSustentoAts.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_ESTAB);
		documentoSustentoAts.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PTO_EMISION);
		documentoSustentoAts.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_SECUENCIAL);
		documentoSustentoAts.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_COD_SUSTENTO);
		documentoSustentoAts.setCodigoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_COD_DOC_SUSTENTO);
		documentoSustentoAts.setCodigoDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_NUM_DOC_SUSTENTO);
		documentoSustentoAts.setNumeroDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_FEC_EMI_DOC_SUSTENTO);
		documentoSustentoAts.setFechaEmisionDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_FEC_REGISTRO_CONTABLE);
		documentoSustentoAts.setFechaRegistroContable(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_NUM_AUTDOC_SUSTENTO);
		documentoSustentoAts.setNumeroAutorizacionDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_TOTAL_SIN_IMPUESTO);
		documentoSustentoAts.setTotalSinImpuesto(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_IMPORTE_TOTAL);
		documentoSustentoAts.setImporteTotal(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_TOTAL_COMPROB_REEMB);
		documentoSustentoAts.setTotalComprobanteReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_TOTAL_BASE_IMP_REEMB);
		documentoSustentoAts.setTotalBaseImponibleReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_TOTAL_IMPUESTO_REEMB);
		documentoSustentoAts.setTotalImpuestoReembolso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_TIPO_REGI);
		documentoSustentoAts.setTipoRegimen(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_PAIS_EFECTIVO_PAGO);
		documentoSustentoAts.setPaisEfectivoPago(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_APLIC_CONV_DOBLE_TRIB);
		documentoSustentoAts.setAplicaConvenioDobleTrib(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_PAG_EXT_SUJ_RET_NOM_LEG);
		documentoSustentoAts.setPagoExtSujRetNomLeg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_PAGO_REG_FIS);
		documentoSustentoAts.setPagoRegFis(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_FORMA_PAGO_DOC_SUS);
		documentoSustentoAts.setFormaPagoDocSus(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_COD_IMP_DOC_SUS);
		documentoSustentoAts.setCodImpDocSus(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_COD_PORC_DOC_SUS);
		documentoSustentoAts.setCodPorcDocSus(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_BASE_IMPONIBLE_DOC_SUS);
		documentoSustentoAts.setBaseImponibleDocSus(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_TARIFA_DOC_SUS);
		documentoSustentoAts.setTarifaDocSus(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED07_ATS_VALOR_IMPUESTO_DOC_SUS);
		documentoSustentoAts.setValorImpuestoDocSus(lineProperty.getValue());

		return documentoSustentoAts;
	}

	public static RetencionAts getRetencionAts(String pLine) {
		RetencionAts retencionAts = new RetencionAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_ATS_TIPO_REGISTRO);
		retencionAts.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_COD_DOC);
		retencionAts.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_ESTAB);
		retencionAts.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PTO_EMISION);
		retencionAts.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_SECUENCIAL);
		retencionAts.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_CODIGO);
		retencionAts.setCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_CODIGO_RETENCION);
		retencionAts.setCodigoRetencion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_BASE_IMPONIBLE);
		retencionAts.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_PORCENTAJE_RETENER);
		retencionAts.setPorcentajeRetener(UtilidadesFE.obtenerPorcentajeRetener(lineProperty.getValue()));

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_VALOR_RETENIDO);
		retencionAts.setValorRetenido(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_FECHA_PAGO_DIV);
		retencionAts.setFechaPagoDiv(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_IMP_RENTA_SOC);
		retencionAts.setImpuestoRentaSoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGER07_ATS_EJERC_FIS_ULT_DIV);
		retencionAts.setEjercicioFiscalUltDiv(lineProperty.getValue());

		retencionAts.setFillerRetencionRetencionAts(lineProperty.getNewLine().trim());

		return retencionAts;
	}

	public static ImpuestoAts getImpuestoAts(String pLine) {
		ImpuestoAts impuestoAts = new ImpuestoAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_ATS_TIPO_REGISTRO);
		impuestoAts.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_COD_DOC);
		impuestoAts.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_ESTAB);
		impuestoAts.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PTO_EMISION);
		impuestoAts.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_SECUENCIAL);
		impuestoAts.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_CODIGO_DOCUMENTO_SUSTENTO_IMP);
		impuestoAts.setCodigoDocumentoSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_CODIGO_PORCENTAJE);
		impuestoAts.setCodigoPorcentaje(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_BASE_IMPONIBLE);
		impuestoAts.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_TARIFA);
		impuestoAts.setTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_VALOR_IMPUESTO);
		impuestoAts.setValorImpuesto(lineProperty.getValue());

		impuestoAts.setFillerImpuestoAts(lineProperty.getNewLine().trim());

		return impuestoAts;
	}

	public static InformacionAdicionalAts getInformacionAdicionalAts(String pLine) {
		InformacionAdicionalAts informacionAdicionalAts = new InformacionAdicionalAts();

		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_ATS_TIPO_REGISTRO);
		informacionAdicionalAts.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_COD_DOC);
		informacionAdicionalAts.setCodigoDocumento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_ESTAB);
		informacionAdicionalAts.setEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_PTO_EMISION);
		informacionAdicionalAts.setPuntoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ATS_SECUENCIAL);
		informacionAdicionalAts.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_ATS_INFORMACION_ADICIONAL_INFO_ADICIONAL_1);
		informacionAdicionalAts.setInformacionAdicionalUno(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_ATS_INFORMACION_ADICIONAL_INFO_ADICIONAL_2);
		informacionAdicionalAts.setInformacionAdicionalDos(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_V2_INFORMACION_ADICIONAL_INFO_ADICIONAL_3);
		informacionAdicionalAts.setInformacionAdicionalTres(lineProperty.getValue());

		informacionAdicionalAts.setFillerInformacionAdicional(lineProperty.getNewLine().trim());

		return informacionAdicionalAts;
	}

}
