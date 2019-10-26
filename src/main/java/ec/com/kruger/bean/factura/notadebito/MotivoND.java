package ec.com.kruger.bean.factura.notadebito;

import java.io.Serializable;

public class MotivoND implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String razon;
	private String valor;
	private String fillerMotND;

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

	public String getRazon() {
		return this.razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFillerMotND() {
		return this.fillerMotND;
	}

	public void setFillerMotND(String fillerMotND) {
		this.fillerMotND = fillerMotND;
	}

	public String toString() {
		return "MotivoND{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", razon=" + this.razon + ", valor=" + this.valor + ", fillerMotND=" + this.fillerMotND + '}';
	}
	
}
