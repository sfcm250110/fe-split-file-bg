package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;
import java.util.List;

public class ComprobanteRetencionAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private CabeceraComprobanteRetencionAts cabecera;
	private List<DocumentoSustentoComprobanteRetencionAts> documentoSustentoLista;
	private List<RetencionAts> retencionAtsLista;
	private List<ImpuestoAts> impuestoAtsLista;
	private List<InformacionAdicionalComprobanteRetencionAts> informacionAdicionalLista;

	public CabeceraComprobanteRetencionAts getCabecera() {
		return cabecera;
	}

	public void setCabecera(CabeceraComprobanteRetencionAts cabecera) {
		this.cabecera = cabecera;
	}

	public List<DocumentoSustentoComprobanteRetencionAts> getDocumentoSustentoLista() {
		return documentoSustentoLista;
	}

	public void setDocumentoSustentoLista(List<DocumentoSustentoComprobanteRetencionAts> documentoSustentoLista) {
		this.documentoSustentoLista = documentoSustentoLista;
	}

	public List<RetencionAts> getRetencionAtsLista() {
		return retencionAtsLista;
	}

	public void setRetencionAtsLista(List<RetencionAts> retencionAtsLista) {
		this.retencionAtsLista = retencionAtsLista;
	}

	public List<ImpuestoAts> getImpuestoAtsLista() {
		return impuestoAtsLista;
	}

	public void setImpuestoAtsLista(List<ImpuestoAts> impuestoAtsLista) {
		this.impuestoAtsLista = impuestoAtsLista;
	}

	public List<InformacionAdicionalComprobanteRetencionAts> getInformacionAdicionalLista() {
		return informacionAdicionalLista;
	}

	public void setInformacionAdicionalLista(List<InformacionAdicionalComprobanteRetencionAts> informacionAdicionalLista) {
		this.informacionAdicionalLista = informacionAdicionalLista;
	}

	@Override
	public String toString() {
		return "ComprobanteRetencionAts [cabecera=" + cabecera + ", documentoSustentoLista=" + documentoSustentoLista + ", retencionAtsLista=" + retencionAtsLista + ", impuestoAtsLista=" + impuestoAtsLista + ", informacionAdicionalLista=" + informacionAdicionalLista + "]";
	}

}
