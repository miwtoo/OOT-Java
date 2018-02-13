package OddException;


public class Sample2 {
    public static void main(String[] args) {
        int[] n = {20,100,3,5,18,9};
        
        for (int i = 0; i < n.length; i++) {
            try{
                check(n[i]);
                System.out.println(n[i]);
            }
            catch(OddException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void check(int num) throws OddException{
        if (num % 2 == 1) {
            throw new OddException("OddException : " + num);
        }
    }
}
