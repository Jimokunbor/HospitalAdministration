/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

import static hospitaladministration.Database.DB_BASE_URL;
import static hospitaladministration.Database.PASSWORD;
import static hospitaladministration.Database.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author jimok
 */
public class DatabaseWriter extends Database {
    public boolean addPatient(Patient patient) throws SQLException {
        try 
                (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement();
        ) {
                 String sql = String.format("INSERT INTO " + TABLE_NAME + " VALUES ("
                         + "'%s', '%s', '%s', %d);",
                // For name(String), birthDate(String but without double quote), bloodType(String) and currentID(integer and take %d
                         patient.getName(), patient.getBirthDate(), patient.getBloodType(), patient.getPatientID());
                 stmt.execute(sql);
                 return true;    // If that works
       } catch (Exception e) {
           e.printStackTrace();
           return false; // If not works
       }
      }
    public boolean addALLPatients(List<Patient> patientList) {
        return true;
        
    }
    
}
