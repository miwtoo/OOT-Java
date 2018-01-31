/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.test1;

/**
 *
 * @author All User
 */
public abstract class People {
    private String name;
    
    public People(){};
    public People(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract void say(String s);
}
