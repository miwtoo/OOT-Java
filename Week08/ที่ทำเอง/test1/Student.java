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
public class Student extends People{
    
    public Student(String name){
        super(name);
    }
    
    public void say(String s){
        System.out.println(getName() +" say " + s + " " + s + " "+ s);
    }
}
