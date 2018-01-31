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
public class Bird implements Flyable{
    
    private String size;
    
    
    public Bird(String size){
        this.size = size;
    }
    public void fly(double feet){};
    
    
    public void setSize(String size){
        this.size = size;
    }
    
    public String getSize(){
        return size;
    }
    
   
    
    
    
    
}
