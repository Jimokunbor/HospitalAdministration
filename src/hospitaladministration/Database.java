/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author jimok
 */
public abstract class Database {
    protected final static String DB_BASE_URL = " jdbc:mysql : //localhost ";   
    protected final static String USER = "ooc2022";
    protected final static String PASSWORD = "ooc2022";
    protected final static String DB_NAME = "hospital";
    protected final static String TABLE_NAME = "patientData";
    // jdbc:mysql : //localhost/hospital
    // this is our Database URL
    protected final static String DB_URL = DB_BASE_URL + "/" + DB_NAME;
}
