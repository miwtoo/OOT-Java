/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        int[] n = {25, 15, 40, 9};
        
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println(n[4]); // ArrayIndexOutOfBoundsException: 4
    }
}
