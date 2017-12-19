package comeng.sut;

public class FindMinMax {
    public static void main(String[] ags){
        int[] x = {3 ,8 ,4 ,5};

        System.out.println("Max = " + findMax(x));
        System.out.println("Min = " + findMin(x));
    }
    
    
    public static int findMax(int[] a){
        int max = a[0];
        for(int i = 0; i < a.length ; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
        
    }
    public static int findMin(int[] a){
        int min = a[0];
        for(int i = 0; i < a.length ; i++){
            if(a[i] < min)
                min = a[i];
        }
        return min;
        
        
    }
}