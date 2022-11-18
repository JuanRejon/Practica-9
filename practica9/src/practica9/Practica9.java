/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;

import Clases.Person;
import Clases.Staff;
import Clases.Student;

/**
 *
 * @author Juan Carlos
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person persona = new Person("Juan", "Calle Cometa");
        
        Student estudiante = new Student(persona.getName(), persona.getAddress(), "LCC", (int) 5, (double) 30000);
        Staff maestro = new Staff(persona.getName(), persona.getAddress(), "UANL FCFM", (double) 10000);
        
        System.out.println("----------------------");
        System.out.println(persona.toString());
        System.out.println("----------------------");
        System.out.println(estudiante.toString());
        System.out.println("----------------------");
        System.out.println(maestro.toString());
        System.out.println("----------------------");
        
    }
    
    
}
