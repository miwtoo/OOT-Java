package oot.lab3.test;

import java.util.Scanner;
public class Lab3Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice, side, l, w;
        
        System.out.println("======= [MENU] =======");
        System.out.println("1. Print area of  square and a rctangle");
        System.out.println("2. Print perimemeter of a square and rectangln");
        System.out.println("3. Draw a square and a rctangen");
        System.out.println("======================");
        
        do{
            System.out.print("Select an option: ");
            choice = sc.nextInt();
        }while(choice < 1 || choice > 3);
        
        switch(choice){
            case 1:
                System.out.print("A side of square : ");
                side = sc.nextInt();
                
                System.out.print("A length of rectangle : ");
                l = sc.nextInt();
                
                System.out.print("A width of rectangle : ");
                w = sc.nextInt();
                
                System.out.println("An area of square : " + calculateArea(side));
                System.out.println("An area of rectangle : " + calculateArea(w,l));
                break;
            
            case 2:
                System.out.print("A side of square : ");
                side = sc.nextInt();
                
                System.out.print("A length of rectangle : ");
                l = sc.nextInt();
                
                System.out.print("A width of rectangle : ");
                w = sc.nextInt();
                
                System.out.println("An Perimeter of square : " + calculatePerimeter(side));
                System.out.println("An Perimeter of rectangle : " + calculatePerimeter(w,l));
                break;
                
            case 3:
                System.out.print("A side of square : ");
                side = sc.nextInt();
                
                System.out.print("A length of rectangle : ");
                l = sc.nextInt();
                
                System.out.print("A width of rectangle : ");
                w = sc.nextInt();
                
                printOut(side);
                System.out.println("");
                printOut(w,l);
                break;
        }
    }
    
    public static int calculateArea(int num1){
        return num1 * num1;
    }
    
    public static int calculateArea(int num1, int num2){
        return num1 * num2;
    }
    
    public static int calculatePerimeter(int num1){
        return num1 * 4;
    }
    public static int calculatePerimeter(int num1, int num2){
        return (num1*2)+(num2*2);
    }
    
    public static void printOut(int side){
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side; j++){
                //System.out.print(i+","+j+" ");
                 if(j == 1 || j == side || i == 1 || i == side){
                     System.out.print("= ");
                  }
                  else{
                    System.out.print("  ");
                  }
            }
            System.out.println("");
        }
    }
    
    public static void printOut(int l,int w){
        for(int i = 1; i <= l; i++){
            for(int j = 1; j <= w; j++){
                //System.out.print(i+","+j+" ");
                 if(j == 1 || j == w || i == 1 || i == l){
                     System.out.print("= ");
                  }
                  else{
                    System.out.print("  ");
                  }
            }
            System.out.println("");
        }
    }
}
