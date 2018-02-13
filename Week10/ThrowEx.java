import java.util.*;

public class ThrowEx {
    public static void main(String[] args) {
        //method1(); // ArithmeticException
        
        // แบบ 3 ต้องแก้แล้วโยนให้ใครต่อไม่ได้
        try{
            method1();
        }
        catch (ArithmeticException e){
            System.out.println("/0");
            System.out.println("Error Message : "+e.getMessage());
        }
        
        // จะมี Exception เกิดขึ้น 3 ที่ แล้วจะบอกต้นตอ
        // จะแก้ Exception ได้ 3 ที่
    }
    
    public static void method1() throws ArithmeticException{ // โยนให้ Exception medthod1 แก้ต่อ
        method2();
        
        // แบบสอง แก้จุดสอง
        /*
        try{
            method2();
        }
        catch (ArithmeticException e){
            System.out.println("/0");
        }
        */
    }
    
    public static void method2() {//throws ArithmeticException{ // โยนให้ Exception medthod2 แต่ ในกรฯีนี้ไม่ต้องโยน มันก็จะโยนให้เอง คือ'บาง' Exception มันจะโยนให้เอง
        System.out.println(100/0);
        
        
        throw new ArithmeticException("hello");  // การโยนอีกแบบ ไม่พิม  s ด้วย ระวัง
        // แก้แบบแรก แก้ในจุดที่เกิดเลย
        /*
        try{
            System.out.println(100/0);
        }
        catch (ArithmeticException e){
            System.out.println("/0");
        }
        */
    }
}
