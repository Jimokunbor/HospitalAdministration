/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author jimok
 */
public class HospitalAdministration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient p1 = new Patient("Sam", "15/11/23", "O+");
        Patient p2 = new Patient("Lexie", "27/11/21", "A-");
        
        
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
    }
    
}
