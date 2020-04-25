package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;

public class ImpuestoAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codigoDocumento;
	private String establecimiento;
	private String puntoEmision;
	private String secuencial;
	private String codigoDocumentoSustento;
	private String codigoPorcentaje;
	private String baseImponible;
	private String tarifa;
	private String valorImpuesto;
	private String fillerImpuestoAts;

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getCodigoDocumento() {
		return codigoDocumento;
	}

	public void setCodigoDocumento(String codigoDocumento) {
		this.codigoDocumento = codigoDocumento;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public String getPuntoEmision() {
		return puntoEmision;
	}

	public void setPuntoEmision(String puntoEmision) {
		this.puntoEmision = puntoEmision;
	}

	public String getSecuencial() {
		return secuencial;
	}

	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}

	public String getCodigoDocumentoSustento() {
		return codigoDocumentoSustento;
	}

	public void setCodigoDocumentoSustento(String codigoDocumentoSustento) {
		this.codigoDocumentoSustento = codigoDocumentoSustento;
	}

	public String getCodigoPorcentaje() {
		return codigoPorcentaje;
	}

	public void setCodigoPorcentaje(String codigoPorcentaje) {
		this.codigoPorcentaje = codigoPorcentaje;
	}

	public String getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getValorImpuesto() {
		return valorImpuesto;
	}

	public void setValorImpuesto(String valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}

	public String getFillerImpuestoAts() {
		return fillerImpuestoAts;
	}

	public void setFillerImpuestoAts(String fillerImpuestoAts) {
		this.fillerImpuestoAts = fillerImpuestoAts;
	}

	@Override
	public String toString() {
		return "ImpuestoAts [tipoRegistro=" + tipoRegistro + ", codigoDocumento=" + codigoDocumento + ", establecimiento=" + establecimiento + ", puntoEmision=" + puntoEmision + ", secuencial=" + secuencial + ", codigoDocumentoSustento=" + codigoDocumentoSustento + ", codigoPorcentaje=" + codigoPorcentaje + ", baseImponible=" + baseImponible + ", tarifa=" + tarifa + ", valorImpuesto="
				+ valorImpuesto + ", fillerImpuestoAts=" + fillerImpuestoAts + "]";
	}

}
