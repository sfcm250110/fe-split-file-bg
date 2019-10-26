package ec.com.kruger.bean.factura.retencion;

import java.io.Serializable;

public class CabeceraR implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String fechaEmision;
	private String horaEmision;
	private String dirEstablecimiento;
	private String tipoIdentifRetenido;
	private String razonSocRetenido;
	private String idRetenido;
	private String periodoFiscal;
	private String numGenerado;
	private String fechaVigencia;
	private String oficinaBg;
	private String secuencialBg;
	private String porcIva;
	private String claveAcceso;
	private String fillerCabRet;

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

	public String getTipoIdentifRetenido() {
		return this.tipoIdentifRetenido;
	}

	public void setTipoIdentifRetenido(String tipoIdentifRetenido) {
		this.tipoIdentifRetenido = tipoIdentifRetenido;
	}

	public String getRazonSocRetenido() {
		return this.razonSocRetenido;
	}

	public void setRazonSocRetenido(String razonSocRetenido) {
		this.razonSocRetenido = razonSocRetenido;
	}

	public String getIdRetenido() {
		return this.idRetenido;
	}

	public void setIdRetenido(String idRetenido) {
		this.idRetenido = idRetenido;
	}

	public String getPeriodoFiscal() {
		return this.periodoFiscal;
	}

	public void setPeriodoFiscal(String periodoFiscal) {
		this.periodoFiscal = periodoFiscal;
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

	public String getSecuencialBg() {
		return this.secuencialBg;
	}

	public void setSecuencialBg(String secuencialBg) {
		this.secuencialBg = secuencialBg;
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

	public String getFillerCabRet() {
		return this.fillerCabRet;
	}

	public void setFillerCabRet(String fillerCabRet) {
		this.fillerCabRet = fillerCabRet;
	}

	public String toString() {
		return "CabeceraR{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", fechaEmision=" + this.fechaEmision + ", horaEmision=" + this.horaEmision + ", dirEstablecimiento=" + this.dirEstablecimiento + ", tipoIdentifRetenido="
				+ this.tipoIdentifRetenido + ", razonSocRetenido=" + this.razonSocRetenido + ", idRetenido=" + this.idRetenido + ", periodoFiscal=" + this.periodoFiscal + ", numGenerado=" + this.numGenerado + ", fechaVigencia=" + this.fechaVigencia + ", oficinaBg=" + this.oficinaBg + ", secuencialBg=" + this.secuencialBg + ", porcIva="
				+ this.porcIva + ", claveAcceso=" + this.claveAcceso + ", fillerCabRet=" + this.fillerCabRet + '}';
	}

}
