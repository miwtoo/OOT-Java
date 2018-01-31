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
public interface X { // interface ต้องเป็น public static เท่านั้น หรือ จะเติม public static ให้ 
    int n = 9;
    //public static final int n = 9;    // ความหมายเดียวกัน 
    
    void doX1();
    //public abstract void doX1();
    
    String doX2(int a);
    //public abstract String doX2(int a);
    
    
}
