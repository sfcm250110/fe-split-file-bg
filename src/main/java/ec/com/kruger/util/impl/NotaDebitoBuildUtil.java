package ec.com.kruger.util.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ec.com.kruger.bean.factura.formaPago.FormaPago;
import ec.com.kruger.bean.factura.notadebito.AdicionalND;
import ec.com.kruger.bean.factura.notadebito.CabeceraND;
import ec.com.kruger.bean.factura.notadebito.ImpuestoND;
import ec.com.kruger.bean.factura.notadebito.MotivoND;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class NotaDebitoBuildUtil implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	public static CabeceraND getCabeceraNotaDebito(String pLine) {
		CabeceraND cabecera = new CabeceraND();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC05_TIPO_REGISTRO);
		cabecera.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_COD_DOC);
		cabecera.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_ESTAB);
		cabecera.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_PTO_EMISION);
		cabecera.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_SECUENCIAL);
		cabecera.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_FECHA_EMISION);
		cabecera.setFechaEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_HORA_EMISION);
		cabecera.setHoraEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_DIR_ESTABLECIMIENTO);
		cabecera.setDirEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_TIPO_IDENTIF_COMPRADOR);
		cabecera.setTipoIdentifComprador(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_RAZON_SOC_COMPRADOR);
		cabecera.setRazonSocComprador(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_IDENTIF_COMPRADOR);
		cabecera.setIdentifComprador(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_RISE);
		cabecera.setRise(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_COD_DOC_MODIF);
		cabecera.setCodDocModif(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_NUM_DOC_MODIF);
		cabecera.setNumDocModif(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_FEC_EMI_DOC_SUSTENTO);
		cabecera.setFecEmiDocSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_TOTAL_SIN_IMPUESTOS);
		cabecera.setTotalSinImpuesto(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_VALOR_TOTAL);
		cabecera.setValorTotal(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_NUM_GENERADO);
		cabecera.setNumGenerado(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_FECHA_VIGENCIA);
		cabecera.setFechaVigencia(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_OFICINA_BG);
		cabecera.setOficinaBg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_CLAVE_ACCESO_BG);
		cabecera.setClaveAcceso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_COMP_CODIGO);
		cabecera.setCompCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_COMP_TARIFA);
		cabecera.setComTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_COMP_SOLIDARIA);
		cabecera.setCompSolidario(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC05_VALOR_PAGAR);
		cabecera.setValorPagar(lineProperty.getValue());
		
		cabecera.setFillerCabND(lineProperty.getNewLine().trim());

		return cabecera;
	}

	public static ImpuestoND getImpuestosNotaDebito(String pLine) {
		ImpuestoND impuesto = new ImpuestoND();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEI05_TIPO_REGISTRO);
		impuesto.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_COD_DOC);
		impuesto.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_ESTAB);
		impuesto.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_PTO_EMISION);
		impuesto.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_SECUENCIAL);
		impuesto.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_CODIGO);
		impuesto.setCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_CODIGO_PORCENTAJE);
		impuesto.setCodigoPorcentaje(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_TARIFA);
		impuesto.setTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_BASE_IMPONIBLE);
		impuesto.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_VALOR);
		impuesto.setValor(lineProperty.getValue());

		int iteradorFormaPago = Integer.valueOf(UGEI05_FORM_PAG_ITE).intValue();
		List<FormaPago> listaFormaPago = new ArrayList<FormaPago>();

		for (int i = 0; i < iteradorFormaPago; i++) {
			FormaPago formaPago = new FormaPago();

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_PAG_FORM_PAGO);
			formaPago.setPagFormPago(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_PAG_TOTAL);
			formaPago.setPagTotal(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_PAG_PLAZO);
			formaPago.setPagPlazo(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI05_PAG_UNIDAD_T);
			formaPago.setPagUnidadT(lineProperty.getValue());

			listaFormaPago.add(formaPago);
		}

		impuesto.setFormaPago(listaFormaPago);
		impuesto.setFillerImpND(lineProperty.getNewLine().trim());

		return impuesto;
	}

	public static AdicionalND getAdicionalNotaDebito(String pLine) {
		AdicionalND adicional = new AdicionalND();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEA05_TIPO_REGISTRO);
		adicional.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA05_COD_DOC);
		adicional.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA05_ESTAB);
		adicional.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA05_PTO_EMISION);
		adicional.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA05_SECUENCIAL);
		adicional.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA05_INFO_ADICIONAL_1);
		adicional.setInfoAdicional1(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA05_INFO_ADICIONAL_2);
		adicional.setInfoAdicional2(lineProperty.getValue());
		
		adicional.setFillerAdND(lineProperty.getNewLine().trim());

		return adicional;
	}

	public static MotivoND getMotivoNotaDebito(String pLine) {
		MotivoND motivo = new MotivoND();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEM05_TIPO_REGISTRO);
		motivo.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEM05_COD_DOC);
		motivo.setCodDoc(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEM05_ESTAB);
		motivo.setEstab(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEM05_PTO_EMISION);
		motivo.setPtoEmision(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEM05_SECUENCIAL);
		motivo.setSecuencial(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEM05_RAZON);
		motivo.setRazon(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEM05_VALOR);
		motivo.setValor(lineProperty.getValue());
		
		motivo.setFillerMotND(lineProperty.getNewLine().trim());return motivo;
	}

}
