package com.indra.actions;

import com.indra.models.DataExcelModels;
import oracle.jdbc.datasource.impl.OracleDataSource;

import java.sql.*;

public class DatabaseConnectionActions extends DataExcelModels {

        public void executeAllProcedures(String msi, String msisdn, int sheet) throws SQLException {
            databaseConnectionActivator(getUrlDBA(sheet),getPort(),getServiceA(sheet),getUserA(sheet),getPasswordA(sheet)
                    ,"AL_RE_ACTIVADOR", msisdn);
            databaseConnectionEpos(getUrlDBE(sheet), getPort(), getServiceE(sheet),getUserE(sheet),getPasswordE(sheet)
                    ,"ali_re_epos_crm_siebel", msi, msisdn);
            databaseConnectionSiebel(getUrlDBS(sheet), getPort(), getServiceS(sheet),getUserS(sheet),getPasswordS(sheet)
                    ,"alistamiento_recursos_siebel", msi, msisdn);
            databaseConnectionPostsale(getUrlDBP(sheet), getPort(), getServiceP(sheet),getUserP(sheet),getPasswordP(sheet)
                    ,"alistamiento_recursos_postsale", msisdn);
        }

        public void databaseConnectionActivator(String url, String port, String service, String user, String password,
                                   String sp, String msisdn) throws SQLException {
            OracleDataSource ods = null;
            Connection conn= null;
            ResultSet resultSet;
            // Create DataSource and connect to the local database
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
            ods.setUser(user);
            ods.setPassword(password);
            conn = ods.getConnection();
            try
            {
                // Query the employee names
                String query = "begin "+sp+"(?); end;";
                CallableStatement cs3 = conn.prepareCall(query);//"{call "+sp+" (?)}"
                cs3.setString(1,msisdn);
                cs3.execute();
                System.out.println("se ejecuta correctamente DB Activator");
            }
            //Close the result set, statement, and the connection
            finally{
                if(conn!=null) conn.close();
            }
        }

        public void databaseConnectionEpos(String url, String port, String service, String user, String password,
                                    String sp, String msi, String msisdn) throws SQLException {
            OracleDataSource ods = null;
            Connection conn= null;
            ResultSet resultSet;
            // Create DataSource and connect to the local database
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
            ods.setUser(user);
            ods.setPassword(password);
            conn = ods.getConnection();
            try
            {
                // Query the employee names
                String query = "begin "+sp+"(?,?,?); end;";
                CallableStatement cs3 = conn.prepareCall(query);//"{call "+sp+" (?)}"
                cs3.setString(1,msi);
                cs3.setString(2,msisdn);
                cs3.setString(3,"1");
                cs3.execute();
                System.out.println("se ejecuta correctamente  DB EPOS");
            }
            //Close the result set, statement, and the connection
            finally{
                if(conn!=null) conn.close();
            }
        }

        public void databaseConnectionSiebel(String url, String port, String service, String user, String password,
                                    String sp, String msi, String msisdn) throws SQLException {

            OracleDataSource ods = null;
            Connection conn= null;
            ResultSet resultSet;
            // Create DataSource and connect to the local database
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
            ods.setUser(user);
            ods.setPassword(password);
            conn = ods.getConnection();
            try
            {
                // Query the employee names
                String query = "begin "+sp+"(?,?); end;";
                CallableStatement cs3 = conn.prepareCall(query);//"{call "+sp+" (?)}"
                cs3.setString(1, msi);
                cs3.setString(2,msisdn);
                cs3.execute();
                System.out.println("se ejecuta correctamente DB Siebel");
            }
            //Close the result set, statement, and the connection
            finally{
                if(conn!=null) conn.close();
            }
        }

        public void databaseConnectionPostsale(String url, String port, String service, String user, String password,
                                    String sp, String msisdn) throws SQLException {
            OracleDataSource ods = null;
            Connection conn= null;
            ResultSet resultSet;
            // Create DataSource and connect to the local database
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
            ods.setUser(user);
            ods.setPassword(password);
            conn = ods.getConnection();
            try
            {
                // Query the employee names
                String query = "begin "+sp+"(?); end;";
                CallableStatement cs3 = conn.prepareCall(query);//"{call "+sp+" (?)}"
                cs3.setString(1,msisdn);
                cs3.execute();
                System.out.println("se ejecuta correctamente DB Postale");
            }
            //Close the result set, statement, and the connection
            finally{
                if(conn!=null) conn.close();
            }
        }
    }