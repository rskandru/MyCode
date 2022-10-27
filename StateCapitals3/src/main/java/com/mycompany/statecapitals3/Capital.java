/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals3;

/**
 *
 * @author rskandru
 */
public class Capital {
 
// properties
    
    
    private String Name;
    private int Population;
    private double SqMAge;
    
    
//logger
    public Capital(String Name, int Population, double SqMAge) {
        this.Name = Name;
        this.Population = Population;
        this.SqMAge = SqMAge;
    }
    
    
 //getter and setter

//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }
//
//    public int getPopulation() {
//        return Population;
//    }
//
//    public void setPopulation(int Population) {
//        this.Population = Population;
//    }
//
//    public double getSqMAge() {
//        return SqMAge;
//    }
//
//    public void setSqMAge(double SqMAge) {
//        this.SqMAge = SqMAge;
//    }

    @Override
    public String toString() {
        return  "  " + Name +    " | Population : " + Population + " | Area : " + SqMAge +"sq mi";
    }
    
    
    
    
    
}
    
