package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;

public class InformacionAdicionalComprobanteRetencionAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codigoDocumento;
	private String establecimiento;
	private String puntoEmision;
	private String secuencial;
	private String informacionAdicionalUno;
	private String informacionAdicionalDos;
	private String fillerInformacionAdicionalComprobanteRetencion;

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

	public String getInformacionAdicionalUno() {
		return informacionAdicionalUno;
	}

	public void setInformacionAdicionalUno(String informacionAdicionalUno) {
		this.informacionAdicionalUno = informacionAdicionalUno;
	}

	public String getInformacionAdicionalDos() {
		return informacionAdicionalDos;
	}

	public void setInformacionAdicionalDos(String informacionAdicionalDos) {
		this.informacionAdicionalDos = informacionAdicionalDos;
	}

	public String getFillerInformacionAdicionalComprobanteRetencion() {
		return fillerInformacionAdicionalComprobanteRetencion;
	}

	public void setFillerInformacionAdicionalComprobanteRetencion(String fillerInformacionAdicionalComprobanteRetencion) {
		this.fillerInformacionAdicionalComprobanteRetencion = fillerInformacionAdicionalComprobanteRetencion;
	}

	@Override
	public String toString() {
		return "InformacionAdicionalComprobanteRetencion [tipoRegistro=" + tipoRegistro + ", codigoDocumento=" + codigoDocumento + ", establecimiento=" + establecimiento + ", puntoEmision=" + puntoEmision + ", secuencial=" + secuencial + ", informacionAdicionalUno=" + informacionAdicionalUno + ", informacionAdicionalDos=" + informacionAdicionalDos
				+ ", fillerInformacionAdicionalComprobanteRetencion=" + fillerInformacionAdicionalComprobanteRetencion + "]";
	}

}
