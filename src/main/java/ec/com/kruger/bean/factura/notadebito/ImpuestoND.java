package ec.com.kruger.bean.factura.notadebito;

import java.io.Serializable;
import java.util.List;

import ec.com.kruger.bean.factura.formaPago.FormaPago;

public class ImpuestoND implements Serializable {

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
	private String fillerImpND;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoPorcentaje() {
		return codigoPorcentaje;
	}

	public void setCodigoPorcentaje(String codigoPorcentaje) {
		this.codigoPorcentaje = codigoPorcentaje;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public List<FormaPago> getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(List<FormaPago> formaPago) {
		this.formaPago = formaPago;
	}

	public String getCompCodigo() {
		return compCodigo;
	}

	public void setCompCodigo(String compCodigo) {
		this.compCodigo = compCodigo;
	}

	public String getCompTarifa() {
		return compTarifa;
	}

	public void setCompTarifa(String compTarifa) {
		this.compTarifa = compTarifa;
	}

	public String getCompSolidaria() {
		return compSolidaria;
	}

	public void setCompSolidaria(String compSolidaria) {
		this.compSolidaria = compSolidaria;
	}

	public String getFillerImpND() {
		return fillerImpND;
	}

	public void setFillerImpND(String fillerImpND) {
		this.fillerImpND = fillerImpND;
	}

}
