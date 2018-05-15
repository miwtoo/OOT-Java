package Test3;

public class Sample {
    public static void main(String[] args) {
        line(1111);
        line(32);
        line(8);
        
        line(1111,'#');
        line(32,'@');
        line(8,'*');
        
        line(1111,'#',222);
        line(32,'@',233);
        line(8,'*',51);
        
    }
    
    public static void line(int x){
        for (int i = 0; i < sumAll(x) ; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    
    public static void line(int x, char ch){
        for (int i = 0; i < sumAll(x) ; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
    
    public static void line(int x, char ch, int y){
        for (int i = 0; i < sumAll(x) ; i++) {
            System.out.print(ch);
        }
        System.out.println();
        
        for (int i = 0; i < sumAll(y) ; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    
    public static int sumAll(int n){
        int sum = 0;
        
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        
        return sum;
    }
}
