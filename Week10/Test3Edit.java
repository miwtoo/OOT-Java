import java.util.*;
public class Test3Edit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        
        System.out.print("Enter b :");
        
        try{
            b = sc.nextInt(); // InputMismatchException // ถ้าใส่ตัวอักษร
            System.out.println(100/b); // ArithmeticException: / by zero // ถ้าใส่ 0
        }
        catch(ArithmeticException e){
            System.out.println("find divide by 0");
        }
        catch(InputMismatchException e){ // ถ้าจำไม่ได้พิมพ์ แค่ Exception จะดักได้หมด และห้ามใว้บน เพราะจะแย่งคลาสลูกจับ
            System.out.println("wrong Input");
        }
        finally { // ทำงานตลอดทุกรณี ใส่ใว้เผื่อ โค้ดให้ทำงานตลอดไม่ว่าจะ error หรือไม่
            System.out.println("finally block");
        }
        
        System.out.println("bye");
    }
}
