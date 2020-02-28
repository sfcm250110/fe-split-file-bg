package ec.com.kruger.bean.retencion.v2;

import java.io.Serializable;

public class ImpuestoComprobanteRetencion implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codigoDocumento;
	private String establecimiento;
	private String puntoEmision;
	private String secuencial;
	private String codigo;
	private String codigoRetencion;
	private String baseImponible;
	private String porcentajeRetener;
	private String valorRetenido;
	private String fechaPagoDiv;
	private String impuestoRentaSoc;
	private String ejercicioFiscalUltDiv;
	private String fillerImpuestoComprobanteRetencion;

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

	public String getImpuestoRentaSoc() {
		return impuestoRentaSoc;
	}

	public void setImpuestoRentaSoc(String impuestoRentaSoc) {
		this.impuestoRentaSoc = impuestoRentaSoc;
	}

	public String getEjercicioFiscalUltDiv() {
		return ejercicioFiscalUltDiv;
	}

	public void setEjercicioFiscalUltDiv(String ejercicioFiscalUltDiv) {
		this.ejercicioFiscalUltDiv = ejercicioFiscalUltDiv;
	}

	public String getFillerImpuestoComprobanteRetencion() {
		return fillerImpuestoComprobanteRetencion;
	}

	public void setFillerImpuestoComprobanteRetencion(String fillerImpuestoComprobanteRetencion) {
		this.fillerImpuestoComprobanteRetencion = fillerImpuestoComprobanteRetencion;
	}

	@Override
	public String toString() {
		return "ImpuestoComprobanteRetencion [tipoRegistro=" + tipoRegistro + ", codigoDocumento=" + codigoDocumento + ", establecimiento=" + establecimiento + ", puntoEmision=" + puntoEmision + ", secuencial=" + secuencial + ", codigo=" + codigo + ", codigoRetencion=" + codigoRetencion + ", baseImponible=" + baseImponible + ", porcentajeRetener=" + porcentajeRetener + ", valorRetenido="
				+ valorRetenido + ", fechaPagoDiv=" + fechaPagoDiv + ", impuestoRentaSoc=" + impuestoRentaSoc + ", ejercicioFiscalUltDiv=" + ejercicioFiscalUltDiv + ", fillerImpuestoComprobanteRetencion=" + fillerImpuestoComprobanteRetencion + "]";
	}

}
