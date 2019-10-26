package ec.com.kruger.bean.factura;

import java.io.Serializable;

public class Retencion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String codigo;
	private String codigoPorcentaje;
	private String tarifa;
	private String valor;
	private String retFac;

	public String getTipoRegistro() {
		return this.tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getCodDoc() {
		return this.codDoc;
	}

	public void setCodDoc(String codDoc) {
		this.codDoc = codDoc;
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

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoPorcentaje() {
		return this.codigoPorcentaje;
	}

	public void setCodigoPorcentaje(String codigoPorcentaje) {
		this.codigoPorcentaje = codigoPorcentaje;
	}

	public String getTarifa() {
		return this.tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getRetFac() {
		return this.retFac;
	}

	public void setRetFac(String retFac) {
		this.retFac = retFac;
	}

	public String toString() {
		return "Retencion{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", prtoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", codigo=" + this.codigo + ", codigoPorcentaje=" + this.codigoPorcentaje + ", tarifa=" + this.tarifa + ", valor=" + this.valor + ", retFac=" + this.retFac
				+ '}';
	}
	
}
