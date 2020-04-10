package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;

public class ImpuestoAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String codigoDocSustento;
	private String codigoPorcentaje;
	private String baseImponible;
	private String tarifa;
	private String valorImpuesto;
	private String filler;

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getCodDoc() {
		return codDoc;
	}

	public void setCodDoc(String codDoc) {
		this.codDoc = codDoc;
	}

	public String getEstab() {
		return estab;
	}

	public void setEstab(String estab) {
		this.estab = estab;
	}

	public String getPtoEmision() {
		return ptoEmision;
	}

	public void setPtoEmision(String ptoEmision) {
		this.ptoEmision = ptoEmision;
	}

	public String getSecuencial() {
		return secuencial;
	}

	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}

	public String getCodigoDocSustento() {
		return codigoDocSustento;
	}

	public void setCodigoDocSustento(String codigoDocSustento) {
		this.codigoDocSustento = codigoDocSustento;
	}

	public String getCodigoPorcentaje() {
		return codigoPorcentaje;
	}

	public void setCodigoPorcentaje(String codigoPorcentaje) {
		this.codigoPorcentaje = codigoPorcentaje;
	}

	public String getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getValorImpuesto() {
		return valorImpuesto;
	}

	public void setValorImpuesto(String valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	@Override
	public String toString() {
		return "ImpuestoAts [tipoRegistro=" + tipoRegistro + ", codDoc=" + codDoc + ", estab=" + estab + ", ptoEmision=" + ptoEmision + ", secuencial=" + secuencial + ", codigoDocSustento=" + codigoDocSustento + ", codigoPorcentaje=" + codigoPorcentaje + ", baseImponible=" + baseImponible + ", tarifa=" + tarifa + ", valorImpuesto=" + valorImpuesto + ", filler=" + filler + "]";
	}

}
