/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author jimok
 */
public class Patient {
    /*
    Name
    Date of Birth
    Blood Type
    ID
    */
    
    private String name;
    private String birthDate;
    private String bloodType;
    private int patientID;
    
    // Static here means that it is a class variable
    // It is shared by all the objects of this class
    // And we use this to auto generate the patient id's - will increment
    // with each patient
    private static int currentID = 1;

    public Patient(String name, String birthDate, String bloodType) {
        this.name = name;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.patientID = currentID;
        currentID++;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
