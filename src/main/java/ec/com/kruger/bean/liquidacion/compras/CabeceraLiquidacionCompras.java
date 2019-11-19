package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;

public class CabeceraLiquidacionCompras implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String fechaEmision;
	private String horaEmision;
	private String dirEstablecimiento;
	private String tipoIdentificacionProveedor;
	private String razonSocialProveedor;
	private String identificacionProveedor;
	private String direccionProveedor;
	private String totalSinImpuesto;
	private String totalDescuento;
	private String codigoDocumentoReebolso;
	private String totalComprobanteReebolso;
	private String totalBaseImponibleReebolso;
	private String totalImpuestoReembolso;
	private String importeTotal;
	private String moneda;
	private String fechaVigencia;
	private String oficinaBg;
	private String porcentajeIva;
	private String claveAcceso;
	private String fillerCabeceraLiquidacionCompras;

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

	public String getTipoIdentificacionProveedor() {
		return tipoIdentificacionProveedor;
	}

	public void setTipoIdentificacionProveedor(String tipoIdentificacionProveedor) {
		this.tipoIdentificacionProveedor = tipoIdentificacionProveedor;
	}

	public String getRazonSocialProveedor() {
		return razonSocialProveedor;
	}

	public void setRazonSocialProveedor(String razonSocialProveedor) {
		this.razonSocialProveedor = razonSocialProveedor;
	}

	public String getIdentificacionProveedor() {
		return identificacionProveedor;
	}

	public void setIdentificacionProveedor(String identificacionProveedor) {
		this.identificacionProveedor = identificacionProveedor;
	}

	public String getDireccionProveedor() {
		return direccionProveedor;
	}

	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	public String getTotalSinImpuesto() {
		return totalSinImpuesto;
	}

	public void setTotalSinImpuesto(String totalSinImpuesto) {
		this.totalSinImpuesto = totalSinImpuesto;
	}

	public String getTotalDescuento() {
		return totalDescuento;
	}

	public void setTotalDescuento(String totalDescuento) {
		this.totalDescuento = totalDescuento;
	}

	public String getCodigoDocumentoReebolso() {
		return codigoDocumentoReebolso;
	}

	public void setCodigoDocumentoReebolso(String codigoDocumentoReebolso) {
		this.codigoDocumentoReebolso = codigoDocumentoReebolso;
	}

	public String getTotalComprobanteReebolso() {
		return totalComprobanteReebolso;
	}

	public void setTotalComprobanteReebolso(String totalComprobanteReebolso) {
		this.totalComprobanteReebolso = totalComprobanteReebolso;
	}

	public String getTotalBaseImponibleReebolso() {
		return totalBaseImponibleReebolso;
	}

	public void setTotalBaseImponibleReebolso(String totalBaseImponibleReebolso) {
		this.totalBaseImponibleReebolso = totalBaseImponibleReebolso;
	}

	public String getTotalImpuestoReembolso() {
		return totalImpuestoReembolso;
	}

	public void setTotalImpuestoReembolso(String totalImpuestoReembolso) {
		this.totalImpuestoReembolso = totalImpuestoReembolso;
	}

	public String getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(String importeTotal) {
		this.importeTotal = importeTotal;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
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

	public String getFillerCabeceraLiquidacionCompras() {
		return fillerCabeceraLiquidacionCompras;
	}

	public void setFillerCabeceraLiquidacionCompras(String fillerCabeceraLiquidacionCompras) {
		this.fillerCabeceraLiquidacionCompras = fillerCabeceraLiquidacionCompras;
	}

	@Override
	public String toString() {
		return "CabeceraLiquidacionCompras [tipoRegistro=" + tipoRegistro + ", codDoc=" + codDoc + ", estab=" + estab + ", ptoEmision=" + ptoEmision + ", secuencial=" + secuencial + ", fechaEmision=" + fechaEmision + ", horaEmision=" + horaEmision + ", dirEstablecimiento=" + dirEstablecimiento + ", tipoIdentificacionProveedor=" + tipoIdentificacionProveedor + ", razonSocialProveedor="
				+ razonSocialProveedor + ", identificacionProveedor=" + identificacionProveedor + ", direccionProveedor=" + direccionProveedor + ", totalSinImpuesto=" + totalSinImpuesto + ", totalDescuento=" + totalDescuento + ", codigoDocumentoReebolso=" + codigoDocumentoReebolso + ", totalComprobanteReebolso=" + totalComprobanteReebolso + ", totalBaseImponibleReebolso="
				+ totalBaseImponibleReebolso + ", totalImpuestoReembolso=" + totalImpuestoReembolso + ", importeTotal=" + importeTotal + ", moneda=" + moneda + ", fechaVigencia=" + fechaVigencia + ", oficinaBg=" + oficinaBg + ", porcentajeIva=" + porcentajeIva + ", claveAcceso=" + claveAcceso + ", fillerCabeceraLiquidacionCompras=" + fillerCabeceraLiquidacionCompras + "]";
	}

}
