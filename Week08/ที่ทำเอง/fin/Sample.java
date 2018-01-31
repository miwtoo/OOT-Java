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
public class Sample {
    public static void main(String[] args) {
        /*final int x = 5;
        
        x = 10; // error because x is final
        
        System.out.println(x);
        */
        
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        Foo f3 = new Foo();
        System.out.println("there are " + Foo.getCount() + " objects");
        
        f1.doFoo();
        Foo.doFoo2();
        
        show();         //มีค่าเท่ากัน
        Sample.show();  //มีค่าเท่ากัน
    }
    
    public static void show(){
        System.out.println("Show");
    }
}
