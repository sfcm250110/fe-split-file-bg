package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;
import java.util.List;

import ec.com.kruger.bean.factura.formaPago.FormaPago;

public class ImpuestoLiquidacionCompras implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codigoDocumento;
	private String establecimiento;
	private String puntoEmision;
	private String secuencial;
	private String totalCodigo;
	private String totalCodigoPorcentaje;
	private String totalDescuentoAdicional;
	private String totalBaseImponible;
	private String totalTarifa;
	private String totalValor;
	private List<FormaPago> formasPago;
	private String filler;

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

	public String getTotalCodigo() {
		return totalCodigo;
	}

	public void setTotalCodigo(String totalCodigo) {
		this.totalCodigo = totalCodigo;
	}

	public String getTotalCodigoPorcentaje() {
		return totalCodigoPorcentaje;
	}

	public void setTotalCodigoPorcentaje(String totalCodigoPorcentaje) {
		this.totalCodigoPorcentaje = totalCodigoPorcentaje;
	}

	public String getTotalDescuentoAdicional() {
		return totalDescuentoAdicional;
	}

	public void setTotalDescuentoAdicional(String totalDescuentoAdicional) {
		this.totalDescuentoAdicional = totalDescuentoAdicional;
	}

	public String getTotalBaseImponible() {
		return totalBaseImponible;
	}

	public void setTotalBaseImponible(String totalBaseImponible) {
		this.totalBaseImponible = totalBaseImponible;
	}

	public String getTotalTarifa() {
		return totalTarifa;
	}

	public void setTotalTarifa(String totalTarifa) {
		this.totalTarifa = totalTarifa;
	}

	public String getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(String totalValor) {
		this.totalValor = totalValor;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public List<FormaPago> getFormasPago() {
		return formasPago;
	}

	public void setFormasPago(List<FormaPago> formasPago) {
		this.formasPago = formasPago;
	}

	@Override
	public String toString() {
		return "ImpuestoLiquidacionCompras [tipoRegistro=" + tipoRegistro + ", codigoDocumento=" + codigoDocumento + ", establecimiento=" + establecimiento + ", puntoEmision=" + puntoEmision + ", secuencial=" + secuencial + ", totalCodigo=" + totalCodigo + ", totalCodigoPorcentaje=" + totalCodigoPorcentaje + ", totalDescuentoAdicional=" + totalDescuentoAdicional + ", totalBaseImponible="
				+ totalBaseImponible + ", totalTarifa=" + totalTarifa + ", totalValor=" + totalValor + ", formasPago=" + formasPago + ", filler=" + filler + "]";
	}

}
