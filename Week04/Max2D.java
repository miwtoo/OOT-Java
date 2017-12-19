package comeng.sut;

public class Max2D {
    public static void main(String[] ags){
        int[][] n =    {{1, 2, 3,},
                        {4, 5, 6}, 
                        {7, 8, 9}};
        
        System.out.println("max = " + findMax(n));
    }
    
    public static int findMax(int[][] a){
        int max = a[0][0];
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > max)
                    max = a[i][j];
            }
        }
        
        return max;
    }
}