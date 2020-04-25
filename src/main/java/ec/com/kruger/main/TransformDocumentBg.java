package ec.com.kruger.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;

import ec.com.kruger.bean.factura.Factura;
import ec.com.kruger.bean.factura.notacredito.AdicionalNC;
import ec.com.kruger.bean.factura.notacredito.DetalleNC;
import ec.com.kruger.bean.factura.notacredito.NotaCreditoNC;
import ec.com.kruger.bean.factura.retencion.AdicionalR;
import ec.com.kruger.bean.factura.retencion.ImpuestoR;
import ec.com.kruger.bean.principal.Cabecera;
import ec.com.kruger.bean.retencion.ats.ComprobanteRetencionAts;
import ec.com.kruger.util.ContentFile;
import ec.com.kruger.util.impl.CabeceraPrincipalBuildUtil;
import ec.com.kruger.util.impl.DocumentTransformUtilImpl;

public class TransformDocumentBg extends DocumentTransformUtilImpl implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String PATH_FILE = "C:\\proyectos\\bg\\desarrollo\\modificar-ride\\files-test\\SF2410_01_016_20180620_2.txt";
	public static final String PATH_FILE_1 = "C:\\proyectos\\bg\\java\\archivos\\pruebas-offline-bg\\jueves-07-diciembre\\SF2410_008_20171207-1.txt";
	public static final String PATH_FILE_2 = "C:\\proyectos\\bg\\java\\archivos\\pruebas-offline-bg\\nueva-version\\SF2410_01_008_20180607.txt";
	public static final String PATH_FILE_3 = "C:\\proyectos\\bg\\java\\archivos\\pruebas-offline-bg\\nueva-version\\SF2410_04_016_20180703.txt";
	public static final String PATH_FILE_4 = "C:\\proyectos\\bg\\desarrollo\\modificar-ride\\files-test\\SF2410_04_002_20180710_NC_03.txt";
	public static final String PATH_FILE_FACTURA = "C:\\proyectos\\bg\\files-bg\\SF2410_01_015_20200108_041943.txt";
	public static final String PATH_FILE_RETENCIONES = "C:\\proyectos\\bg\\desarrollo\\modificar-ride\\files-test\\SF2420_05_009_20180118_093714.txt";
	public static final String PATH_FILE_NOTA_CREDITO = "C:\\proyectos\\bg\\desarrollo\\modificar-ride\\files-test\\SF2410_04_002_20180718.txt";
	public static final String PATH_FILE_RETENCIONES_CA_FUSE_OK = "C:\\proyectos\\bg\\desarrollo\\clave-acceso-genera-fuse\\files-gl\\RETENCIONES_TC_02_20180831.txt";
	public static final String PATH_FILE_RETENCIONES_CA_FUSE_ERROR = "C:\\proyectos\\bg\\desarrollo\\clave-acceso-genera-fuse\\files-gl\\SF2420_20_020_20180831_232415.txt";
	public static final String PATH_FILE_RETENCIONES_ATS = "C:\\Users\\kruger\\Desktop\\bg\\requerimientos\\retenciones-v2-ats\\xml-bg-borrador\\SF2420_02_003_20190624_094820.txt";
	public static final String PATH_FILE_RETENCIONES_ATS_V2 = "C:\\proyectos\\bg\\retenciones-v2\\archivos-xml-bg\\error-value-07\\SF2422_03_004_20200422_155841.txt";
	public static final String PATH_FILE_LIQUIDACION_COMPRAS = "C:\\proyectos\\bg\\files-bg\\SF2425_03_002_20200106_083838.txt";
	
	public static void main(String[] args) throws Exception {
		try {
			int metodoTest = 6;
			
			switch (metodoTest) {
				case 1: {
					deberiaObtenerFacturaTest();
					break;
				}
				case 2: {
					notaCreditoTest();
					break;
				}
				case 3: {
					comprobanteRetencionTest();
					break;
				}
				case 4: {
					comprobanteRetencionCaFuseTest();
					break;
				}
				case 5: {
					liquidacionComprasTest();
					break;
				}
				case 6: {
					comprobanteRetencionAtsTest();
					break;
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
			e.printStackTrace();
		}
	}
	
	private static void deberiaObtenerFacturaTest() throws Exception {
		ContentFile contenidoArchivo = getContentFile(PATH_FILE_FACTURA);
		Cabecera cabecera = CabeceraPrincipalBuildUtil.getCabeceraFile(contenidoArchivo.getLineaCabecera());
		Factura factura = obtenerFactura(contenidoArchivo.getContenido());
		
		System.out.println(cabecera);
		System.out.println(factura);
	}
	
	private static void notaCreditoTest() throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(new FileReader(PATH_FILE_NOTA_CREDITO));

		while ((line = in.readLine()) != null && !"".equals(line)) {
			if (line.substring(0, 1).equals(TIPO_LINEA_CABECERA)) {
				Cabecera cabecera = CabeceraPrincipalBuildUtil.getCabeceraFile(line);
		        System.out.println(cabecera);
		        
			} else if (line.substring(0, 1).equals(TIPO_LINEA_CABECERA_FACT)) {
				NotaCreditoNC notaCreditoNC = obtenerNotaCredito(line);
				System.out.println(notaCreditoNC);
				
			} else if (line.substring(0, 1).equals(TIPO_LINEA_DET)) {
				NotaCreditoNC notaCreditoNC = obtenerNotaCredito(line);
				for (DetalleNC detalle : notaCreditoNC.getDetalles()) {
					System.out.println(detalle);
				}
				
			} else if (line.substring(0, 1).equals(TIPO_LINEA_ADICIONAL)) {
				NotaCreditoNC notaCreditoNC = obtenerNotaCredito(line);
				for (AdicionalNC adicionalNC : notaCreditoNC.getAdicional()) {
					System.out.println(adicionalNC);
				}
			}
		}

		in.close();
	}
	
	private static void comprobanteRetencionTest() throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(new FileReader(PATH_FILE_RETENCIONES_ATS));

		while ((line = in.readLine()) != null && !"".equals(line)) {
			String tipoLinea = line.substring(0, 1);
			
			if (TIPO_LINEA_CABECERA.equals(tipoLinea)) {
				System.out.println(CabeceraPrincipalBuildUtil.getCabeceraFile(line));
		        
			} else if (TIPO_LINEA_CABECERA_FACT.equals(tipoLinea)) {
				System.out.println(obtenerRetencion(line));
				
			} else if (TIPO_LINEA_IMP.equals(tipoLinea)) {
				for (ImpuestoR impuestoR : obtenerRetencion(line).getImpuestos()) {
					System.out.println(impuestoR);
				}
				
			} else if (TIPO_LINEA_ADICIONAL.equals(tipoLinea)) {
				for (AdicionalR adicionalR : obtenerRetencion(line).getAdicional()) {
					System.out.println(adicionalR);
				}
			}
		}

		in.close();
	}
	
	private static void comprobanteRetencionCaFuseTest() throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(new FileReader(PATH_FILE_RETENCIONES_CA_FUSE_ERROR));

		while ((line = in.readLine()) != null && !"".equals(line)) {
			if (line.substring(0, 1).equals(TIPO_LINEA_CABECERA)) {
				System.out.println(CabeceraPrincipalBuildUtil.getCabeceraFile(line));
		        
			} else if (line.substring(0, 1).equals(TIPO_LINEA_CABECERA_FACT)) {
				System.out.println(obtenerRetencion(line));
				
			} else if (line.substring(0, 1).equals(TIPO_LINEA_IMP)) {
				for (ImpuestoR impuestoR : obtenerRetencion(line).getImpuestos()) {
					System.out.println(impuestoR);
				}
				
			} else if (line.substring(0, 1).equals(TIPO_LINEA_ADICIONAL)) {
				for (AdicionalR adicionalR : obtenerRetencion(line).getAdicional()) {
					System.out.println(adicionalR);
				}
			}
		}

		in.close();
	}
	
	private static void liquidacionComprasTest() throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(new FileReader(PATH_FILE_LIQUIDACION_COMPRAS));

		while ((line = in.readLine()) != null && !"".equals(line)) {
			System.out.println(obtenerLiquidacionCompras(line));
		}

		in.close();
	}
	
	private static void comprobanteRetencionAtsTest() throws Exception {
		ContentFile contenidoArchivo = getContentFile(PATH_FILE_RETENCIONES_ATS_V2);
		Cabecera cabecera = CabeceraPrincipalBuildUtil.getCabeceraFile(contenidoArchivo.getLineaCabecera());
		ComprobanteRetencionAts comprobanteRetencion = obtenerComprobanteRetencionAts(contenidoArchivo.getContenido());
		
		System.out.println(cabecera);
		System.out.println(comprobanteRetencion);
	}
	
	private static ContentFile getContentFile(String pFilePath) throws Exception {
		BufferedReader inFile = new BufferedReader(new FileReader(pFilePath));
		String lineaCabecera = inFile.readLine();
		String linea = inFile.readLine();
		StringBuilder contenido = new StringBuilder();

		while (linea != null) {
			contenido.append(linea).append("\n");
			linea = inFile.readLine();
		}

		inFile.close();
		
		ContentFile contentFile = new ContentFile();
		contentFile.setLineaCabecera(lineaCabecera);
		contentFile.setContenido(contenido.toString());

		return contentFile;
	}
	
}