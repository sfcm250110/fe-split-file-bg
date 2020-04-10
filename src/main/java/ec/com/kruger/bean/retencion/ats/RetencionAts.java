package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;

public class RetencionAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String codigo;
	private String codigoRetencion;
	private String baseImponible;
	private String porcentajeRetener;
	private String valorRetenido;
	private String fechaPagoDiv;
	private String impRentaSoc;
	private String ejercFisUltDiv;
	private String filler;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoRetencion() {
		return codigoRetencion;
	}

	public void setCodigoRetencion(String codigoRetencion) {
		this.codigoRetencion = codigoRetencion;
	}

	public String getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getPorcentajeRetener() {
		return porcentajeRetener;
	}

	public void setPorcentajeRetener(String porcentajeRetener) {
		this.porcentajeRetener = porcentajeRetener;
	}

	public String getValorRetenido() {
		return valorRetenido;
	}

	public void setValorRetenido(String valorRetenido) {
		this.valorRetenido = valorRetenido;
	}

	public String getFechaPagoDiv() {
		return fechaPagoDiv;
	}

	public void setFechaPagoDiv(String fechaPagoDiv) {
		this.fechaPagoDiv = fechaPagoDiv;
	}

	public String getImpRentaSoc() {
		return impRentaSoc;
	}

	public void setImpRentaSoc(String impRentaSoc) {
		this.impRentaSoc = impRentaSoc;
	}

	public String getEjercFisUltDiv() {
		return ejercFisUltDiv;
	}

	public void setEjercFisUltDiv(String ejercFisUltDiv) {
		this.ejercFisUltDiv = ejercFisUltDiv;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	@Override
	public String toString() {
		return "RetencionAts [tipoRegistro=" + tipoRegistro + ", codDoc=" + codDoc + ", estab=" + estab + ", ptoEmision=" + ptoEmision + ", secuencial=" + secuencial + ", codigo=" + codigo + ", codigoRetencion=" + codigoRetencion + ", baseImponible=" + baseImponible + ", porcentajeRetener=" + porcentajeRetener + ", valorRetenido=" + valorRetenido + ", fechaPagoDiv=" + fechaPagoDiv
				+ ", impRentaSoc=" + impRentaSoc + ", ejercFisUltDiv=" + ejercFisUltDiv + ", filler=" + filler + "]";
	}

}
