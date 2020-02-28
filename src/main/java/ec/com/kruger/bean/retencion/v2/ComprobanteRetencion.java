package ec.com.kruger.bean.retencion.v2;

import java.io.Serializable;
import java.util.List;

public class ComprobanteRetencion implements Serializable {

	private static final long serialVersionUID = 1L;

	private CabeceraComprobanteRetencion cabecera;
	private List<DocumentoSustentoComprobanteRetencion> documentosSustento;
	private List<ImpuestoComprobanteRetencion> impuestos;
	private List<ImpuestosComprobanteRetencion> impuestosLista;
	private List<InformacionAdicionalComprobanteRetencion> informacionesAdicional;

	public CabeceraComprobanteRetencion getCabecera() {
		return cabecera;
	}

	public void setCabecera(CabeceraComprobanteRetencion cabecera) {
		this.cabecera = cabecera;
	}

	public List<DocumentoSustentoComprobanteRetencion> getDocumentosSustento() {
		return documentosSustento;
	}

	public void setDocumentosSustento(List<DocumentoSustentoComprobanteRetencion> documentosSustento) {
		this.documentosSustento = documentosSustento;
	}

	public List<ImpuestoComprobanteRetencion> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<ImpuestoComprobanteRetencion> impuestos) {
		this.impuestos = impuestos;
	}

	public List<ImpuestosComprobanteRetencion> getImpuestosLista() {
		return impuestosLista;
	}

	public void setImpuestosLista(List<ImpuestosComprobanteRetencion> impuestosLista) {
		this.impuestosLista = impuestosLista;
	}

	public List<InformacionAdicionalComprobanteRetencion> getInformacionesAdicional() {
		return informacionesAdicional;
	}

	public void setInformacionesAdicional(List<InformacionAdicionalComprobanteRetencion> informacionesAdicional) {
		this.informacionesAdicional = informacionesAdicional;
	}

	@Override
	public String toString() {
		return "ComprobanteRetencion [cabecera=" + cabecera + ", documentosSustento=" + documentosSustento + ", impuestos=" + impuestos + ", impuestosLista=" + impuestosLista + ", informacionesAdicional=" + informacionesAdicional + "]";
	}

}
