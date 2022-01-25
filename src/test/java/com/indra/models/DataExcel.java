package com.indra.models;

import com.indra.actions.ReadFileXLSX;

public class DataExcel {
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

    ReadFileXLSX fileXLSX = new ReadFileXLSX();

    public String getUrlEpos() {
        return urlEpos;
    }

    public String getUrlCRM() {
        return urlCRM;
    }

    public String getUrlComfirmador() {
        return urlComfirmador;
    }

    public String getUrlGatewayCBS() {
        fileXLSX.readFileExcel();
        urlGatewayCBS = fileXLSX.excelArray.get(1).get(3);
        return urlGatewayCBS;
    }

    public String getUrlGatewayMG() {
        fileXLSX.readFileExcel();
        urlGatewayMG = fileXLSX.excelArray.get(1).get(4);
        return urlGatewayMG;
    }

    public String getMSISDN() {
        fileXLSX.readFileExcel();
        MSISDN = fileXLSX.excelArray.get(10).get(2);
        return MSISDN;
    }

    public String getPlu() {
        return Plu;
    }

    public String getSerial() {
        return Serial;
    }

    public ReadFileXLSX getFileXLSX() {
        return fileXLSX;
    }

    public String getUrlDBA() {
        fileXLSX.readFileExcel();
        urlDBA = fileXLSX.excelArray.get(3).get(0);
        return urlDBA;
    }

    public String getServiceA() {
        fileXLSX.readFileExcel();
        serviceA = fileXLSX.excelArray.get(3).get(1);
        return serviceA;
    }

    public String getUserA() {
        fileXLSX.readFileExcel();
        userA = fileXLSX.excelArray.get(3).get(2);
        return userA;
    }

    public String getPasswordA() {
        fileXLSX.readFileExcel();
        passwordA = fileXLSX.excelArray.get(3).get(3);
        return passwordA;
    }

    public String getUrlDBE() {
        fileXLSX.readFileExcel();
        urlDBE = fileXLSX.excelArray.get(4).get(0);
        return urlDBE;
    }

    public String getServiceE() {
        fileXLSX.readFileExcel();
        serviceE = fileXLSX.excelArray.get(4).get(1);
        return serviceE;
    }

    public String getUserE() {
        fileXLSX.readFileExcel();
        userE = fileXLSX.excelArray.get(4).get(2);
        return userE;
    }

    public String getPasswordE() {
        fileXLSX.readFileExcel();
        passwordE = fileXLSX.excelArray.get(4).get(3);
        return passwordE;
    }

    public String getUrlDBS() {
        fileXLSX.readFileExcel();
        urlDBS = fileXLSX.excelArray.get(6).get(0);
        return urlDBS;
    }

    public String getServiceS() {
        fileXLSX.readFileExcel();
        serviceS = fileXLSX.excelArray.get(6).get(1);
        return serviceS;
    }

    public String getUserS() {
        fileXLSX.readFileExcel();
        userS = fileXLSX.excelArray.get(6).get(2);
        return userS;
    }

    public String getPasswordS() {
        fileXLSX.readFileExcel();
        passwordS = fileXLSX.excelArray.get(6).get(3);
        return passwordS;
    }

    public String getUrlDBP() {
        fileXLSX.readFileExcel();
        urlDBP = fileXLSX.excelArray.get(5).get(0);
        return urlDBP;
    }

    public String getServiceP() {
        fileXLSX.readFileExcel();
        serviceP = fileXLSX.excelArray.get(5).get(1);
        return serviceP;
    }

    public String getUserP() {
        fileXLSX.readFileExcel();
        userP = fileXLSX.excelArray.get(5).get(2);
        return userP;
    }

    public String getPasswordP() {
        fileXLSX.readFileExcel();
        passwordP = fileXLSX.excelArray.get(5).get(3);
        return passwordP;
    }

    public String getPort() {
        port = "1521";
        return port;
    }
}
