package comeng.sut;

public class ArrayInMedthod {
    public static void main(String[] ags){
        int[] x = {3 , 8 ,4 ,5};
        
        printArray(x);
        printBackward(x);
    }
    public static void printArray(int[] a){
        for(int i = 0; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
    }
    
    public static void printBackward(int[] a){
        for(int i = a.length-1 ; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    
}