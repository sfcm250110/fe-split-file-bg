package ec.com.kruger.bean.factura.notadebito;

import java.io.Serializable;
import java.util.List;

public class NotaDebitoND implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CabeceraND cabecera;
	private List<ImpuestoND> impuestos;
	private List<AdicionalND> adicional;
	private List<MotivoND> motivos;

	public CabeceraND getCabecera() {
		return this.cabecera;
	}

	public void setCabecera(CabeceraND cabecera) {
		this.cabecera = cabecera;
	}

	public List<ImpuestoND> getImpuestos() {
		return this.impuestos;
	}

	public void setImpuestos(List<ImpuestoND> impuestos) {
		this.impuestos = impuestos;
	}

	public List<AdicionalND> getAdicional() {
		return this.adicional;
	}

	public void setAdicional(List<AdicionalND> adicional) {
		this.adicional = adicional;
	}

	public List<MotivoND> getMotivos() {
		return this.motivos;
	}

	public void setMotivos(List<MotivoND> motivos) {
		this.motivos = motivos;
	}

}
