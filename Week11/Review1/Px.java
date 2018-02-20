
package Review1;

public class Px implements CC{
    private String s;
    public Px(String s){
        this.s = s;
    }
    
    public void prt(int[] t){
        System.out.print(s + " prints ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
    
    public void qrt(int[]t, int a){
        int sum, d, base, temp;
        
        System.out.print(s + " prints");
        for (int i = 0; i < t.length; i++) {
            temp = t[i];
            sum = 0;
            base = 1;
            while(temp > 0){
                d = temp % 10;
                if(d !=  a){
                    sum = sum + d * base;
                    base *= 10;
                }
                temp /= 10;
            }
            
            if(sum > 0){
                System.out.print(sum +" ");
            }
        }
        System.out.println();
    }
    
    public String getS(){
        return s;
    }
}
