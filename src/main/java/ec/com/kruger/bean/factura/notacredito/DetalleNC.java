package ec.com.kruger.bean.factura.notacredito;

import java.io.Serializable;
import java.util.List;

public class DetalleNC implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codigoDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String codigoInterno;
	private String codigoAdicional;
	private String descripcion;
	private String cantidad;
	private String precioUnitario;
	private String descuento;
	private String precioTotalSinImp;

	@Deprecated
	private String impCodigo;

	@Deprecated
	private String impCodigoPorcentaje;

	@Deprecated
	private String impTarifa;

	@Deprecated
	private String impBaseImponible;

	@Deprecated
	private String impValor;
	private List<ImpuestoNC> impuestosDetalle;
	private String fillerDetNC;

	public String getTipoRegistro() {
		return this.tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getCodigoDoc() {
		return this.codigoDoc;
	}

	public void setCodigoDoc(String codigoDoc) {
		this.codigoDoc = codigoDoc;
	}

	public String getEstab() {
		return this.estab;
	}

	public void setEstab(String estab) {
		this.estab = estab;
	}

	public String getPtoEmision() {
		return this.ptoEmision;
	}

	public void setPtoEmision(String ptoEmision) {
		this.ptoEmision = ptoEmision;
	}

	public String getSecuencial() {
		return this.secuencial;
	}

	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}

	public String getCodigoInterno() {
		return this.codigoInterno;
	}

	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	public String getCodigoAdicional() {
		return this.codigoAdicional;
	}

	public void setCodigoAdicional(String codigoAdicional) {
		this.codigoAdicional = codigoAdicional;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getPrecioUnitario() {
		return this.precioUnitario;
	}

	public void setPrecioUnitario(String precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getDescuento() {
		return this.descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getPrecioTotalSinImp() {
		return this.precioTotalSinImp;
	}

	public void setPrecioTotalSinImp(String precioTotalSinImp) {
		this.precioTotalSinImp = precioTotalSinImp;
	}

	public String getImpCodigo() {
		return this.impCodigo;
	}

	public void setImpCodigo(String impCodigo) {
		this.impCodigo = impCodigo;
	}

	public String getImpCodigoPorcentaje() {
		return this.impCodigoPorcentaje;
	}

	public void setImpCodigoPorcentaje(String impCodigoPorcentaje) {
		this.impCodigoPorcentaje = impCodigoPorcentaje;
	}

	public String getImpTarifa() {
		return this.impTarifa;
	}

	public void setImpTarifa(String impTarifa) {
		this.impTarifa = impTarifa;
	}

	public String getImpBaseImponible() {
		return this.impBaseImponible;
	}

	public void setImpBaseImponible(String impBaseImponible) {
		this.impBaseImponible = impBaseImponible;
	}

	public String getImpValor() {
		return this.impValor;
	}

	public void setImpValor(String impValor) {
		this.impValor = impValor;
	}

	public List<ImpuestoNC> getImpuestosDetalle() {
		return this.impuestosDetalle;
	}

	public void setImpuestosDetalle(List<ImpuestoNC> impuestosDetalle) {
		this.impuestosDetalle = impuestosDetalle;
	}

	public String getFillerDetNC() {
		return this.fillerDetNC;
	}

	public void setFillerDetNC(String fillerDetNC) {
		this.fillerDetNC = fillerDetNC;
	}

	public String toString() {
		return "DetalleNC{tipoRegistro=" + this.tipoRegistro + ", codigoDoc=" + this.codigoDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", codigoInterno=" + this.codigoInterno + ", codigoAdicional=" + this.codigoAdicional + ", descripcion=" + this.descripcion + ", cantidad="
				+ this.cantidad + ", precioUnitario=" + this.precioUnitario + ", descuento=" + this.descuento + ", precioTotalSinImp=" + this.precioTotalSinImp + ", impCodigo=" + this.impCodigo + ", impCodigoPorcentaje=" + this.impCodigoPorcentaje + ", impTarifa=" + this.impTarifa + ", impBaseImponible=" + this.impBaseImponible + ", impValor="
				+ this.impValor + ", impuestosDetalle=" + this.impuestosDetalle + ", fillerDetNC=" + this.fillerDetNC + '}';
	}
	
}