package com.indra.actions;

import com.indra.models.DataExcel;
import oracle.jdbc.datasource.impl.OracleDataSource;
import org.openqa.selenium.WebDriver;
import java.sql.*;

public class DatabaseConnection extends DataExcel {

        public void executeAllProcedures(String msi, String msisdn) throws SQLException {
            databaseConnectionActivator(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                    ,"AL_RE_ACTIVADOR", msisdn);
            databaseConnectionEpos(getUrlDBE(), getPort(), getServiceE(),getUserE(),getPasswordE()
                    ,"ali_re_epos_crm_siebel", msi, msisdn);
            databaseConnectionSiebel(getUrlDBS(), getPort(), getServiceS(),getUserS(),getPasswordS()
                    ,"alistamiento_recursos_siebel", msi, msisdn);
            databaseConnectionPostsale(getUrlDBP(), getPort(), getServiceP(),getUserP(),getPasswordP()
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
                System.out.println("se ejecuta correctamente");
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
                System.out.println("se ejecuta correctamente");
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
                System.out.println("se ejecuta correctamente");
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
                System.out.println("se ejecuta correctamente");
            }
            //Close the result set, statement, and the connection
            finally{
                if(conn!=null) conn.close();
            }
        }
    }