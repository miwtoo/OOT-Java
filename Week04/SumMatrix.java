package comeng.sut;

public class SumMatrix {
    public static void main(String[] ags){
        int[][] x =    {{1, 2, 3,},
                        {4, 5, 6}, 
                        {7, 8, 9}};
        
        int[][] y =    {{1, 1, 1,},
                        {1, 1, 1}, 
                        {1, 1, 1}};
        int[][] z = sumMatrix(x,y);
        printArray(z);
    }
    
    public static int[][] sumMatrix(int[][] x, int[][] y){
        int[][] z = new int[x.length][x.length];
        
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j]; 
            }
        }
        
        return z;
    }
    
    public static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                System.out.printf("%-2d  ",a[i][j]);
            }
            System.out.println();
        }
    }

}