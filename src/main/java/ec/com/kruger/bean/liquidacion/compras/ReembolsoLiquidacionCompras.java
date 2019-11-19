package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;
import java.util.List;

public class ReembolsoLiquidacionCompras implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codigoDocumento;
	private String establecimiento;
	private String puntoEmision;
	private String secuencial;
	private String tipoIdentificacionProveedor;
	private String identificacionProveedor;
	private String codigoPaisPagoProveedor;
	private String tipoProveedoReembolsor;
	private String codigoDocumentoReembolso;
	private String establecimientoDocumentoReembolso;
	private String puntoEmisionDocumentoReembolso;
	private String secuencialDocumentoReembolso;
	private String fechaEmisionDocumentoReembolso;
	private String numeroAutorizacionDocumentoReembolso;
	private String fillerDetalleLiquidacionCompras;
	private List<ImpuestoReembolso> impuestosReembolso;

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

	public String getTipoIdentificacionProveedor() {
		return tipoIdentificacionProveedor;
	}

	public void setTipoIdentificacionProveedor(String tipoIdentificacionProveedor) {
		this.tipoIdentificacionProveedor = tipoIdentificacionProveedor;
	}

	public String getIdentificacionProveedor() {
		return identificacionProveedor;
	}

	public void setIdentificacionProveedor(String identificacionProveedor) {
		this.identificacionProveedor = identificacionProveedor;
	}

	public String getCodigoPaisPagoProveedor() {
		return codigoPaisPagoProveedor;
	}

	public void setCodigoPaisPagoProveedor(String codigoPaisPagoProveedor) {
		this.codigoPaisPagoProveedor = codigoPaisPagoProveedor;
	}

	public String getTipoProveedoReembolsor() {
		return tipoProveedoReembolsor;
	}

	public void setTipoProveedoReembolsor(String tipoProveedoReembolsor) {
		this.tipoProveedoReembolsor = tipoProveedoReembolsor;
	}

	public String getCodigoDocumentoReembolso() {
		return codigoDocumentoReembolso;
	}

	public void setCodigoDocumentoReembolso(String codigoDocumentoReembolso) {
		this.codigoDocumentoReembolso = codigoDocumentoReembolso;
	}

	public String getSecuencialDocumentoReembolso() {
		return secuencialDocumentoReembolso;
	}

	public void setSecuencialDocumentoReembolso(String secuencialDocumentoReembolso) {
		this.secuencialDocumentoReembolso = secuencialDocumentoReembolso;
	}

	public String getFechaEmisionDocumentoReembolso() {
		return fechaEmisionDocumentoReembolso;
	}

	public void setFechaEmisionDocumentoReembolso(String fechaEmisionDocumentoReembolso) {
		this.fechaEmisionDocumentoReembolso = fechaEmisionDocumentoReembolso;
	}

	public String getNumeroAutorizacionDocumentoReembolso() {
		return numeroAutorizacionDocumentoReembolso;
	}

	public void setNumeroAutorizacionDocumentoReembolso(String numeroAutorizacionDocumentoReembolso) {
		this.numeroAutorizacionDocumentoReembolso = numeroAutorizacionDocumentoReembolso;
	}

	public String getFillerDetalleLiquidacionCompras() {
		return fillerDetalleLiquidacionCompras;
	}

	public void setFillerDetalleLiquidacionCompras(String fillerDetalleLiquidacionCompras) {
		this.fillerDetalleLiquidacionCompras = fillerDetalleLiquidacionCompras;
	}

	public List<ImpuestoReembolso> getImpuestosReembolso() {
		return impuestosReembolso;
	}

	public void setImpuestosReembolso(List<ImpuestoReembolso> impuestosReembolso) {
		this.impuestosReembolso = impuestosReembolso;
	}

	public String getEstablecimientoDocumentoReembolso() {
		return establecimientoDocumentoReembolso;
	}

	public void setEstablecimientoDocumentoReembolso(String establecimientoDocumentoReembolso) {
		this.establecimientoDocumentoReembolso = establecimientoDocumentoReembolso;
	}

	public String getPuntoEmisionDocumentoReembolso() {
		return puntoEmisionDocumentoReembolso;
	}

	public void setPuntoEmisionDocumentoReembolso(String puntoEmisionDocumentoReembolso) {
		this.puntoEmisionDocumentoReembolso = puntoEmisionDocumentoReembolso;
	}

	@Override
	public String toString() {
		return "ReembolsoLiquidacionCompras [tipoRegistro=" + tipoRegistro + ", codigoDocumento=" + codigoDocumento + ", establecimiento=" + establecimiento + ", puntoEmision=" + puntoEmision + ", secuencial=" + secuencial + ", tipoIdentificacionProveedor=" + tipoIdentificacionProveedor + ", identificacionProveedor=" + identificacionProveedor + ", codigoPaisPagoProveedor="
				+ codigoPaisPagoProveedor + ", tipoProveedoReembolsor=" + tipoProveedoReembolsor + ", codigoDocumentoReembolso=" + codigoDocumentoReembolso + ", establecimientoDocumentoReembolso=" + establecimientoDocumentoReembolso + ", puntoEmisionDocumentoReembolso=" + puntoEmisionDocumentoReembolso + ", secuencialDocumentoReembolso=" + secuencialDocumentoReembolso
				+ ", fechaEmisionDocumentoReembolso=" + fechaEmisionDocumentoReembolso + ", numeroAutorizacionDocumentoReembolso=" + numeroAutorizacionDocumentoReembolso + ", fillerDetalleLiquidacionCompras=" + fillerDetalleLiquidacionCompras + ", impuestosReembolso=" + impuestosReembolso + "]";
	}

}
