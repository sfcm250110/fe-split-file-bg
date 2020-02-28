package ec.com.kruger.util;

import java.io.Serializable;

public class ContentFile implements Serializable {

	private static final long serialVersionUID = 1L;

	private String lineaCabecera;
	private String contenido;

	public String getLineaCabecera() {
		return lineaCabecera;
	}

	public void setLineaCabecera(String lineaCabecera) {
		this.lineaCabecera = lineaCabecera;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "ContentFile [lineaCabecera=" + lineaCabecera + ", contenido=" + contenido + "]";
	}

}