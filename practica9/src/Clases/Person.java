package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Person {


    public Person(){
        
    }
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private String address;
    
    @Override
    public String toString(){
        return "Persona: [Nombre: " + name + " Domicilio: " + address + "]";
    }
}
