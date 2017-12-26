package wood.box.tset;

import java.util.Scanner;
public class Sample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int side;
        
        Wood w = new Wood();
        
        System.out.print("Enter side of wood : ");
        side = sc.nextInt();
        
        w.setSide(side);
        
        Box b = new Box();
        b.setComponent(w);
        
        System.out.println("wood has area =  " + w.getArea());
        System.out.println("box with wood 5 components has volume = " + b.getVolume());
        
    }
}
