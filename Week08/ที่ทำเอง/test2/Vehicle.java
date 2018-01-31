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
public class Vehicle implements Flyable{
    private double feet;
    private String engine;
    private double flightLevel;
    
    public Vehicle(String engine){
        this.engine = engine;
    }
    
    public void fly(double feet){
        this.feet = feet;
        
        if(feet > flightLevel)
            System.out.println("The " + engine + " parrot fly at " + feet + " over  the flight level");
        else
            System.out.println("The " + engine + " parrot fly at " + feet + " under  the flight level");
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
