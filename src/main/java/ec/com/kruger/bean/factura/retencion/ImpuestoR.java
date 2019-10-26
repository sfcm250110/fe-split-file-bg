package ec.com.kruger.bean.factura.retencion;

import java.io.Serializable;

public class ImpuestoR implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoRegistro;
	private String codDoc;
	private String estab;
	private String ptoEmision;
	private String secuencial;
	private String codigo;
	private String codigoRetencion;
	private String baseImponible;
	private String porcentajeRetener;
	private String valorRetenido;
	private String codDocSustento;
	private String numDocSustento;
	private String fecEmiDocSustento;
	private String fillerImpRet;

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

	public String getCodigoRetencion() {
		return this.codigoRetencion;
	}

	public void setCodigoRetencion(String codigoRetencion) {
		this.codigoRetencion = codigoRetencion;
	}

	public String getBaseImponible() {
		return this.baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getPorcentajeRetener() {
		return this.porcentajeRetener;
	}

	public void setPorcentajeRetener(String porcentajeRetener) {
		this.porcentajeRetener = porcentajeRetener;
	}

	public String getValorRetenido() {
		return this.valorRetenido;
	}

	public void setValorRetenido(String valorRetenido) {
		this.valorRetenido = valorRetenido;
	}

	public String getCodDocSustento() {
		return this.codDocSustento;
	}

	public void setCodDocSustento(String codDocSustento) {
		this.codDocSustento = codDocSustento;
	}

	public String getNumDocSustento() {
		return this.numDocSustento;
	}

	public void setNumDocSustento(String numDocSustento) {
		this.numDocSustento = numDocSustento;
	}

	public String getFecEmiDocSustento() {
		return this.fecEmiDocSustento;
	}

	public void setFecEmiDocSustento(String fecEmiDocSustento) {
		this.fecEmiDocSustento = fecEmiDocSustento;
	}

	public String getFillerImpRet() {
		return this.fillerImpRet;
	}

	public void setFillerImpRet(String fillerImpRet) {
		this.fillerImpRet = fillerImpRet;
	}

	public String getEstab() {
		return this.estab;
	}

	public void setEstab(String estab) {
		this.estab = estab;
	}

	public String toString() {
		return "ImpuestoR{tipoRegistro=" + this.tipoRegistro + ", codDoc=" + this.codDoc + ", estab=" + this.estab + ", ptoEmision=" + this.ptoEmision + ", secuencial=" + this.secuencial + ", codigo=" + this.codigo + ", codigoRetencion=" + this.codigoRetencion + ", baseImponible=" + this.baseImponible + ", porcentajeRetener="
				+ this.porcentajeRetener + ", valorRetenido=" + this.valorRetenido + ", codDocSustento=" + this.codDocSustento + ", numDocSustento=" + this.numDocSustento + ", fecEmiDocSustento=" + this.fecEmiDocSustento + ", fillerImpRet=" + this.fillerImpRet + '}';
	}

}
