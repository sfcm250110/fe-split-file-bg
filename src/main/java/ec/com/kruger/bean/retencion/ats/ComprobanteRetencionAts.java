package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;
import java.util.List;

public class ComprobanteRetencionAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private CabeceraComprobanteRetencionAts cabecera;
	private List<DocumentoSustentoComprobanteRetencionAts> documentosSustento;
	private List<RetencionAts> retencionesLista;
	private List<ImpuestoAts> impuestosLista;
	private List<InformacionAdicionalComprobanteRetencionAts> informacionesAdicional;

	public CabeceraComprobanteRetencionAts getCabecera() {
		return cabecera;
	}

	public void setCabecera(CabeceraComprobanteRetencionAts cabecera) {
		this.cabecera = cabecera;
	}

	public List<DocumentoSustentoComprobanteRetencionAts> getDocumentosSustento() {
		return documentosSustento;
	}

	public void setDocumentosSustento(List<DocumentoSustentoComprobanteRetencionAts> documentosSustento) {
		this.documentosSustento = documentosSustento;
	}

	public List<RetencionAts> getRetencionesLista() {
		return retencionesLista;
	}

	public void setRetencionesLista(List<RetencionAts> retencionesLista) {
		this.retencionesLista = retencionesLista;
	}

	public List<ImpuestoAts> getImpuestosLista() {
		return impuestosLista;
	}

	public void setImpuestosLista(List<ImpuestoAts> impuestosLista) {
		this.impuestosLista = impuestosLista;
	}

	public List<InformacionAdicionalComprobanteRetencionAts> getInformacionesAdicional() {
		return informacionesAdicional;
	}

	public void setInformacionesAdicional(List<InformacionAdicionalComprobanteRetencionAts> informacionesAdicional) {
		this.informacionesAdicional = informacionesAdicional;
	}

	@Override
	public String toString() {
		return "ComprobanteRetencionAts [cabecera=" + cabecera + ", documentosSustento=" + documentosSustento + ", retencionesLista=" + retencionesLista + ", impuestosLista=" + impuestosLista + ", informacionesAdicional=" + informacionesAdicional + "]";
	}

}
