package comeng.sut;

/// ปริ้นทุกตัวที่ไม่ใช่ max min
public class Test {
    public static void main(String[] ags){
        int[] n = {15, 30, 8, 100, 2, 20, 5, 1};
        
            printExceptMaxMin(n);
        
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
    public static void printExceptMaxMin(int[] a){
        int min = findMin(a);
        int max = findMax(a);
        
        for(int i = 0; i < a.length ; i++){
            if(a[i] != max && a[i] != min) // a[i] < max && a[i] > min 
                System.out.print(a[i] + " ");
        }
    }
    
}
