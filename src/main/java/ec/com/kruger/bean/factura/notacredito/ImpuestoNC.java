package ec.com.kruger.bean.factura.notacredito;

import ec.com.kruger.bean.factura.formaPago.FormaPago;

import java.io.Serializable;
import java.util.List;

public class ImpuestoNC implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String codigo;
	private String codigoPorcentaje;
	private String tarifa;
	private String baseImponible;
	private String valor;
	private List<FormaPago> formaPago;
	private String compCodigo;
	private String compTarifa;
	private String compSolidaria;
	private String fillerImpNC;

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

	public String getBaseImponible() {
		return this.baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFillerImpNC() {
		return this.fillerImpNC;
	}

	public List<FormaPago> getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(List<FormaPago> formaPago) {
		this.formaPago = formaPago;
	}

	public String getCompCodigo() {
		return this.compCodigo;
	}

	public void setCompCodigo(String compCodigo) {
		this.compCodigo = compCodigo;
	}

	public String getCompTarifa() {
		return this.compTarifa;
	}

	public void setCompTarifa(String compTarifa) {
		this.compTarifa = compTarifa;
	}

	public String getCompSolidaria() {
		return this.compSolidaria;
	}

	public void setCompSolidaria(String compSolidaria) {
		this.compSolidaria = compSolidaria;
	}

	public void setFillerImpNC(String fillerImpNC) {
		this.fillerImpNC = fillerImpNC;
	}

	public String getTarifa() {
		return this.tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String toString() {
		return "ImpuestoNC{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", codigo=" + this.codigo + ", codigoPorcentaje=" + this.codigoPorcentaje + ", tarifa=" + this.tarifa + ", baseImponible=" + this.baseImponible + ", valor="
				+ this.valor + ", formaPago=" + this.formaPago + ", compCodigo=" + this.compCodigo + ", compTarifa=" + this.compTarifa + ", compSolidaria=" + this.compSolidaria + ", fillerImpNC=" + this.fillerImpNC + '}';
	}
	
}
