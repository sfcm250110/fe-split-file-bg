package ec.com.kruger.bean.factura;

import java.io.Serializable;
import java.util.List;

public class Factura implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cabecera cabecera;
	private List<Detalle> detalles;
	private List<Impuesto> impuestos;
	private List<Retencion> retenciones;
	private List<Adicional> adicional;

	public Cabecera getCabecera() {
		return this.cabecera;
	}

	public void setCabecera(Cabecera cabecera) {
		this.cabecera = cabecera;
	}

	public List<Detalle> getDetalles() {
		return this.detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

	public List<Impuesto> getImpuestos() {
		return this.impuestos;
	}

	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}

	public List<Retencion> getRetenciones() {
		return this.retenciones;
	}

	public void setRetenciones(List<Retencion> retenciones) {
		this.retenciones = retenciones;
	}

	public List<Adicional> getAdicional() {
		return this.adicional;
	}

	public void setAdicional(List<Adicional> adicional) {
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return "Factura [cabecera=" + cabecera + ", detalles=" + detalles + ", impuestos=" + impuestos + ", retenciones=" + retenciones + ", adicional=" + adicional + "]";
	}

}
