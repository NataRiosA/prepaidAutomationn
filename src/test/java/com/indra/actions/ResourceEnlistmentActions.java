package com.indra.actions;
import com.indra.models.DataExcelModels;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ResourceEnlistmentActions extends DataExcelModels {
    UninstallCBSServicesActions uninstallCBSServicesActions = new UninstallCBSServicesActions();
    DatabaseConnectionActions databaseConnectionActions = new DatabaseConnectionActions();
    ReadFileXLSXActions fileXLSX = new ReadFileXLSXActions();
    List<String> listMsisdn = new ArrayList<>();
    List<String> listMsi = new ArrayList<>();
    /**  Este metodo retorna una lista de los valores de la columna especificada, la columna de excel donde estan ya sea
     * los msisdn o los msi */
    public void enlistment(int sheet){
        fileXLSX.readFileExcel(sheet);
        List<ArrayList<String>> dataTest = new ArrayList<>();
        dataTest = fileXLSX.excelArray.subList(10,fileXLSX.excelArray.size());
        for (int i = 0 ; i< dataTest.size(); i++){
            String dato;
            dato= String.valueOf(dataTest.get(i));
            //System.out.println(dato.split(",")[2].replace("]","").trim());
            listMsisdn.add(dato.split(",")[2].replace("]","").trim());
            //System.out.printf(String.valueOf(listMsisdn));
            listMsi.add(dato.split(",")[3].replace("]","").trim());
        }
        //System.out.println(listCol);
    }
    /** ejemplo del metodo que ejecutaria los dos procesos para cada linea tanto los servicios del SOAP como los SP */
    public void executeAllProcedures(int sheet) throws SQLException {
        enlistment(sheet);
        int total = listMsisdn.size();
        int i = 0;
        while(!(i ==total)) {
            uninstallCBSServicesActions.performLineCleaning(getUrlGatewayCBS(sheet), getUrlGatewayMG(sheet), listMsisdn.get(i));
            //colocar metodo de base de datos
            databaseConnectionActions.executeAllProcedures(listMsi.get(i), listMsisdn.get(i), sheet);
            i++;
        }
    }
}