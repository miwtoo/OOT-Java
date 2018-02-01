
package oot.lab7.test3;

public class Calculator implements MathCalculator{
    private double x;
    private double y;
    
    public Calculator(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void add(){
        System.out.printf("%.0f ADD %.0f = %.1f\n",x,y,x+y);
    }
    
    public void minus(){
        System.out.printf("%.0f MINUS %.0f = %.1f\n",x,y,x-y);
    }
    
    public void compare(){
        if(x > y)
            System.out.printf("%.0f > %.0f : %.1f\n",x,y,x-y);
        else if(x == y)
            System.out.printf("%.0f <= %.0f : %.1f\n",x,y,x-y);
        else if(x < y)
            System.out.printf("%.0f < %.0f : %.1f\n",x,y,y-x);
    }
}
