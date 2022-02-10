package com.indra.models;

import com.indra.actions.ReadFileXLSXActions;

public class DataExcelModels{

    ReadFileXLSXActions fileXLSX = new ReadFileXLSXActions();

    String urlEpos;
    String urlCRM;
    String urlComfirmador;
    String urlGatewayCBS;
    String urlGatewayMG;
    String MSISDN;
    String Plu;
    String Serial;
    String urlDBA;
    String serviceA;
    String userA;
    String passwordA;
    String urlDBE;
    String serviceE;
    String userE;
    String passwordE;
    String urlDBS;
    String serviceS;
    String userS;
    String passwordS;
    String urlDBP;
    String serviceP;
    String userP;
    String passwordP;
    String port;

    String vendedorPrepago;
    String cedulaClientePrepago;
    String msisdnPrepago;
    String msiPrepago;

    String VendedorPostpago;
    String CedulaClientePostpago;
    String msisdnPostpago;
    String msiPostpago;

    String Winwap;
    String user;
    String password;


    public String getVendedorPrepago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        vendedorPrepago = fileXLSX.excelArray.get(8).get(0);
        return vendedorPrepago;
    }

    public String getCedulaClientePrepago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        cedulaClientePrepago = fileXLSX.excelArray.get(8).get(1);
        return cedulaClientePrepago;
    }

    public String getMsisdnPrepago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        msisdnPrepago = fileXLSX.excelArray.get(8).get(2);
        return msisdnPrepago;
    }

    public String getMsiPrepago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        msiPrepago = fileXLSX.excelArray.get(8).get(3);
        return msiPrepago;
    }

    public String getVendedorPostpago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        VendedorPostpago = fileXLSX.excelArray.get(9).get(0);
        return VendedorPostpago;
    }

    public String getCedulaClientePostpago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        CedulaClientePostpago = fileXLSX.excelArray.get(9).get(1);
        return CedulaClientePostpago;
    }

    public String getMsisdnPostpago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        msisdnPostpago = fileXLSX.excelArray.get(9).get(2);
        return msisdnPostpago;
    }

    public String getMsiPostpago(int sheet) {
        fileXLSX.readFileExcel(sheet);
        msiPostpago = fileXLSX.excelArray.get(9).get(3);
        return msiPostpago;
    }

    public String getUrlEpos(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlEpos = fileXLSX.excelArray.get(1).get(0);
        return urlEpos;
    }

    public String getUrlCRM(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlCRM = fileXLSX.excelArray.get(1).get(1);
        return urlCRM;
    }

    public String getUrlComfirmador(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlComfirmador = fileXLSX.excelArray.get(1).get(2);
        return urlComfirmador;
    }

    public String getUrlGatewayCBS(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlGatewayCBS = fileXLSX.excelArray.get(1).get(3);
        return urlGatewayCBS;
    }

    public String getUrlGatewayMG(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlGatewayMG = fileXLSX.excelArray.get(1).get(4);
        return urlGatewayMG;
    }

    public String getMSISDN(int sheet) {
        fileXLSX.readFileExcel(sheet);
        MSISDN = fileXLSX.excelArray.get(10).get(2);
        return MSISDN;
    }

    public String getPlu(int sheet) {
        return Plu;
    }

    public String getSerial(int sheet) {
        return Serial;
    }

    public String getUrlDBA(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlDBA = fileXLSX.excelArray.get(3).get(0);
        return urlDBA;
    }

    public String getServiceA(int sheet) {
        fileXLSX.readFileExcel(sheet);
        serviceA = fileXLSX.excelArray.get(3).get(1);
        return serviceA;
    }

    public String getUserA(int sheet) {
        fileXLSX.readFileExcel(sheet);
        userA = fileXLSX.excelArray.get(3).get(2);
        return userA;
    }

    public String getPasswordA(int sheet) {
        fileXLSX.readFileExcel(sheet);
        passwordA = fileXLSX.excelArray.get(3).get(3);
        return passwordA;
    }

    public String getUrlDBE(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlDBE = fileXLSX.excelArray.get(4).get(0);
        return urlDBE;
    }

    public String getServiceE(int sheet) {
        fileXLSX.readFileExcel(sheet);
        serviceE = fileXLSX.excelArray.get(4).get(1);
        return serviceE;
    }

    public String getUserE(int sheet) {
        fileXLSX.readFileExcel(sheet);
        userE = fileXLSX.excelArray.get(4).get(2);
        return userE;
    }

    public String getPasswordE(int sheet) {
        fileXLSX.readFileExcel(sheet);
        passwordE = fileXLSX.excelArray.get(4).get(3);
        return passwordE;
    }

    public String getUrlDBS(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlDBS = fileXLSX.excelArray.get(6).get(0);
        return urlDBS;
    }

    public String getServiceS(int sheet) {
        fileXLSX.readFileExcel(sheet);
        serviceS = fileXLSX.excelArray.get(6).get(1);
        return serviceS;
    }

    public String getUserS(int sheet) {
        fileXLSX.readFileExcel(sheet);
        userS = fileXLSX.excelArray.get(6).get(2);
        return userS;
    }

    public String getPasswordS(int sheet) {
        fileXLSX.readFileExcel(sheet);
        passwordS = fileXLSX.excelArray.get(6).get(3);
        return passwordS;
    }

    public String getUrlDBP(int sheet) {
        fileXLSX.readFileExcel(sheet);
        urlDBP = fileXLSX.excelArray.get(5).get(0);
        return urlDBP;
    }

    public String getServiceP(int sheet) {
        fileXLSX.readFileExcel(sheet);
        serviceP = fileXLSX.excelArray.get(5).get(1);
        return serviceP;
    }

    public String getUserP(int sheet) {
        fileXLSX.readFileExcel(sheet);
        userP = fileXLSX.excelArray.get(5).get(2);
        return userP;
    }

    public String getPasswordP(int sheet) {
        fileXLSX.readFileExcel(sheet);
        passwordP = fileXLSX.excelArray.get(5).get(3);
        return passwordP;
    }

    public String getPort() {
        port = "1521";
        return port;
    }


    public String getWinwap(int sheet) {
        fileXLSX.readFileExcel(sheet);
        Winwap = fileXLSX.excelArray.get(1).get(7);
        return Winwap;
    }

    public String getUser(int sheet) {
        fileXLSX.readFileExcel(sheet);
        user = fileXLSX.excelArray.get(1).get(5);
        return user;
    }

    public String getPassword(int sheet) {
        fileXLSX.readFileExcel(sheet);
        password = fileXLSX.excelArray.get(1).get(6);
        return password;
    }
}
