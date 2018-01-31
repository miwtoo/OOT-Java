/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.test2;

/**
 *
 * @author All User
 */
public class Parrot extends Bird{
    private double feet;
    private String size;
    private double flightLevel;
    
    public Parrot(String size){
        super(size);
    }
    
    public void fly(double feet){
        this.feet = feet;
        
        if(feet > flightLevel)
            System.out.println("The " + size + " parrot fly at " + feet + " over  the flight level");
        else
            System.out.println("The " + size + " parrot fly at " + feet + " under  the flight level");
    }
    
    public void setFlightLevel(double flightLevel){
        this.flightLevel = flightLevel;
    }
    
    public double getFlightLevel(){
        return flightLevel;
    }
    
     public void setFeet(double feet){
        this.feet = feet;
    }
    
    public double getFeet(){
        return feet;
    }
}
