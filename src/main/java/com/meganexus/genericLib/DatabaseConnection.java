package com.meganexus.genericLib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
	
	private static String dbusername = "appneo";
    private static String dbpassword = "appneo";
  
   
    
    public static String executeSQLQuery(String sqlQuery) {
        String connectionUrl="";
        Connection connection;
        String resultValue = "";
        ResultSet rs;
        
       
            connectionUrl ="jdbc:mysql://192.168.2.23:3306/neo_45_tr";
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
            }catch(ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
                if(connection!=null) {
                    System.out.println("Connected to the database...");
                }else {
                    System.out.println("Database connection failed");
                }
                Statement stmt = connection.createStatement();
                rs=stmt.executeQuery(sqlQuery);

                try {
                    while(rs.next()){
                        resultValue = rs.getString(1).toString();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                catch (NullPointerException err) {
                    System.out.println("No Records obtained for this specific query");
                    err.printStackTrace();
                }
                connection.close();

            }catch(SQLException sqlEx) {
                System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
            }
            return resultValue;
            
            
           
        }
     
 
	
//    # verify specific record"
    
    public static void main (String[] args){
    String sqlQuery = "select building_name from tr_offender_address_spg where offender_address_id='"+executeSQLQuery("select offender_address_id from tr_offender_address_spg where profile_id='451';")+"'";
    String expectedaddress_id = "205";
    String actualaddress_id = executeSQLQuery(sqlQuery);
    System.out.println("building_name retrieved from database :" + actualaddress_id);
    //Assert.assertEquals(expectedaddress_type, actualaddress_type);
   
  
   
}
}


	

   
  
   




