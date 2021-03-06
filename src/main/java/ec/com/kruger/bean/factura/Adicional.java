package ec.com.kruger.bean.factura;

import java.io.Serializable;

public class Adicional implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String infoAdicional1;
	private String infoAdicional2;
	private String fillerAdFac;

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

	public String getInfoAdicional1() {
		return this.infoAdicional1;
	}

	public void setInfoAdicional1(String infoAdicional1) {
		this.infoAdicional1 = infoAdicional1;
	}

	public String getInfoAdicional2() {
		return this.infoAdicional2;
	}

	public void setInfoAdicional2(String infoAdicional2) {
		this.infoAdicional2 = infoAdicional2;
	}

	public String getFillerAdFac() {
		return this.fillerAdFac;
	}

	public void setFillerAdFac(String fillerAdFac) {
		this.fillerAdFac = fillerAdFac;
	}

	public String toString() {
		return "Adicional{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", infoAdicional1=" + this.infoAdicional1 + ", infoAdicional2=" + this.infoAdicional2 + ", fillerAdFac=" + this.fillerAdFac + '}';
	}

}
