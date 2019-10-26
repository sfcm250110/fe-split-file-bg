package ec.com.kruger.bean.factura.notacredito;

import java.io.Serializable;

public class CabeceraNC implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String fechaEmision;
	private String horaEmision;
	private String dirEstablecimiento;
	private String tipoIdentifComprador;
	private String razonSocComprador;
	private String identifComprador;
	private String rise;
	private String valorPagar;
	private String codDocModif;
	private String numDocModif;
	private String fecEmiDocSustento;
	private String totalSinImpuesto;
	private String valorModificacion;
	private String moneda;
	private String motivo;
	private String numGenerado;
	private String fechaVigencia;
	private String oficinaBg;
	private String porcIva;
	private String claveAcceso;
	private String fillerCabNC;

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

	public String getHoraEmision() {
		return this.horaEmision;
	}

	public void setHoraEmision(String horaEmision) {
		this.horaEmision = horaEmision;
	}

	public String getDirEstablecimiento() {
		return this.dirEstablecimiento;
	}

	public void setDirEstablecimiento(String dirEstablecimiento) {
		this.dirEstablecimiento = dirEstablecimiento;
	}

	public String getTipoIdentifComprador() {
		return this.tipoIdentifComprador;
	}

	public void setTipoIdentifComprador(String tipoIdentifComprador) {
		this.tipoIdentifComprador = tipoIdentifComprador;
	}

	public String getRazonSocComprador() {
		return this.razonSocComprador;
	}

	public void setRazonSocComprador(String razonSocComprador) {
		this.razonSocComprador = razonSocComprador;
	}

	public String getIdentifComprador() {
		return this.identifComprador;
	}

	public void setIdentifComprador(String identifComprador) {
		this.identifComprador = identifComprador;
	}

	public String getValorPagar() {
		return this.valorPagar;
	}

	public void setValorPagar(String valorPagar) {
		this.valorPagar = valorPagar;
	}

	public String getRise() {
		return this.rise;
	}

	public void setRise(String rise) {
		this.rise = rise;
	}

	public String getCodDocModif() {
		return this.codDocModif;
	}

	public void setCodDocModif(String codDocModif) {
		this.codDocModif = codDocModif;
	}

	public String getNumDocModif() {
		return this.numDocModif;
	}

	public void setNumDocModif(String numDocModif) {
		this.numDocModif = numDocModif;
	}

	public String getFecEmiDocSustento() {
		return this.fecEmiDocSustento;
	}

	public void setFecEmiDocSustento(String fecEmiDocSustento) {
		this.fecEmiDocSustento = fecEmiDocSustento;
	}

	public String getTotalSinImpuesto() {
		return this.totalSinImpuesto;
	}

	public void setTotalSinImpuesto(String totalSinImpuesto) {
		this.totalSinImpuesto = totalSinImpuesto;
	}

	public String getValorModificacion() {
		return this.valorModificacion;
	}

	public void setValorModificacion(String valorModificacion) {
		this.valorModificacion = valorModificacion;
	}

	public String getMoneda() {
		return this.moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
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

	public String getFillerCabNC() {
		return this.fillerCabNC;
	}

	public void setFillerCabNC(String fillerCabNC) {
		this.fillerCabNC = fillerCabNC;
	}

	public String toString() {
		return "CabeceraNC{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", fechaEmision=" + this.fechaEmision + ", horaEmision=" + this.horaEmision + ", dirEstablecimiento=" + this.dirEstablecimiento + ", tipoIdentifComprador="
				+ this.tipoIdentifComprador + ", razonSocComprador=" + this.razonSocComprador + ", identifComprador=" + this.identifComprador + ", rise=" + this.rise + ", valorPagar=" + this.valorPagar + ", codDocModif=" + this.codDocModif + ", numDocModif=" + this.numDocModif + ", fecEmiDocSustento=" + this.fecEmiDocSustento
				+ ", totalSinImpuesto=" + this.totalSinImpuesto + ", valorModificacion=" + this.valorModificacion + ", moneda=" + this.moneda + ", motivo=" + this.motivo + ", numGenerado=" + this.numGenerado + ", fechaVigencia=" + this.fechaVigencia + ", oficinaBg=" + this.oficinaBg + ", porcIva=" + this.porcIva + ", claveAcceso="
				+ this.claveAcceso + ", fillerCabNC=" + this.fillerCabNC + '}';
	}
	
}
