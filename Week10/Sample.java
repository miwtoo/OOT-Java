import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        
        /*Scanner sc = new Scanner(System.in);
        
        int n;
        
        n = sc.nextInt(); // ถ้าใส่ตัวอักษร จะ InputMismatchException
        
        */
        ////////////////////////////////////////////////////////////////////////////
        /*
        String s = "123v"; // ถ้าไม่มี v ก็ปกติ
        
        int n = Integer.valueOf(s); // NumberFormatException: For input string: "123v"
        
        System.out.println(n+1); 
        */
        ////////////////////////////////////////////////////////////////////////////
        /*
        String s = null;
        
        System.out.println(s.length()); // NullPointerException
        */
        
        ////////////////////////////////////////////////////////////////////////////
        /*
        int a,b ;
        
        a = 10;
        b = 0;
        
        System.out.println(a/b); //ArithmeticException: / by zero
        
        */
        ////////////////////////////////////////////////////////////////////////////
        /*
        String s = "hello";
        
        System.out.println(s.charAt(10)); //StringIndexOutOfBoundsException
        
        */
        ////////////////////////////////////////////////////////////////////////////
        /*
        
        int n[] = {1,3,4,9,10};
        
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");// ArrayIndexOutOfBoundsException
        }
        
        //System.out.println(n[0]); //1
        //System.out.println(n[4]); //10
        //System.out.println(n[100]); // ArrayIndexOutOfBoundsException // สมมุติ จาก 100 เป็น ตัวแปรแล้ว ถ้า user ใส่ตัวเลขเกินขอบ
        */
        System.out.println("bye");
    }
}
