package comeng.sut;

public class Sum {
    public static void main(String[] ags){
        int[] x = {3 ,8 ,4 ,5};
        
        System.out.println("sum = " + sumArray(x));
    }
    
    public static int sumArray(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length ; i++){
            sum += a[i];
        }
        return sum;
        
    }
    
}