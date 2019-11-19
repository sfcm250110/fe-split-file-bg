package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;

public class ImpuestoReembolso implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigo;
	private String codigoPorcentaje;
	private String tarifa;
	private String baseImponible;
	private String impuestoReembolso;
	private String fillerImpuestoReembolso;

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

	public String getImpuestoReembolso() {
		return impuestoReembolso;
	}

	public void setImpuestoReembolso(String impuestoReembolso) {
		this.impuestoReembolso = impuestoReembolso;
	}

	public String getFillerImpuestoReembolso() {
		return fillerImpuestoReembolso;
	}

	public void setFillerImpuestoReembolso(String fillerImpuestoReembolso) {
		this.fillerImpuestoReembolso = fillerImpuestoReembolso;
	}

	@Override
	public String toString() {
		return "ImpuestoReembolso [codigo=" + codigo + ", codigoPorcentaje=" + codigoPorcentaje + ", tarifa=" + tarifa + ", baseImponible=" + baseImponible + ", impuestoReembolso=" + impuestoReembolso + ", fillerImpuestoReembolso=" + fillerImpuestoReembolso + "]";
	}

}
