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
public class Plane extends Vehicle{
    private double feet;
    
    private double flightLevel;
    
    public Plane(String engine){
        super(engine);
    }
    
    public void fly(double feet){}
    
    
    
    public void setFeet(double feet){
        this.feet = feet;
    }
    
    public double getFeet(){
        return feet;
    }
    
    public void setFlightLevel(double flightLevel){
        this.flightLevel = flightLevel;
    }
    
    public double getFlightLevel(){
        return flightLevel;
    }
}
