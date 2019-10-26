package ec.com.kruger.util.impl;

import java.io.Serializable;

import ec.com.kruger.bean.principal.Cabecera;
import ec.com.kruger.util.DocumentTransformUtil;
import ec.com.kruger.util.LineProperty;

public class CabeceraPrincipalBuildUtil implements DocumentTransformUtil, Serializable {

	private static final long serialVersionUID = 1L;

	public static Cabecera getCabeceraFile(String pLine) {
		Cabecera cabecera = new Cabecera();
		
		LineProperty lineProperty = DocumentTransformUtilImpl.getLineProperty(pLine, CTR_TIPO_REGISTRO);
		cabecera.setCtrTipoRegistro(lineProperty.getValue());
		
		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_TRANSACCION);
		cabecera.setCtrTransaccion(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_FECHA_PROCESO);
		cabecera.setCtrFechaProceso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_HORA_PROCESO);
		cabecera.setCtrHoraProceso(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_COD_EMPRESA);
		cabecera.setCtrCodigoEmpresa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_RUC_EMPRESA);
		cabecera.setCtrRucEmpresa(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_AMBIENTE);
		cabecera.setCtrAmbiente(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_TIPO_EMISION);
		cabecera.setCtrTipoEmision(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_CONTRIB_ESPECIAL);
		cabecera.setCtrContribEspecial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_OBLIGADO_CONTAB);
		cabecera.setCtrObligadoContab(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_RAZON_SOCIAL);
		cabecera.setCtrRazonSocial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_NOMBRE_COMERCIAL);
		cabecera.setCtrNombreComercial(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_DIR_MATRIZ);
		cabecera.setCtrDirMatriz(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_PUNTO_VENTA);
		cabecera.setCtrPuntoVenta(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_NUMERO_REGISTROS);
		cabecera.setCtrNumeroRegistros(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_NUMERO_COMPROBANTES);
		cabecera.setCtrNumeroComprobantes(lineProperty.getValue());

		lineProperty = DocumentTransformUtilImpl.getLineProperty(lineProperty.getNewLine(), CTR_OFFLINE);
		cabecera.setCtrOffLine(lineProperty.getValue());
		
		cabecera.setCtrFiller(lineProperty.getNewLine().trim());

		return cabecera;
	}

}
