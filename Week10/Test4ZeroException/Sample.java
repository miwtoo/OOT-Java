
package Test4ZeroException;

public class Sample {
    public static void main(String[] args) {
        int[] n = {789, 1015, 40, 98521, 45, 4101};
        
        for (int i = 0; i < n.length; i++) {
            try{
                check(n[i]);
                System.out.println(n[i]);
            }
            catch(ZeroException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void check(int num) throws ZeroException {
        
        int s = 1;
        int n = num;
        while(num > 0){
            s = num % 10;
            num = num /10;
            if(s == 0){
                throw new ZeroException("ZeroException : " + n);
            }
        }
    }
}
