package ec.com.kruger.bean.factura;

import ec.com.kruger.bean.factura.formaPago.FormaPago;

import java.io.Serializable;
import java.util.List;

public class Impuesto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String totCodigo;
	private String totCodigoPorcentaje;
	private String tarifa;
	private String totBaseImponible;
	private String totValor;
	private List<FormaPago> formaPago;
	private String fillerImpFac;

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

	public String getTotCodigo() {
		return this.totCodigo;
	}

	public void setTotCodigo(String totCodigo) {
		this.totCodigo = totCodigo;
	}

	public String getTotCodigoPorcentaje() {
		return this.totCodigoPorcentaje;
	}

	public void setTotCodigoPorcentaje(String totCodigoPorcentaje) {
		this.totCodigoPorcentaje = totCodigoPorcentaje;
	}

	public String getTotBaseImponible() {
		return this.totBaseImponible;
	}

	public void setTotBaseImponible(String totBaseImponible) {
		this.totBaseImponible = totBaseImponible;
	}

	public String getTarifa() {
		return this.tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getTotValor() {
		return this.totValor;
	}

	public void setTotValor(String totValor) {
		this.totValor = totValor;
	}

	public String getFillerImpFac() {
		return this.fillerImpFac;
	}

	public void setFillerImpFac(String fillerImpFac) {
		this.fillerImpFac = fillerImpFac;
	}

	public List<FormaPago> getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(List<FormaPago> formaPago) {
		this.formaPago = formaPago;
	}

	public String toString() {
		return "Impuesto{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", totCodigo=" + this.totCodigo + ", totCodigoPorcentaje=" + this.totCodigoPorcentaje + ", totBaseImponible=" + this.totBaseImponible + ", totValor="
				+ this.totValor + ", formaPago=" + this.formaPago + ", fillerImpFac=" + this.fillerImpFac + '}';
	}
	
}
