package ec.com.kruger.util.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ec.com.kruger.bean.factura.formaPago.FormaPago;
import ec.com.kruger.bean.factura.notacredito.AdicionalNC;
import ec.com.kruger.bean.factura.notacredito.CabeceraNC;
import ec.com.kruger.bean.factura.notacredito.DetalleNC;
import ec.com.kruger.bean.factura.notacredito.ImpuestoNC;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class NotaCreditoBuildUtil implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	public static CabeceraNC getCabeceraNotaCredito(String pLine) {
		CabeceraNC cabecera = new CabeceraNC();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEC04_TIPO_REGISTRO);
		cabecera.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_COD_DOC);
		cabecera.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_ESTAB);
		cabecera.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_PTO_EMISION);
		cabecera.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_SECUENCIAL);
		cabecera.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_FECHA_EMISION);
		cabecera.setFechaEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_HORA_EMISION);
		cabecera.setHoraEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_DIR_ESTABLECIMIENTO);
		cabecera.setDirEstablecimiento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_TIPO_IDENTIF_COMPRADOR);
		cabecera.setTipoIdentifComprador(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_RAZON_SOC_COMPRADOR);
		cabecera.setRazonSocComprador(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_IDENTIF_COMPRADOR);
		cabecera.setIdentifComprador(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_RISE);
		cabecera.setRise(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_VALOR_PAGAR);
		cabecera.setValorPagar(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_COD_DOC_MODIF);
		cabecera.setCodDocModif(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_NUM_DOC_MODIF);
		cabecera.setNumDocModif(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_FEC_EMI_DOC_SUSTENTO);
		cabecera.setFecEmiDocSustento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_TOTAL_SIN_IMPUESTO);
		cabecera.setTotalSinImpuesto(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_VALOR_MODIFICACION);
		cabecera.setValorModificacion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_MONEDA);
		cabecera.setMoneda(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_MOTIVO);
		cabecera.setMotivo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_NUM_GENERADO);
		cabecera.setNumGenerado(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_FECHA_VIGENCIA);
		cabecera.setFechaVigencia(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_OFICINA_BG);
		cabecera.setOficinaBg(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_PORC_IVA);
		cabecera.setPorcIva(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEC04_CLAVE_ACCESO_BG);
		cabecera.setClaveAcceso(lineProperty.getValue());
		
		cabecera.setFillerCabNC(lineProperty.getNewLine().trim());

		return cabecera;
	}

	public static ImpuestoNC getImpuestosNotaCredito(String pLine) {
		ImpuestoNC impuesto = new ImpuestoNC();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEI04_TIPO_REGISTRO);
		impuesto.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_COD_DOC);
		impuesto.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_ESTAB);
		impuesto.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_PTO_EMISION);
		impuesto.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_SECUENCIAL);
		impuesto.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_CODIGO);
		impuesto.setCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_CODIGO_PORCENTAJE);
		impuesto.setCodigoPorcentaje(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_BASE_IMPONIBLE);
		impuesto.setBaseImponible(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_VALOR);
		impuesto.setValor(lineProperty.getValue());

		int iteradorFormaPago = Integer.valueOf(UGEI04_FORM_PAGO_ITE).intValue();
		List<FormaPago> listaFormaPago = new ArrayList<FormaPago>();

		for (int i = 0; i < iteradorFormaPago; i++) {
			FormaPago formaPago = new FormaPago();

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_PAG_FORM_PAGO);
			formaPago.setPagFormPago(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_PAG_TOTAL);
			formaPago.setPagTotal(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_PAG_PLAZO);
			formaPago.setPagPlazo(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_PAG_UNIDAD_T);
			formaPago.setPagUnidadT(lineProperty.getValue());

			listaFormaPago.add(formaPago);
		}

		impuesto.setFormaPago(listaFormaPago);

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_COMP_CODIGO);
		impuesto.setCompCodigo(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_COMP_TARIFA);
		impuesto.setCompTarifa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEI04_COMP_SOLIDARIA);
		impuesto.setCompSolidaria(lineProperty.getValue());
		
		impuesto.setFillerImpNC(lineProperty.getNewLine().trim());

		return impuesto;
	}

	public static DetalleNC getDetalleNotaCredito(String pLine) {
		DetalleNC detalle = new DetalleNC();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGED04_TIPO_REGISTRO);
		detalle.setTipoRegistro(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_COD_DOC);
		detalle.setCodigoDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_ESTAB);
		detalle.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_PTO_EMISION);
		detalle.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_SECUENCIAL);
		detalle.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_CODIGO_INTERNO);
		detalle.setCodigoInterno(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_CODIGO_ADICIONAL);
		detalle.setCodigoAdicional(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_DESCRIPCION);
		detalle.setDescripcion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_CANTIDAD);
		detalle.setCantidad(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_PRECIO_UNITARIO);
		detalle.setPrecioUnitario(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_DESCUENTO);
		detalle.setDescuento(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_PRECIO_TOTAL_SIN_IMP);
		detalle.setPrecioTotalSinImp(lineProperty.getValue());

		int impuestoIterator = Integer.valueOf(UGED01_IMP_DET_ITE).intValue();
		List<ImpuestoNC> listaImpuesto = new ArrayList<ImpuestoNC>();

		for (int i = 0; i < impuestoIterator; i++) {
			ImpuestoNC impuesto = new ImpuestoNC();

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_IMP_CODIGO);
			impuesto.setCodigo(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_IMP_CODIGO_PORCENTAJE);
			impuesto.setCodigoPorcentaje(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_IMP_TARIFA);
			impuesto.setTarifa(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_IMP_BASE_IMPONIBLE);
			impuesto.setBaseImponible(lineProperty.getValue());

			lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGED04_IMP_VALOR);
			impuesto.setValor(lineProperty.getValue());

			listaImpuesto.add(impuesto);
		}

		detalle.setImpuestosDetalle(listaImpuesto);
		detalle.setFillerDetNC(lineProperty.getNewLine().trim());

		return detalle;
	}

	public static AdicionalNC getAdicionalNotaCredito(String pLine) {
		AdicionalNC adicional = new AdicionalNC();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, UGEA04_TIPO_REGISTRO);
		adicional.setTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA04_COD_DOC);
		adicional.setCodDoc(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA04_ESTAB);
		adicional.setEstab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA04_PTO_EMISION);
		adicional.setPtoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA04_SECUENCIAL);
		adicional.setSecuencial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA04_INFO_ADICIONAL_1);
		adicional.setInfoAdicional1(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), UGEA04_INFO_ADICIONAL_2);
		adicional.setInfoAdicional2(lineProperty.getValue());
		
		adicional.setFillerAdNC(lineProperty.getNewLine().trim());

		return adicional;
	}

}
