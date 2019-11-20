package ec.com.kruger.util;

public abstract interface DocumentTransformUtil {

	public static final String CARACTER_SEPARADOR_ITERADOR = "@";
	public static final String CARACTER_SEPARADOR_DECIMAL = ",";
	public static final String BREAL_LINE = "\n";
	public static final String EMPTY = "";
	public static final String POINT = ".";
	public static final String DECIMAL = "0.00";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION DE ARCHIVO SFTP CABECERA PRINCIPAL
	// --------------------------------------------------------------------------------------------------------------------
	public static final String TIPO_LINEA_CABECERA = "T";
	public static final String CTR_TIPO_REGISTRO = "1";
	public static final String CTR_TRANSACCION = "3";
	public static final String CTR_FECHA_PROCESO = "8";
	public static final String CTR_HORA_PROCESO = "6";
	public static final String CTR_COD_EMPRESA = "3";
	public static final String CTR_RUC_EMPRESA = "13";
	public static final String CTR_AMBIENTE = "1";
	public static final String CTR_TIPO_EMISION = "1";
	public static final String CTR_CONTRIB_ESPECIAL = "5";
	public static final String CTR_OBLIGADO_CONTAB = "2";
	public static final String CTR_RAZON_SOCIAL = "80";
	public static final String CTR_NOMBRE_COMERCIAL = "80";
	public static final String CTR_DIR_MATRIZ = "60";
	public static final String CTR_PUNTO_VENTA = "3";
	public static final String CTR_NUMERO_REGISTROS = "8";
	public static final String CTR_NUMERO_COMPROBANTES = "8";
	public static final String CTR_OFFLINE = "1";
	public static final String CTR_FILLER_CAB_P = "117";

	// --------------------------------------------------------------------------------------------------------------------
	// TIPOS DE LINEA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String TIPO_LINEA_CABECERA_FACT = "C";
	public static final String TIPO_LINEA_CABECERA_COMPROBANTE = "C";
	public static final String TIPO_LINEA_IMP = "I";
	public static final String TIPO_LINEA_DET = "D";
	public static final String TIPO_LINEA_RET = "R";
	public static final String TIPO_LINEA_ADICIONAL = "A";
	public static final String TIPO_LINEA_MOTIVO = "M";
	public static final String TIPO_LINEA_REEMBOLSO = "R";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION DE CABECERA DE FACTURAS ELECTRONICAS
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEC01_TIPO_REGISTRO = "1";
	public static final String UGEC01_COD_DOC = "2";
	public static final String UGEC01_ESTAB = "3";
	public static final String UGEC01_PTO_EMISION = "3";
	public static final String UGEC01_SECUENCIAL = "9";
	public static final String UGEC01_FECHA_EMISION = "8";
	public static final String UGEC01_HORA_EMISION = "6";
	public static final String UGEC01_DIR_ESTABLECIMIENTO = "60";
	public static final String UGEC01_TIPO_IDENTIF_COMPRADOR = "2";
	public static final String UGEC01_RAZON_SOC_COMPRADOR = "80";
	public static final String UGEC01_IDENTIF_COMPRADOR = "13";
	public static final String UGEC01_TOTAL_SIN_IMPUESTO = "12,2";
	public static final String UGEC01_TOTAL_DESCUENTO = "12,2";
	public static final String UGEC01_PROPINA = "12,2";
	public static final String UGEC01_IMPORTE_TOTAL = "12,2";
	public static final String UGEC01_MONEDA = "15";
	public static final String UGEC01_GUIA_REMISION = "8";
	public static final String UGEC01_VALOR_PAGAR = "12,2";
	public static final String UGEC01_NUM_GENERADO = "8";
	public static final String UGEC01_FECHA_VIGENCIA = "8";
	public static final String UGEC01_OFICINA_BG = "3";
	public static final String UGEC01_PORC_IVA = "3";
	public static final String UGEC01_CLAVE_ACCESO_BG = "50";
	public static final String UGEC01_DIR_COMPRADOR = "40";
	public static final String UGEC01_COMP_CODIGO = "2";
	public static final String UGEC01_COMP_TARIFA = "2";
	public static final String UGEC01_COMP_SOLIDARIA = "12,2";
	public static final String FILLER_CAB_FAC = "2";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION TOTAL IMPUESTOS FACTURAS ELECTRONICAS
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEI01_TIPO_REGISTRO = "1";
	public static final String UGEI01_COD_DOC = "2";
	public static final String UGEI01_ESTAB = "3";
	public static final String UGEI01_PTO_EMISION = "3";
	public static final String UGEI01_SECUENCIAL = "9";
	public static final String UGEI01_TOT_CODIGO = "1";
	public static final String UGEI01_TOT_CODIGO_PORCENTAJE = "5";
	public static final String UGEI01_TOT_BASE_IMPONIBLE = "12,2";
	public static final String UGEI01_TOT_VALOR = "12,2";
	public static final String UGEI01_FORM_PAGO_ITE = "3";
	public static final String UGEI01_PAG_FORM_PAGO = "2";
	public static final String UGEI01_PAG_TOTAL = "12,2";
	public static final String UGEI01_PAG_PLAZO = "3";
	public static final String UGEI01_PAG_UNIDAD_T = "5";
	public static final String FILLER_IMP_FAC = "202";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION DEL DETALLE DEF FACTURAS ELECTRONICAS (inicio, cantidad de caracteres)
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGED01_TIPO_REGISTRO = "1";
	public static final String UGED01_COD_DOC = "2";
	public static final String UGED01_ESTAB = "3";
	public static final String UGED01_PTO_EMISION = "3";
	public static final String UGED01_SECUENCIAL = "9";
	public static final String UGED01_CODIGO_PRINCIPAL = "8";
	public static final String UGED01_CODIGO_AUX = "2";
	public static final String UGED01_DESCRIPCION = "65";
	public static final String UGED01_CANTIDAD = "7,2";
	public static final String UGED01_PRECIO_UNITARIO = "12,2";
	public static final String UGED01_DESCUENTO = "12,2";
	public static final String UGED01_PRECIO_TOTAL_SIN_IMP = "12,2";
	public static final String UGED01_IMP_DET_ITE = "5";
	public static final String UGED01_IMP_CODIGO = "1";
	public static final String UGED01_IMP_CODIGO_PORCENTAJE = "5";
	public static final String UGED01_IMP_TARIFA = "5,2";
	public static final String UGED01_IMP_BASE_IMPONIBLE = "12,2";
	public static final String UGED01_IMP_VALOR = "12,2";
	public static final String FILLER_DET_FAC = "139";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION RETENCIONES DE FACTURA ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGER01_TIPO_REGISTRO = "1";
	public static final String UGER01_COD_DOC = "2";
	public static final String UGER01_ESTAB = "3";
	public static final String UGER01_PTO_EMISION = "3";
	public static final String UGER01_SECUENCIAL = "9";
	public static final String UGER01_CODIGO = "1";
	public static final String UGER01_CODIGO_PORCENTAJE = "5";
	public static final String UGER01_TARIFA = "5,2";
	public static final String UGER01_VALOR = "12,2";
	public static final String FILLER_RET_FAC = "359";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION INF.ADICIONAL FACTURA ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEA01_TIPO_REGISTRO = "1";
	public static final String UGEA01_COD_DOC = "2";
	public static final String UGEA01_ESTAB = "3";
	public static final String UGEA01_PTO_EMISION = "3";
	public static final String UGEA01_SECUENCIAL = "9";
	public static final String UGEA01_INFO_ADICIONAL_1 = "100";
	public static final String UGEA01_INFO_ADICIONAL_2 = "100";
	public static final String FILLER_AD_FAC = "182";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION CABECERA DE NOTA DE CREDITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEC04_TIPO_REGISTRO = "1";
	public static final String UGEC04_COD_DOC = "2";
	public static final String UGEC04_ESTAB = "3";
	public static final String UGEC04_PTO_EMISION = "3";
	public static final String UGEC04_SECUENCIAL = "9";
	public static final String UGEC04_FECHA_EMISION = "8";
	public static final String UGEC04_HORA_EMISION = "6";
	public static final String UGEC04_DIR_ESTABLECIMIENTO = "60";
	public static final String UGEC04_TIPO_IDENTIF_COMPRADOR = "2";
	public static final String UGEC04_RAZON_SOC_COMPRADOR = "80";
	public static final String UGEC04_IDENTIF_COMPRADOR = "13";
	public static final String UGEC04_RISE = "28";
	public static final String UGEC04_VALOR_PAGAR = "12,2";
	public static final String UGEC04_COD_DOC_MODIF = "2";
	public static final String UGEC04_NUM_DOC_MODIF = "20";
	public static final String UGEC04_FEC_EMI_DOC_SUSTENTO = "8";
	public static final String UGEC04_TOTAL_SIN_IMPUESTO = "12,2";
	public static final String UGEC04_VALOR_MODIFICACION = "12,2";
	public static final String UGEC04_MONEDA = "15";
	public static final String UGEC04_MOTIVO = "30";
	public static final String UGEC04_NUM_GENERADO = "8";
	public static final String UGEC04_FECHA_VIGENCIA = "8";
	public static final String UGEC04_OFICINA_BG = "3";
	public static final String UGEC04_PORC_IVA = "3";
	public static final String UGEC04_CLAVE_ACCESO_BG = "50";
	public static final String FILLER_CAB_NC = "1";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION TOTAL IMPUESTOS NOTA DE CREDITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEI04_TIPO_REGISTRO = "1";
	public static final String UGEI04_COD_DOC = "2";
	public static final String UGEI04_ESTAB = "3";
	public static final String UGEI04_PTO_EMISION = "3";
	public static final String UGEI04_SECUENCIAL = "9";
	public static final String UGEI04_CODIGO = "1";
	public static final String UGEI04_CODIGO_PORCENTAJE = "5";
	public static final String UGEI04_BASE_IMPONIBLE = "12,2";
	public static final String UGEI04_VALOR = "12,2";
	public static final String UGEI04_FORM_PAGO_ITE = "3";
	public static final String UGEI04_PAG_FORM_PAGO = "30";
	public static final String UGEI04_PAG_PLAZO = "3";
	public static final String UGEI04_PAG_TOTAL = "12,2";
	public static final String UGEI04_PAG_UNIDAD_T = "5";
	public static final String UGEI04_COMP_CODIGO = "2";
	public static final String UGEI04_COMP_TARIFA = "2";
	public static final String UGEI04_COMP_SOLIDARIA = "12,2";
	public static final String FILLER_IMP_NC = "186";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION DETALLE NOTA DE CREDITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGED04_TIPO_REGISTRO = "1";
	public static final String UGED04_COD_DOC = "2";
	public static final String UGED04_ESTAB = "3";
	public static final String UGED04_PTO_EMISION = "3";
	public static final String UGED04_SECUENCIAL = "9";
	public static final String UGED04_CODIGO_INTERNO = "8";
	public static final String UGED04_CODIGO_ADICIONAL = "2";
	public static final String UGED04_DESCRIPCION = "65";
	public static final String UGED04_CANTIDAD = "7,2";
	public static final String UGED04_PRECIO_UNITARIO = "12,2";
	public static final String UGED04_DESCUENTO = "12,2";
	public static final String UGED04_PRECIO_TOTAL_SIN_IMP = "12,2";
	public static final String UGES04_IMP_ITE = "5";
	public static final String UGED04_IMP_CODIGO = "1";
	public static final String UGED04_IMP_CODIGO_PORCENTAJE = "5";
	public static final String UGED04_IMP_TARIFA = "5,2";
	public static final String UGED04_IMP_BASE_IMPONIBLE = "12,2";
	public static final String UGED04_IMP_VALOR = "12,2";
	public static final String FILLER_DET_NC = "129";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION INF.ADICIONAL NOTA DE CREDITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEA04_TIPO_REGISTRO = "1";
	public static final String UGEA04_COD_DOC = "2";
	public static final String UGEA04_ESTAB = "3";
	public static final String UGEA04_PTO_EMISION = "3";
	public static final String UGEA04_SECUENCIAL = "9";
	public static final String UGEA04_INFO_ADICIONAL_1 = "100";
	public static final String UGEA04_INFO_ADICIONAL_2 = "10";
	public static final String FILLER_AD_NC = "182";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION CABECERA DE NOTA DE DEBITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEC05_TIPO_REGISTRO = "1";
	public static final String UGEC05_COD_DOC = "2";
	public static final String UGEC05_ESTAB = "3";
	public static final String UGEC05_PTO_EMISION = "3";
	public static final String UGEC05_SECUENCIAL = "9";
	public static final String UGEC05_FECHA_EMISION = "8";
	public static final String UGEC05_HORA_EMISION = "6";
	public static final String UGEC05_DIR_ESTABLECIMIENTO = "60";
	public static final String UGEC05_TIPO_IDENTIF_COMPRADOR = "2";
	public static final String UGEC05_RAZON_SOC_COMPRADOR = "80";
	public static final String UGEC05_IDENTIF_COMPRADOR = "13";
	public static final String UGEC05_RISE = "40";
	public static final String UGEC05_COD_DOC_MODIF = "2";
	public static final String UGEC05_NUM_DOC_MODIF = "20";
	public static final String UGEC05_FEC_EMI_DOC_SUSTENTO = "8";
	public static final String UGEC05_TOTAL_SIN_IMPUESTOS = "12,2";
	public static final String UGEC05_VALOR_TOTAL = "12,2";
	public static final String UGEC05_NUM_GENERADO = "8";
	public static final String UGEC05_FECHA_VIGENCIA = "8";
	public static final String UGEC05_OFICINA_BG = "3";
	public static final String UGEC05_CLAVE_ACCESO_BG = "50";
	public static final String UGEC05_COMP_CODIGO = "2";
	public static final String UGEC05_COMP_TARIFA = "2";
	public static final String UGEC05_COMP_SOLIDARIA = "12,2";
	public static final String UGEC05_VALOR_PAGAR = "12,2";
	public static final String FILLER_CAB_ND = "22";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION IMPUESTOS NOTA DE DEBITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEI05_TIPO_REGISTRO = "1";
	public static final String UGEI05_COD_DOC = "2";
	public static final String UGEI05_ESTAB = "3";
	public static final String UGEI05_PTO_EMISION = "3";
	public static final String UGEI05_SECUENCIAL = "9";
	public static final String UGEI05_CODIGO = "1";
	public static final String UGEI05_CODIGO_PORCENTAJE = "5";
	public static final String UGEI05_TARIFA = "5";
	public static final String UGEI05_BASE_IMPONIBLE = "12,2";
	public static final String UGEI05_VALOR = "12,2";
	public static final String UGEI05_FORM_PAG_ITE = "3";
	public static final String UGEI05_PAG_FORM_PAGO = "30";
	public static final String UGEI05_PAG_TOTAL = "12,2";
	public static final String UGEI05_PAG_PLAZO = "3";
	public static final String UGEI05_PAG_UNIDAD_T = "5";
	public static final String FILLER_IMP_ND = "197";

	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION MOTIVOS NOTA DE DEBITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEM05_TIPO_REGISTRO = "1";
	public static final String UGEM05_COD_DOC = "5";
	public static final String UGEM05_ESTAB = "3";
	public static final String UGEM05_PTO_EMISION = "3";
	public static final String UGEM05_SECUENCIAL = "9";
	public static final String UGEM05_RAZON = "50";
	public static final String UGEM05_VALOR = "12,2";
	public static final String FILLER_MOT_ND = "320";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION INF.ADICIONAL NOTA DE DEBITO ELECTRONICA
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEA05_TIPO_REGISTRO = "1";
	public static final String UGEA05_COD_DOC = "2";
	public static final String UGEA05_ESTAB = "3";
	public static final String UGEA05_PTO_EMISION = "3";
	public static final String UGEA05_SECUENCIAL = "9";
	public static final String UGEA05_INFO_ADICIONAL_1 = "100";
	public static final String UGEA05_INFO_ADICIONAL_2 = "100";
	public static final String FILLER_AD_ND = "182";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION CABECERA DE COMPROBANTES DE RETENCION
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEC07_TIPO_REGISTRO = "1";
	public static final String UGEC07_COD_DOC = "2";
	public static final String UGEC07_ESTAB = "3";
	public static final String UGEC07_PTO_EMISION = "3";
	public static final String UGEC07_SECUENCIAL = "9";
	public static final String UGEC07_FECHA_EMISION = "8";
	public static final String UGEC07_HORA_EMISION = "6";
	public static final String UGEC07_DIR_ESTABLECIMIENTO = "60";
	public static final String UGEC07_TIPO_IDENTIF_RETENIDO = "2";
	public static final String UGEC07_RAZON_SOC_RETENIDO = "80";
	public static final String UGEC07_ID_RETENIDO = "13";
	public static final String UGEC07_PERIODO_FISCAL = "6";
	public static final String UGEC07_NUM_GENERADO = "8";
	public static final String UGEC07_FECHA_VIGENCIA = "8";
	public static final String UGEC07_OFICINA_BG = "3";
	public static final String UGEC07_SECUENCIAL_BG = "9";
	public static final String UGEC07_PORC_IVA = "3";
	public static final String UGEC07_CLAVE_ACCESO_BG = "50";
	public static final String FILLER_CAB_RET = "126";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION IMPUESTO COMPROBANTES RETENCION ELECTRONICO
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEI07_TIPO_REGISTRO = "1";
	public static final String UGEI07_COD_DOC = "2";
	public static final String UGEI07_ESTAB = "3";
	public static final String UGEI07_PTO_EMISION = "3";
	public static final String UGEI07_SECUENCIAL = "9";
	public static final String UGEI07_CODIGO = "1";
	public static final String UGEI07_CODIGO_RETENCION = "5";
	public static final String UGEI07_BASE_IMPONIBLE = "12,2";
	public static final String UGEI07_PORCENTAJE_RETENER = "3";
	public static final String UGEI07_VALOR_RETENIDO = "12,2";
	public static final String UGEI07_COD_DOC_SUSTENTO = "2";
	public static final String UGEI07_NUM_DOC_SUSTENTO = "20";
	public static final String UGEI07_FEC_EMI_DOC_SUSTENTO = "8";
	public static final String FILLER_IMP_RET = "319";

	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION INF.ADICIONAL COMPROBANTE RETENCION
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEA07_TIPO_REGISTRO = "1";
	public static final String UGEA07_COD_DOC = "2";
	public static final String UGEA07_ESTAB = "3";
	public static final String UGEA07_PTO_EMISION = "3";
	public static final String UGEA07_SECUENCIAL = "9";
	public static final String UGEA07_INFO_ADICIONAL_1 = "100";
	public static final String UGEA07_INFO_ADICIONAL_2 = "100";
	public static final String FILLER_AD_RET = "182";
	
	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION DE CABECERA DE LIQUIDACION DE COMPRAS
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEC03_TIPO_REGISTRO = "1";
	public static final String UGEC03_CODIGO_DOCUMENTO = "2";
	public static final String UGEC03_ESTABLECIMIENTO = "3";
	public static final String UGEC03_PUNTO_EMISION = "3";
	public static final String UGEC03_SECUENCIAL = "9";
	public static final String UGEC03_FECHA_EMISION = "8";
	public static final String UGEC03_HORA_EMISION = "6";
	public static final String UGEC03_DIRECCION_ESTABLECIMIENTO = "60";
	public static final String UGEC03_TIPO_IDENTIFICACION_PROVEEDOR = "2";
	public static final String UGEC03_RAZON_SOCIAL_PROVEEDOR = "80";
	public static final String UGEC03_IDENTIFICACION_PROVEEDOR = "13";
	public static final String UGEC03_DIRECCION_PROVEEDOR = "25";
	public static final String UGEC03_TOTAL_SIN_IMPUESTO = "12,2";
	public static final String UGEC03_TOTAL_DESCUENTO = "12,2";
	public static final String UGEC03_CODIGO_DOCUMENTO_REEMBOLSO = "2";
	public static final String UGEC03_TOTAL_COMPROBANTE_REEMBOLSO = "12,2";
	public static final String UGEC03_TOTAL_BASE_IMPONIBLE_REEMBOLSO = "12,2";
	public static final String UGEC03_TOTAL_IMPUESTO_REEMBOLSO = "12,2";
	public static final String UGEC03_IMPORTE_TOTAL = "12,2";
	public static final String UGEC03_MONEDA = "15";
	public static final String UGEC03_FECHA_VIGENCIA = "8";
	public static final String UGEC03_OFICINA_BG = "3";
	public static final String UGEC03_PORCENTAJE_IVA = "3";
	public static final String UGEC03_CLAVE_ACCESO = "50";
	public static final String UGEC03_FILLER_CABECERA_LIQUIDACION_COMPRAS = "35";
	
	// --------------------------------------------------------------------------------------------------------------------
	// DEFINICION TOTAL IMPUESTOS LIQUIDACION DE COMPRAS
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEI03_TIPO_REGISTRO = "1";
	public static final String UGEI03_CODIGO_DOCUMENTO = "2";
	public static final String UGEI03_ESTABLECIMIENTO = "3";
	public static final String UGEI03_PUNTO_EMISION = "3";
	public static final String UGEI03_SECUENCIAL = "9";
	public static final String UGEI03_TOTAL_CODIGO = "1";
	public static final String UGEI03_TOTAL_CODIGO_PORCENTAJE = "5";
	public static final String UGEI03_TOTAL_DESCUENTO_ADICIONAL = "12,2";
	public static final String UGEI03_TOTAL_BASE_IMPONIBLE = "12,2";
	public static final String UGEI03_TOTAL_TARIFA = "12,2";
	public static final String UGEI03_TOTAL_VALOR = "12,2";
	public static final String UGEI03_FORMA_PAGO_ITEM = "3";
	public static final String UGEI03_PAGO_FORMA_PAGO = "2";
	public static final String UGEI03_PAGO_TOTAL = "12,2";
	public static final String UGEI03_PAGO_PLAZO = "3";
	public static final String UGEI03_PAGO_UNIDAD_T = "5";
	public static final String UGEI03_FILLER_IMPUESTO_LIQUIDACION_COMPRAS = "202";
	
	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION DEL DETALLE DE LIQUIDACION DE COMPRAS ELECTRONICAS (inicio, cantidad de caracteres)
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGED03_TIPO_REGISTRO = "1";
	public static final String UGED03_COD_DOC = "2";
	public static final String UGED03_ESTAB = "3";
	public static final String UGED03_PTO_EMISION = "3";
	public static final String UGED03_SECUENCIAL = "9";
	public static final String UGED03_CODIGO_PRINCIPAL = "8";
	public static final String UGED03_CODIGO_AUX = "2";
	public static final String UGED03_DESCRIPCION = "65";
	public static final String UGED03_CANTIDAD = "7,2";
	public static final String UGED03_PRECIO_UNITARIO = "12,2";
	public static final String UGED03_DESCUENTO = "12,2";
	public static final String UGED03_PRECIO_TOTAL_SIN_IMP = "12,2";
	public static final String UGED03_IMP_DET_ITE = "5";
	public static final String UGED03_IMP_CODIGO = "1";
	public static final String UGED03_IMP_CODIGO_PORCENTAJE = "5";
	public static final String UGED03_IMP_TARIFA = "9,2";
	public static final String UGED03_IMP_BASE_IMPONIBLE = "12,2";
	public static final String UGED03_IMP_VALOR = "12,2";
	public static final String UGED03_FILLER_DETALLE_LIQUIDACION_COMPRAS = "139";
	
	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION DE REEMBOLSO DE LIQUIDACION DE COMPRAS ELECTRONICAS (inicio, cantidad de caracteres)
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGED03_REEMBOLSO_TIPO_REGISTRO = "1";
	public static final String UGED03_REEMBOLSO_CODIGO_DOCUMENTO = "2";
	public static final String UGED03_REEMBOLSO_ESTABLECIMIENTO = "3";
	public static final String UGED03_REEMBOLSO_PUNTO_EMISION = "3";
	public static final String UGED03_REEMBOLSO_SECUENCIAL = "9";
	public static final String UGED03_REEMBOLSO_TIPO_IDENTIFICACION_PROVEEDOR = "2";
	public static final String UGED03_REEMBOLSO_IDENTIFICACION_PROVEEDOR = "13";
	public static final String UGED03_REEMBOLSO_CODIGO_PAIS_PAGO_PROVEEDOR = "3";
	public static final String UGED03_REEMBOLSO_TIPO_PROVEEDOR_REEMBOLSO = "2";
	public static final String UGED03_REEMBOLSO_CODIGO_DOCUMENTO_REEMBOLSO = "3";
	public static final String UGED03_REEMBOLSO_ESTABLECIMIENTO_DOCUMENTO = "3";
	public static final String UGED03_REEMBOLSO_PUNTO_EMISION_DOCUMENTO = "3";
	public static final String UGED03_REEMBOLSO_SECUENCIAL_DOCUMENTO= "9";
	public static final String UGED03_REEMBOLSO_FECHA_EMISION_DOCUMENTO = "8";
	public static final String UGED03_REEMBOLSO_NUMERO_AUTORIZACION_DOCUMENTO= "50";
	public static final String UGED03_REEMBOLSO_IMPUESTO_ITEM = "5";
	public static final String UGED03_REEMBOLSO_IMP_CODIGO = "1";
	public static final String UGED03_REEMBOLSO_IMP_CODIGO_PORCENTAJE = "5";
	public static final String UGED03_REEMBOLSO_IMP_TARIFA = "9,2";
	public static final String UGED03_REEMBOLSO_IMP_BASE_IMPONIBLE = "12,2";
	public static final String UGED03_REEMBOLSO_IMP_REEMBOLSO = "12,2";
	public static final String UGED03_REEMBOLSO_FILLER_LIQUIDACION_COMPRAS = "139";
	
	// --------------------------------------------------------------------------------------------------------------------
	// REDEFICION INFORMACION ADICIONAL DE LIQUIDACION DE COMPRAS
	// --------------------------------------------------------------------------------------------------------------------
	public static final String UGEA03_INFORMACION_ADICIONAL_TIPO_REGISTRO = "1";
	public static final String UGEA03_INFORMACION_ADICIONAL_CODIGO_DOCUMENTO = "2";
	public static final String UGEA03_INFORMACION_ADICIONAL_ESTABLECIMIENTO = "3";
	public static final String UGEA03_INFORMACION_ADICIONAL_PUNTO_EMISION = "3";
	public static final String UGEA03_INFORMACION_ADICIONAL_SECUENCIAL = "9";
	public static final String UGEA03_INFORMACION_ADICIONAL_INFO_ADICIONAL_1 = "100";
	public static final String UGEA03_INFORMACION_ADICIONAL_INFO_ADICIONAL_2 = "100";
	public static final String FILLER_INFORMACION_ADICIONAL_LIQUIDACION_COMPRAS = "182";

}