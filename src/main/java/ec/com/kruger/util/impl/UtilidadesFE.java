package ec.com.kruger.util.impl;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class UtilidadesFE implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public static String voltearCadena(String cadena) {
		String cadenaInvertida = "";
		
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		
		return cadenaInvertida;
	}

	public static int sumaDigitos(String cadena) {
		int pivote = 2;
		int longitudCadena = cadena.length();
		int cantidadTotal = 0;
		int b = 1;
		for (int i = 0; i < longitudCadena; i++) {
			if (pivote == 8) {
				pivote = 2;
			}
			int temporal = Integer.parseInt("" + cadena.substring(i, b));
			b++;
			temporal *= pivote;
			pivote++;
			cantidadTotal += temporal;
		}
		cantidadTotal = 11 - cantidadTotal % 11;
		switch (cantidadTotal) {
		case 10:
			cantidadTotal = 1;
			break;
		case 11:
			cantidadTotal = 0;
		}

		return cantidadTotal;
	}

	public static int generarDigitoVerificador(String claveAcceso) {
		claveAcceso = voltearCadena(claveAcceso);
		int result = sumaDigitos(claveAcceso);
		return result;
	}

	public static String generarCodigoNumerico() {
		Random r = new Random();
		int valorDado = r.nextInt(90000000) + 10000000;
		return String.valueOf(valorDado);
	}

	public static Date convertirFecha(String fecha, String formatoActual) {
		SimpleDateFormat formato = new SimpleDateFormat(formatoActual);
		Date fechaResult = null;
		try {
			fechaResult = formato.parse(fecha);
			
		} catch (ParseException e) {
			System.out.println("Error al convertir la fecha " + e.getMessage());
			return fechaResult;
		}

		return fechaResult;
	}
	
	public static String obtenerPorcentajeRetener(String pValor) {
		String porcentajeRetener = pValor;
		
		if (Objects.nonNull(pValor) && !pValor.isEmpty()) {
			if (Integer.parseInt(pValor) > 100) {
				Double porcentajeRetenerDecimal = Double.parseDouble(pValor) / 100; 
				porcentajeRetener = porcentajeRetenerDecimal.toString();
			}
		}
		
		return porcentajeRetener;
	}

}
