package ec.com.kruger.bean.factura.retencion;

import java.io.Serializable;
import java.util.List;

public class ComprobanteRetencionR implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private CabeceraR cabecera;
	private List<ImpuestoR> impuestos;
	private List<AdicionalR> adicional;

	public CabeceraR getCabecera() {
		return this.cabecera;
	}

	public void setCabecera(CabeceraR cabecera) {
		this.cabecera = cabecera;
	}

	public List<ImpuestoR> getImpuestos() {
		return this.impuestos;
	}

	public void setImpuestos(List<ImpuestoR> impuestos) {
		this.impuestos = impuestos;
	}

	public List<AdicionalR> getAdicional() {
		return this.adicional;
	}

	public void setAdicional(List<AdicionalR> adicional) {
		this.adicional = adicional;

	}

}
