package ec.com.kruger.bean.retencion.ats;

import java.io.Serializable;
import java.util.List;

public class ComprobanteRetencionAts implements Serializable {

	private static final long serialVersionUID = 1L;

	private CabeceraComprobanteRetencionAts cabecera;
	private List<DocumentoSustentoComprobanteRetencionAts> documentosSustento;
	private List<ImpuestoComprobanteRetencionAts> impuestos;
	private List<ImpuestosComprobanteRetencionAts> impuestosLista;
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

	public List<ImpuestoComprobanteRetencionAts> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<ImpuestoComprobanteRetencionAts> impuestos) {
		this.impuestos = impuestos;
	}

	public List<ImpuestosComprobanteRetencionAts> getImpuestosLista() {
		return impuestosLista;
	}

	public void setImpuestosLista(List<ImpuestosComprobanteRetencionAts> impuestosLista) {
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
		return "ComprobanteRetencion [cabecera=" + cabecera + ", documentosSustento=" + documentosSustento + ", impuestos=" + impuestos + ", impuestosLista=" + impuestosLista + ", informacionesAdicional=" + informacionesAdicional + "]";
	}

}
