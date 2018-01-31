/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.fin;

/**
 *
 * @author All User
 */
public class Foo {
    private String name;
    private static int count;
    
    public Foo(){
        count++;
    }
    
    public static void setCount(int count){
        Foo.count = count;
    }
    
    public static int getCount(){
        return count;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public  void doFoo(){
        System.out.println("doFoo");
    }
    
    public static void doFoo2(){
        System.out.println("Static");
    }
}
