package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Staff {

    public Staff(){
        
    }
    
    private String name_dir;
    
    public Staff(String name, String address, String school, double pay){
        
        this.name_dir = "[Nombre: " + name + " Domicilio: " +  address ;
        this.school = school;
        this.pay = pay;
    }
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    private String school;
    private double pay;
    
    @Override
    public String toString(){
        return "Staff: " + name_dir + " Escuela: " + school + " Paga: " + pay + "]";
    }
    
}
