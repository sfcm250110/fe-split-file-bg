package ec.com.kruger.bean.factura.notacredito;

import java.io.Serializable;
import java.util.List;

public class NotaCreditoNC implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private CabeceraNC cabecera;
	private List<ImpuestoNC> impuestos;
	private List<DetalleNC> detalles;
	private List<AdicionalNC> adicional;

	public CabeceraNC getCabecera() {
		return this.cabecera;
	}

	public void setCabecera(CabeceraNC cabecera) {
		this.cabecera = cabecera;
	}

	public List<ImpuestoNC> getImpuestos() {
		return this.impuestos;
	}

	public void setImpuestos(List<ImpuestoNC> impuestos) {
		this.impuestos = impuestos;
	}

	public List<DetalleNC> getDetalles() {
		return this.detalles;
	}

	public void setDetalles(List<DetalleNC> detalles) {
		this.detalles = detalles;
	}

	public List<AdicionalNC> getAdicional() {
		return this.adicional;
	}

	public void setAdicional(List<AdicionalNC> adicional) {
		this.adicional = adicional;
	}

	public String toString() {
		return "NotaCreditoNC{cabecera=" + this.cabecera + ", impuestos=" + this.impuestos + ", detalles=" + this.detalles + ", adicional=" + this.adicional + '}';
	}
	
}
