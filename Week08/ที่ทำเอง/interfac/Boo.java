/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.interfac;

/**
 *
 * @author All User
 */
public class Boo extends Foo implements X, Y{
    public void doX1(){
        System.out.println("doX1");
    }
    
    public String doX2(int a){
        return a + ""; // อะไรบวก String ก็ได้ String
    }
    
    public void doY(){
        System.out.println("doY");
        System.out.println(n);
    }
}
