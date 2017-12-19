
package oot.lab3.test;

public class LabTest1_1 {
    public static void main(String[] args){
        int num1 = 10;
        float num2 = 20.25f;
        double num3 = 30.5;
        
        System.out.println("Result is " + add(num1, num2));
        System.out.println("Result is " + add(num2, num3));
    }
    
    public static int add(int num1, float num2){
        return (int)(num1 + num2);
    }
    
    public static double add(float num1, double num2){
        return num1 + num2;
    }
    
}
