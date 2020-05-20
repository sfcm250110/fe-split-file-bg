package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;

public class CabeceraAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String fechaEmision;
	private String horaEmision;
	private String dirEstablecimiento;
	private String tipoIdentificacionRetenido;
	private String razonSocialRetenido;
	private String identificacionRetenido;
	private String peridoFiscal;
	private String numeroGenerado;
	private String fechaVigencia;
	private String oficinaBg;
	private String secuencialBg;
	private String porcentajeIva;
	private String claveAcceso;
	private String parteRelacionada;
	private String localExterior;
	private String formaPago;
	private String totalPago;

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getCodDoc() {
		return codDoc;
	}

	public void setCodDoc(String codDoc) {
		this.codDoc = codDoc;
	}

	public String getEstab() {
		return estab;
	}

	public void setEstab(String estab) {
		this.estab = estab;
	}

	public String getPtoEmision() {
		return ptoEmision;
	}

	public void setPtoEmision(String ptoEmision) {
		this.ptoEmision = ptoEmision;
	}

	public String getSecuencial() {
		return secuencial;
	}

	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getHoraEmision() {
		return horaEmision;
	}

	public void setHoraEmision(String horaEmision) {
		this.horaEmision = horaEmision;
	}

	public String getDirEstablecimiento() {
		return dirEstablecimiento;
	}

	public void setDirEstablecimiento(String dirEstablecimiento) {
		this.dirEstablecimiento = dirEstablecimiento;
	}

	public String getTipoIdentificacionRetenido() {
		return tipoIdentificacionRetenido;
	}

	public void setTipoIdentificacionRetenido(String tipoIdentificacionRetenido) {
		this.tipoIdentificacionRetenido = tipoIdentificacionRetenido;
	}

	public String getRazonSocialRetenido() {
		return razonSocialRetenido;
	}

	public void setRazonSocialRetenido(String razonSocialRetenido) {
		this.razonSocialRetenido = razonSocialRetenido;
	}

	public String getIdentificacionRetenido() {
		return identificacionRetenido;
	}

	public void setIdentificacionRetenido(String identificacionRetenido) {
		this.identificacionRetenido = identificacionRetenido;
	}

	public String getPeridoFiscal() {
		return peridoFiscal;
	}

	public void setPeridoFiscal(String peridoFiscal) {
		this.peridoFiscal = peridoFiscal;
	}

	public String getNumeroGenerado() {
		return numeroGenerado;
	}

	public void setNumeroGenerado(String numeroGenerado) {
		this.numeroGenerado = numeroGenerado;
	}

	public String getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public String getOficinaBg() {
		return oficinaBg;
	}

	public void setOficinaBg(String oficinaBg) {
		this.oficinaBg = oficinaBg;
	}

	public String getSecuencialBg() {
		return secuencialBg;
	}

	public void setSecuencialBg(String secuencialBg) {
		this.secuencialBg = secuencialBg;
	}

	public String getPorcentajeIva() {
		return porcentajeIva;
	}

	public void setPorcentajeIva(String porcentajeIva) {
		this.porcentajeIva = porcentajeIva;
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	public String getParteRelacionada() {
		return parteRelacionada;
	}

	public void setParteRelacionada(String parteRelacionada) {
		this.parteRelacionada = parteRelacionada;
	}

	public String getLocalExterior() {
		return localExterior;
	}

	public void setLocalExterior(String localExterior) {
		this.localExterior = localExterior;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(String totalPago) {
		this.totalPago = totalPago;
	}

	@Override
	public String toString() {
		return "CabeceraAts [tipoRegistro=" + tipoRegistro + ", codDoc=" + codDoc + ", estab=" + estab + ", ptoEmision=" + ptoEmision + ", secuencial=" + secuencial + ", fechaEmision=" + fechaEmision + ", horaEmision=" + horaEmision + ", dirEstablecimiento=" + dirEstablecimiento + ", tipoIdentificacionRetenido=" + tipoIdentificacionRetenido + ", razonSocialRetenido=" + razonSocialRetenido
				+ ", identificacionRetenido=" + identificacionRetenido + ", peridoFiscal=" + peridoFiscal + ", numeroGenerado=" + numeroGenerado + ", fechaVigencia=" + fechaVigencia + ", oficinaBg=" + oficinaBg + ", secuencialBg=" + secuencialBg + ", porcentajeIva=" + porcentajeIva + ", claveAcceso=" + claveAcceso + ", parteRelacionada=" + parteRelacionada + ", localExterior=" + localExterior
				+ ", formaPago=" + formaPago + ", totalPago=" + totalPago + "]";
	}

}
