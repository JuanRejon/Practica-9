package Clases;


import Clases.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Student extends Person{

    public Student(){
    
    }
    
    private String name_dir;
    
    public Student(String name, String address, String program, int year, double fee){

        this.name_dir = "[Nombre: " + name + " Domicilio: " +  address ;
        this.program = program;
        this.year = year;
        this.fee = fee;
        
    }
    
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    private String program;
    private int year;
    private double fee;
    
    @Override
    public String toString(){
        return "Estudiante: " + name_dir + " Carrera: " + program + " Año: " + year + " Pago: " + fee + "]";
    }
    
}
