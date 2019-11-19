package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;
import java.util.List;

public class DetalleLiquidacionCompras implements Serializable {

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
	private String fillerDetalleLiquidacionCompras;
	private List<ImpuestoDetalleLiquidacionCompras> impuestoDetalle;

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

	public String getFillerDetalleLiquidacionCompras() {
		return fillerDetalleLiquidacionCompras;
	}

	public void setFillerDetalleLiquidacionCompras(String fillerDetalleLiquidacionCompras) {
		this.fillerDetalleLiquidacionCompras = fillerDetalleLiquidacionCompras;
	}

	public List<ImpuestoDetalleLiquidacionCompras> getImpuestoDetalle() {
		return impuestoDetalle;
	}

	public void setImpuestoDetalle(List<ImpuestoDetalleLiquidacionCompras> impuestoDetalle) {
		this.impuestoDetalle = impuestoDetalle;
	}

	@Override
	public String toString() {
		return "DetalleLiquidacionCompras [tipoRegistro=" + tipoRegistro + ", codigoDoc=" + codigoDoc + ", estab=" + estab + ", ptoEmision=" + ptoEmision + ", secuencial=" + secuencial + ", codigoPrincipal=" + codigoPrincipal + ", codigoAuxiliar=" + codigoAuxiliar + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", descuento=" + descuento
				+ ", precioTotalSinImp=" + precioTotalSinImp + ", fillerDetalleLiquidacionCompras=" + fillerDetalleLiquidacionCompras + ", impuestoDetalle=" + impuestoDetalle + "]";
	}

}
