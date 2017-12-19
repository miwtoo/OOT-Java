package comeng.sut;

public class intro {
    public static void main(String[] ags){
        int[] x = new int[10];
        boolean [] y = new boolean[10];
        char[] z = new char[10];
        
        for(int i = 0; i < x.length ; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < y.length; i++){
            System.out.print(y[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < z.length; i++){
            System.out.print((int)z[i] + " "); // แปลงเป็น ASCII ก่อนไม่งั้นมองไม่เห็น
        }
        System.out.println();
        
        //-----------------------------------------------------------
        for(int i = x.length-1 ; i >= 0  ; i--){ //ปริ้นย้อนกลับ
            System.out.print(x[i] + " ");
        }
        System.out.println();
        
    }
    
}
