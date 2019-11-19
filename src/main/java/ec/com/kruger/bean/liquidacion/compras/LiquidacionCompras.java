package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;
import java.util.List;

public class LiquidacionCompras implements Serializable {

	private static final long serialVersionUID = 1L;

	private CabeceraLiquidacionCompras cabecera;
	private List<DetalleLiquidacionCompras> detalles;
	private List<ImpuestoLiquidacionCompras> impuestos;
	private List<ReembolsoLiquidacionCompras> reembolsos;
	private List<InformacionAdicionalLiquidacionCompras> informacionesAdicional;

	public CabeceraLiquidacionCompras getCabecera() {
		return this.cabecera;
	}

	public void setCabecera(CabeceraLiquidacionCompras cabecera) {
		this.cabecera = cabecera;
	}

	public List<DetalleLiquidacionCompras> getDetalles() {
		return this.detalles;
	}

	public void setDetalles(List<DetalleLiquidacionCompras> detalles) {
		this.detalles = detalles;
	}

	public List<ImpuestoLiquidacionCompras> getImpuestos() {
		return this.impuestos;
	}

	public void setImpuestos(List<ImpuestoLiquidacionCompras> impuestos) {
		this.impuestos = impuestos;
	}

	public List<ReembolsoLiquidacionCompras> getReembolsos() {
		return reembolsos;
	}

	public void setReembolsos(List<ReembolsoLiquidacionCompras> reembolsos) {
		this.reembolsos = reembolsos;
	}

	public List<InformacionAdicionalLiquidacionCompras> getInformacionesAdicional() {
		return informacionesAdicional;
	}

	public void setInformacionesAdicional(List<InformacionAdicionalLiquidacionCompras> informacionesAdicional) {
		this.informacionesAdicional = informacionesAdicional;
	}

	@Override
	public String toString() {
		return "LiquidacionCompras [cabecera=" + cabecera + ", detalles=" + detalles + ", impuestos=" + impuestos + ", reembolsos=" + reembolsos + ", informacionesAdicional=" + informacionesAdicional + "]";
	}

}
