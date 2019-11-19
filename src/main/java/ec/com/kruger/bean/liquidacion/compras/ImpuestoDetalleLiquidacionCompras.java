package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;

public class ImpuestoDetalleLiquidacionCompras implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigo;
	private String codigoPorcentaje;
	private String tarifa;
	private String baseImponible;
	private String valor;
	private String fillerImpuestoDetalleLiquidacionCompras;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoPorcentaje() {
		return codigoPorcentaje;
	}

	public void setCodigoPorcentaje(String codigoPorcentaje) {
		this.codigoPorcentaje = codigoPorcentaje;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFillerImpuestoDetalleLiquidacionCompras() {
		return fillerImpuestoDetalleLiquidacionCompras;
	}

	public void setFillerImpuestoDetalleLiquidacionCompras(String fillerImpuestoDetalleLiquidacionCompras) {
		this.fillerImpuestoDetalleLiquidacionCompras = fillerImpuestoDetalleLiquidacionCompras;
	}

	@Override
	public String toString() {
		return "ImpuestoDetalleLiquidacionCompras [codigo=" + codigo + ", codigoPorcentaje=" + codigoPorcentaje + ", tarifa=" + tarifa + ", baseImponible=" + baseImponible + ", valor=" + valor + ", fillerImpuestoDetalleLiquidacionCompras=" + fillerImpuestoDetalleLiquidacionCompras + "]";
	}

}
