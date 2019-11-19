package ec.com.kruger.bean.liquidacion.compras;

import java.io.Serializable;

public class InformacionAdicionalLiquidacionCompras implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String infoAdicional1;
	private String infoAdicional2;
	private String filler;

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

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	@Override
	public String toString() {
		return "InformacionAdicionalLiquidacionCompras [tipoRegistro=" + tipoRegistro + ", codDoc=" + codDoc + ", estab=" + estab + ", ptoEmision=" + ptoEmision + ", secuencial=" + secuencial + ", infoAdicional1=" + infoAdicional1 + ", infoAdicional2=" + infoAdicional2 + ", filler=" + filler + "]";
	}

}
