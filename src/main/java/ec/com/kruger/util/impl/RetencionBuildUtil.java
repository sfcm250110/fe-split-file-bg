package ec.com.kruger.util.impl;

import java.io.Serializable;
import java.util.Objects;

import ec.com.kruger.bean.factura.retencion.AdicionalR;
import ec.com.kruger.bean.factura.retencion.CabeceraR;
import ec.com.kruger.bean.factura.retencion.ImpuestoR;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class RetencionBuildUtil implements DocumentTransformUtil, Serializable {
	
	private static final long serialVersionUID = 1L;

	public static CabeceraR getCabeceraRetencion(String pLine) {
		CabeceraR cabecera = new CabeceraR();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC07_TIPO_REGISTRO);
		cabecera.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_COD_DOC);
		cabecera.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ESTAB);
		cabecera.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_PTO_EMISION);
		cabecera.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_SECUENCIAL);
		cabecera.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_FECHA_EMISION);
		cabecera.setFechaEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_HORA_EMISION);
		cabecera.setHoraEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_DIR_ESTABLECIMIENTO);
		cabecera.setDirEstablecimiento(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_TIPO_IDENTIF_RETENIDO);
		cabecera.setTipoIdentifRetenido(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_RAZON_SOC_RETENIDO);
		cabecera.setRazonSocRetenido(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_ID_RETENIDO);
		cabecera.setIdRetenido(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_PERIODO_FISCAL);
		cabecera.setPeriodoFiscal(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_NUM_GENERADO);
		cabecera.setNumGenerado(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_FECHA_VIGENCIA);
		cabecera.setFechaVigencia(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_OFICINA_BG);
		cabecera.setOficinaBg(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_SECUENCIAL_BG);
		cabecera.setSecuencialBg(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_PORC_IVA);
		cabecera.setPorcIva(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC07_CLAVE_ACCESO_BG);
		cabecera.setClaveAcceso(lineProperty.getValue());
		
		cabecera.setFillerCabRet(lineProperty.getNewLine().trim());
		
		return cabecera;
	}

	public static ImpuestoR getImpuestosRetencion(String pLine) {
		ImpuestoR impuesto = new ImpuestoR();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEI07_TIPO_REGISTRO);
		impuesto.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_COD_DOC);
		impuesto.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_ESTAB);
		impuesto.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_PTO_EMISION);
		impuesto.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_SECUENCIAL);
		impuesto.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_CODIGO);
		impuesto.setCodigo(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_CODIGO_RETENCION);
		impuesto.setCodigoRetencion(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_BASE_IMPONIBLE);
		impuesto.setBaseImponible(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_PORCENTAJE_RETENER);
		impuesto.setPorcentajeRetener(obtenerPorcentajeRetener(lineProperty.getValue()));
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_VALOR_RETENIDO);
		impuesto.setValorRetenido(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_COD_DOC_SUSTENTO);
		impuesto.setCodDocSustento(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_NUM_DOC_SUSTENTO);
		impuesto.setNumDocSustento(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI07_FEC_EMI_DOC_SUSTENTO);
		impuesto.setFecEmiDocSustento(lineProperty.getValue());
		
		impuesto.setFillerImpRet(lineProperty.getNewLine().trim());
		
		return impuesto;
	}

	public static AdicionalR getAdicionalRetencion(String pLine) {
		AdicionalR adicional = new AdicionalR();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEA07_TIPO_REGISTRO);
		adicional.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_COD_DOC);
		adicional.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_ESTAB);
		adicional.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_PTO_EMISION);
		adicional.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_SECUENCIAL);
		adicional.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_INFO_ADICIONAL_1);
		adicional.setInfoAdicional1(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA07_INFO_ADICIONAL_2);
		adicional.setInfoAdicional2(lineProperty.getValue());
		
		adicional.setFillerAdRet(lineProperty.getNewLine().trim());
		
		return adicional;
	}
	
	private static String obtenerPorcentajeRetener(String pValor) {
		String porcentajeRetener = pValor;
		
		if (Objects.nonNull(pValor) && !pValor.isEmpty()) {
			if (Integer.parseInt(pValor) > 100) {
				Double porcentajeRetenerDecimal = Double.parseDouble(pValor) / 100; 
				porcentajeRetener = porcentajeRetenerDecimal.toString();
			}
		}
		
		return porcentajeRetener;
	}

}
