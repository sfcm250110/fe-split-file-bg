package ec.com.kruger.bean.factura.formaPago;

import java.io.Serializable;

public class FormaPago implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String pagFormPago;
	private String pagTotal;
	private String pagPlazo;
	private String pagUnidadT;

	public String getPagFormPago() {
		return this.pagFormPago;
	}

	public void setPagFormPago(String pagFormPago) {
		this.pagFormPago = pagFormPago;
	}

	public String getPagTotal() {
		return this.pagTotal;
	}

	public void setPagTotal(String pagTotal) {
		this.pagTotal = pagTotal;
	}

	public String getPagPlazo() {
		return this.pagPlazo;
	}

	public void setPagPlazo(String pagPlazo) {
		this.pagPlazo = pagPlazo;
	}

	public String getPagUnidadT() {
		return this.pagUnidadT;
	}

	public void setPagUnidadT(String pagUnidadT) {
		this.pagUnidadT = pagUnidadT;
	}

	public String toString() {
		return "FormaPago{pagFormPago=" + this.pagFormPago + ", pagTotal=" + this.pagTotal + ", pagPlazo=" + this.pagPlazo + ", pagUnidadT=" + this.pagUnidadT + '}';
	}
	
}