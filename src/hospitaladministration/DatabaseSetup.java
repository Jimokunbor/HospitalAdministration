/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jimok
 */
public class DatabaseSetup extends Database{
       
        
        public static boolean setupDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  // This is actually going to name this object driver for us
     
            try 
                (Connection conn = DriverManager.getConnection(DB_BASE_URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement();
                    
                ) {
                // Two setup here, one is for sql and other is for Java respectively.
                stmt.execute(" CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");
                stmt.execute("USE  hospital ;");
                String sql =
                        // Make DataType here are in order with the variables class you created.
                        "CREATE TABLE IF NOT EXISTS " +TABLE_NAME + " ("
                        + "name VARCHAR(255),"
                        + "birthdate DATE,"      
                        + "bloodType VARCHAR(2),"
                        + "id INT(10)"
                        + ");";
                stmt.execute(sql);
                return true;
                
            } catch (Exception e) {
             e.printStackTrace();
             return false;
                
            }
        }
	

    
}
