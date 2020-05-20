package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;

public class DocumentoSustentoAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codigoDocumento;
	private String establecimiento;
	private String puntoEmision;
	private String secuencial;
	private String codigoSustento;
	private String codigoDocumentoSustento;
	private String numeroDocumentoSustento;
	private String fechaEmisionDocumentoSustento;
	private String fechaRegistroContable;
	private String numeroAutorizacionDocumentoSustento;
	private String tipoRegi;
	private String totalSinImpuesto;
	private String importeTotal;
	private String totalComprobanteReembolso;
	private String totalBaseImponibleReembolso;
	private String totalImpuestoReembolso;
	private String tipoRegimen;
	private String paisEfectivoPago;
	private String aplicaConvenioDobleTrib;
	private String pagoExtSujRetNomLeg;
	private String pagoRegFis;
	private String formaPagoDocSus;
	private String codImpDocSus;
	private String codPorcDocSus;
	private String baseImponibleDocSus;
	private String tarifaDocSus;
	private String valorImpuestoDocSus;

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

	public String getCodigoSustento() {
		return codigoSustento;
	}

	public void setCodigoSustento(String codigoSustento) {
		this.codigoSustento = codigoSustento;
	}

	public String getCodigoDocumentoSustento() {
		return codigoDocumentoSustento;
	}

	public void setCodigoDocumentoSustento(String codigoDocumentoSustento) {
		this.codigoDocumentoSustento = codigoDocumentoSustento;
	}

	public String getNumeroDocumentoSustento() {
		return numeroDocumentoSustento;
	}

	public void setNumeroDocumentoSustento(String numeroDocumentoSustento) {
		this.numeroDocumentoSustento = numeroDocumentoSustento;
	}

	public String getFechaEmisionDocumentoSustento() {
		return fechaEmisionDocumentoSustento;
	}

	public void setFechaEmisionDocumentoSustento(String fechaEmisionDocumentoSustento) {
		this.fechaEmisionDocumentoSustento = fechaEmisionDocumentoSustento;
	}

	public String getFechaRegistroContable() {
		return fechaRegistroContable;
	}

	public void setFechaRegistroContable(String fechaRegistroContable) {
		this.fechaRegistroContable = fechaRegistroContable;
	}

	public String getNumeroAutorizacionDocumentoSustento() {
		return numeroAutorizacionDocumentoSustento;
	}

	public void setNumeroAutorizacionDocumentoSustento(String numeroAutorizacionDocumentoSustento) {
		this.numeroAutorizacionDocumentoSustento = numeroAutorizacionDocumentoSustento;
	}

	public String getTipoRegi() {
		return tipoRegi;
	}

	public void setTipoRegi(String tipoRegi) {
		this.tipoRegi = tipoRegi;
	}

	public String getTotalSinImpuesto() {
		return totalSinImpuesto;
	}

	public void setTotalSinImpuesto(String totalSinImpuesto) {
		this.totalSinImpuesto = totalSinImpuesto;
	}

	public String getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(String importeTotal) {
		this.importeTotal = importeTotal;
	}

	public String getTotalComprobanteReembolso() {
		return totalComprobanteReembolso;
	}

	public void setTotalComprobanteReembolso(String totalComprobanteReembolso) {
		this.totalComprobanteReembolso = totalComprobanteReembolso;
	}

	public String getTotalBaseImponibleReembolso() {
		return totalBaseImponibleReembolso;
	}

	public void setTotalBaseImponibleReembolso(String totalBaseImponibleReembolso) {
		this.totalBaseImponibleReembolso = totalBaseImponibleReembolso;
	}

	public String getTotalImpuestoReembolso() {
		return totalImpuestoReembolso;
	}

	public void setTotalImpuestoReembolso(String totalImpuestoReembolso) {
		this.totalImpuestoReembolso = totalImpuestoReembolso;
	}

	public String getTipoRegimen() {
		return tipoRegimen;
	}

	public void setTipoRegimen(String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}

	public String getPaisEfectivoPago() {
		return paisEfectivoPago;
	}

	public void setPaisEfectivoPago(String paisEfectivoPago) {
		this.paisEfectivoPago = paisEfectivoPago;
	}

	public String getAplicaConvenioDobleTrib() {
		return aplicaConvenioDobleTrib;
	}

	public void setAplicaConvenioDobleTrib(String aplicaConvenioDobleTrib) {
		this.aplicaConvenioDobleTrib = aplicaConvenioDobleTrib;
	}

	public String getPagoExtSujRetNomLeg() {
		return pagoExtSujRetNomLeg;
	}

	public void setPagoExtSujRetNomLeg(String pagoExtSujRetNomLeg) {
		this.pagoExtSujRetNomLeg = pagoExtSujRetNomLeg;
	}

	public String getPagoRegFis() {
		return pagoRegFis;
	}

	public void setPagoRegFis(String pagoRegFis) {
		this.pagoRegFis = pagoRegFis;
	}

	public String getFormaPagoDocSus() {
		return formaPagoDocSus;
	}

	public void setFormaPagoDocSus(String formaPagoDocSus) {
		this.formaPagoDocSus = formaPagoDocSus;
	}

	public String getCodImpDocSus() {
		return codImpDocSus;
	}

	public void setCodImpDocSus(String codImpDocSus) {
		this.codImpDocSus = codImpDocSus;
	}

	public String getCodPorcDocSus() {
		return codPorcDocSus;
	}

	public void setCodPorcDocSus(String codPorcDocSus) {
		this.codPorcDocSus = codPorcDocSus;
	}

	public String getBaseImponibleDocSus() {
		return baseImponibleDocSus;
	}

	public void setBaseImponibleDocSus(String baseImponibleDocSus) {
		this.baseImponibleDocSus = baseImponibleDocSus;
	}

	public String getTarifaDocSus() {
		return tarifaDocSus;
	}

	public void setTarifaDocSus(String tarifaDocSus) {
		this.tarifaDocSus = tarifaDocSus;
	}

	public String getValorImpuestoDocSus() {
		return valorImpuestoDocSus;
	}

	public void setValorImpuestoDocSus(String valorImpuestoDocSus) {
		this.valorImpuestoDocSus = valorImpuestoDocSus;
	}

	@Override
	public String toString() {
		return "DocumentoSustentoAts [tipoRegistro=" + tipoRegistro + ", codigoDocumento=" + codigoDocumento + ", establecimiento=" + establecimiento + ", puntoEmision=" + puntoEmision + ", secuencial=" + secuencial + ", codigoSustento=" + codigoSustento + ", codigoDocumentoSustento=" + codigoDocumentoSustento + ", numeroDocumentoSustento=" + numeroDocumentoSustento
				+ ", fechaEmisionDocumentoSustento=" + fechaEmisionDocumentoSustento + ", fechaRegistroContable=" + fechaRegistroContable + ", numeroAutorizacionDocumentoSustento=" + numeroAutorizacionDocumentoSustento + ", tipoRegi=" + tipoRegi + ", totalSinImpuesto=" + totalSinImpuesto + ", importeTotal=" + importeTotal + ", totalComprobanteReembolso=" + totalComprobanteReembolso
				+ ", totalBaseImponibleReembolso=" + totalBaseImponibleReembolso + ", totalImpuestoReembolso=" + totalImpuestoReembolso + ", tipoRegimen=" + tipoRegimen + ", paisEfectivoPago=" + paisEfectivoPago + ", aplicaConvenioDobleTrib=" + aplicaConvenioDobleTrib + ", pagoExtSujRetNomLeg=" + pagoExtSujRetNomLeg + ", pagoRegFis=" + pagoRegFis + ", formaPagoDocSus=" + formaPagoDocSus
				+ ", codImpDocSus=" + codImpDocSus + ", codPorcDocSus=" + codPorcDocSus + ", baseImponibleDocSus=" + baseImponibleDocSus + ", tarifaDocSus=" + tarifaDocSus + ", valorImpuestoDocSus=" + valorImpuestoDocSus + "]";
	}

}
