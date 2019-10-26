package ec.com.kruger.bean.factura;

import java.io.Serializable;

public class Cabecera implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String fechaEmision;
	private String horaEmision;
	private String dirEstablecimiento;
	private String tipoIDentifComprador;
	private String razonSocComprador;
	private String identifiComprador;
	private String totalSinImpuesto;
	private String totalDescuento;
	private String propina;
	private String importeTotal;
	private String moneda;
	private String guiaRemision;
	private String valorPagar;
	private String numGenerado;
	private String fechaVigencia;
	private String oficinaBg;
	private String porcIva;
	private String claveAcceso;
	private String dirComprador;
	private String compCodigo;
	private String compTarifa;
	private String compSolidaria;
	private String fillerCabFac;

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

	public String getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getDirEstablecimiento() {
		return this.dirEstablecimiento;
	}

	public void setDirEstablecimiento(String dirEstablecimiento) {
		this.dirEstablecimiento = dirEstablecimiento;
	}

	public String getTipoIDentifComprador() {
		return this.tipoIDentifComprador;
	}

	public void setTipoIDentifComprador(String tipoIDentifComprador) {
		this.tipoIDentifComprador = tipoIDentifComprador;
	}

	public String getRazonSocComprador() {
		return this.razonSocComprador;
	}

	public void setRazonSocComprador(String razonSocComprador) {
		this.razonSocComprador = razonSocComprador;
	}

	public String getIdentifiComprador() {
		return this.identifiComprador;
	}

	public void setIdentifiComprador(String identifiComprador) {
		this.identifiComprador = identifiComprador;
	}

	public String getTotalSinImpuesto() {
		return this.totalSinImpuesto;
	}

	public void setTotalSinImpuesto(String totalSinImpuesto) {
		this.totalSinImpuesto = totalSinImpuesto;
	}

	public String getTotalDescuento() {
		return this.totalDescuento;
	}

	public void setTotalDescuento(String totalDescuento) {
		this.totalDescuento = totalDescuento;
	}

	public String getPropina() {
		return this.propina;
	}

	public void setPropina(String propina) {
		this.propina = propina;
	}

	public String getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(String importeTotal) {
		this.importeTotal = importeTotal;
	}

	public String getMoneda() {
		return this.moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getGuiaRemision() {
		return this.guiaRemision;
	}

	public void setGuiaRemision(String guiaRemision) {
		this.guiaRemision = guiaRemision;
	}

	public String getNumGenerado() {
		return this.numGenerado;
	}

	public void setNumGenerado(String numGenerado) {
		this.numGenerado = numGenerado;
	}

	public String getFechaVigencia() {
		return this.fechaVigencia;
	}

	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public String getOficinaBg() {
		return this.oficinaBg;
	}

	public void setOficinaBg(String oficinaBg) {
		this.oficinaBg = oficinaBg;
	}

	public String getPorcIva() {
		return this.porcIva;
	}

	public void setPorcIva(String porcIva) {
		this.porcIva = porcIva;
	}

	public String getClaveAcceso() {
		return this.claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	public String getFillerCabFac() {
		return this.fillerCabFac;
	}

	public void setFillerCabFac(String fillerCabFac) {
		this.fillerCabFac = fillerCabFac;
	}

	public String getHoraEmision() {
		return this.horaEmision;
	}

	public void setHoraEmision(String horaEmision) {
		this.horaEmision = horaEmision;
	}

	public String getDirComprador() {
		return this.dirComprador;
	}

	public void setDirComprador(String dirComprador) {
		this.dirComprador = dirComprador;
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

	public String getValorPagar() {
		return this.valorPagar;
	}

	public void setValorPagar(String valorPagar) {
		this.valorPagar = valorPagar;
	}

	public String toString() {
		return "Cabecera{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", fechaEmision=" + this.fechaEmision + ", horaEmision=" + this.horaEmision + ", dirEstablecimiento=" + this.dirEstablecimiento + ", tipoIDentifComprador="
				+ this.tipoIDentifComprador + ", razonSocComprador=" + this.razonSocComprador + ", identifiComprador=" + this.identifiComprador + ", totalSinImpuesto=" + this.totalSinImpuesto + ", totalDescuento=" + this.totalDescuento + ", propina=" + this.propina + ", importeTotal=" + this.importeTotal + ", moneda=" + this.moneda
				+ ", guiaRemision=" + this.guiaRemision + ", numGenerado=" + this.numGenerado + ", fechaVigencia=" + this.fechaVigencia + ", oficinaBg=" + this.oficinaBg + ", porcIva=" + this.porcIva + ", claveAcceso=" + this.claveAcceso + ", dirComprador=" + this.dirComprador + ", compCodigo=" + this.compCodigo + ", compTarifa=" + this.compTarifa
				+ ", compSolidaria=" + this.compSolidaria + ", fillerCabFac=" + this.fillerCabFac + '}';
	}
	
}
