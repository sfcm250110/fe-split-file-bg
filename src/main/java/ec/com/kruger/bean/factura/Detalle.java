package ec.com.kruger.bean.factura;

import java.io.Serializable;
import java.util.List;

public class Detalle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codigoDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String codigoPrincipal;
	private String codigoAuxiliar;
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
	private String impBaseImponible;

	@Deprecated
	private String impValor;
	private List<Impuesto> impuestoDetalle;
	private String fillerDetFac;

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

	public String getCodigoPrincipal() {
		return this.codigoPrincipal;
	}

	public void setCodigoPrincipal(String codigoPrincipal) {
		this.codigoPrincipal = codigoPrincipal;
	}

	public String getCodigoAuxiliar() {
		return this.codigoAuxiliar;
	}

	public void setCodigoAuxiliar(String codigoAuxiliar) {
		this.codigoAuxiliar = codigoAuxiliar;
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

	public String getFillerDetFac() {
		return this.fillerDetFac;
	}

	public void setFillerDetFac(String fillerDetFac) {
		this.fillerDetFac = fillerDetFac;
	}

	public List<Impuesto> getImpuestoDetalle() {
		return this.impuestoDetalle;
	}

	public void setImpuestoDetalle(List<Impuesto> impuestoDetalle) {
		this.impuestoDetalle = impuestoDetalle;
	}

	public String toString() {
		return "Detalle{tipoRegistro=" + this.tipoRegistro + ", codigoDoc=" + this.codigoDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", codigoPrincipal=" + this.codigoPrincipal + ", codigoAuxiliar=" + this.codigoAuxiliar + ", descripcion=" + this.descripcion + ", cantidad="
				+ this.cantidad + ", precioUnitario=" + this.precioUnitario + ", descuento=" + this.descuento + ", precioTotalSinImp=" + this.precioTotalSinImp + ", impCodigo=" + this.impCodigo + ", impCodigoPorcentaje=" + this.impCodigoPorcentaje + ", impBaseImponible=" + this.impBaseImponible + ", impValor=" + this.impValor
				+ ", impuestoDetalle=" + this.impuestoDetalle + ", fillerDetFac=" + this.fillerDetFac + '}';
	}
	
}
