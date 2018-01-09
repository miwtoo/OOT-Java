
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        int[][] sale = new int[3][4];
        String[] seller = new String[3];    
        Scanner sc = new Scanner(System.in);
        
        inputData(sale, seller, sc);
        printSale(sale,seller);
        
        System.out.println("Max quarter has " + findMaxQty(sale));
        System.out.println("Max seller is " + findMaxSeller(sale, seller));
        
    }
    
    public static void inputData(int[][] s, String[] sel, Scanner sc){
        sc = new Scanner(System.in);
        
        
        for(int i = 0; i < s.length;i++){
            System.out.print("Enter name of seller " + (i+1) + " : ");
            sel[i] = sc.next();
            
            System.out.println("Enter quantity for each quarter : ");
            for(int j = 0; j < s[i].length ; j++){
                s[i][j] = sc.nextInt();
            }
        }
        
        
    }
    
    public static void printSale(int[][] s, String[] sel){
        System.out.printf("%10s%5s%5s%5s%5s\n"," ", "q1", "q2", "q3", "q4");
        for(int i = 0; i < s.length ; i++){
            System.out.printf("%-10s", sel[i]);
            for(int j = 0; j < s[i].length ; j++){
                System.out.printf("%5s", s[i][j]);
            }
            System.out.println();
        }

    }
    
    public static int findMaxQty(int[][] s){

        int[] quarter = new int[4];
        
        for(int i = 0; i < quarter.length; i++){
            for(int j = 0; j < s.length; j++){
                quarter[i] += s[j][i];
            }
        }
        
        int max = quarter[0];
        for(int i = 1; i < quarter.length ; i++){
            if(quarter[i] > max)
                max = quarter[i];
        }
        
        return max;
    }
    
    public static String findMaxSeller(int[][] s, String[] sel){
        int[] sellerQty = new int[sel.length];
        for(int i = 0; i < s.length ; i++){
            for(int j = 0; j < s[i].length ; j++){
                sellerQty[i] += s[i][j];
            }
        }
        
        int maxIndex = 0;
        for(int i = 1 ; i < sellerQty.length; i++){
            if(sellerQty[i] > sellerQty[maxIndex])
                maxIndex = i;
        }
        
        return sel[maxIndex];
    }
}
