package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;
import java.util.List;

public class ComprobanteRetencionAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private CabeceraAts cabeceraAts;
	private List<DocumentoSustentoAts> documentoSustentoAtsLista;
	private List<RetencionAts> retencionAtsLista;
	private List<ImpuestoAts> impuestoAtsLista;
	private List<InformacionAdicionalAts> informacionAdicionalAtsLista;

	public CabeceraAts getCabeceraAts() {
		return cabeceraAts;
	}

	public void setCabeceraAts(CabeceraAts cabeceraAts) {
		this.cabeceraAts = cabeceraAts;
	}

	public List<DocumentoSustentoAts> getDocumentoSustentoAtsLista() {
		return documentoSustentoAtsLista;
	}

	public void setDocumentoSustentoAtsLista(List<DocumentoSustentoAts> documentoSustentoAtsLista) {
		this.documentoSustentoAtsLista = documentoSustentoAtsLista;
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

	public List<InformacionAdicionalAts> getInformacionAdicionalAtsLista() {
		return informacionAdicionalAtsLista;
	}

	public void setInformacionAdicionalAtsLista(List<InformacionAdicionalAts> informacionAdicionalAtsLista) {
		this.informacionAdicionalAtsLista = informacionAdicionalAtsLista;
	}

	@Override
	public String toString() {
		return "ComprobanteRetencionAts [cabeceraAts=" + cabeceraAts + ", documentoSustentoAtsLista=" + documentoSustentoAtsLista + ", retencionAtsLista=" + retencionAtsLista + ", impuestoAtsLista=" + impuestoAtsLista + ", informacionAdicionalAtsLista=" + informacionAdicionalAtsLista + "]";
	}

}
