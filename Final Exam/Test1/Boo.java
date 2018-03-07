package Test1;


public class Boo extends Foo implements Cal{
    
    public void disp(int[] n){
        int a = n.length-1;
        for (int i = 0; i < n.length-3; i++) {
            System.out.print(n[a--] + " " + n[i] + " ");
        }
        System.out.println();
    }
    
    public void calculate(String x, String y){
        int[] n = new int[25];
        
        if(x.length() != y.length())
            System.out.println("not anagram");
        else{
            for (int i = 0; i < x.length(); i++) {
                n[x.charAt(i) - 'a']++;
                n[y.charAt(i) - 'a']--;
            }
            int sum = 0;
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            
            if(sum > 0)
                System.out.println("not anagram");
            else
                System.out.println("anagram");
        }
        
    }
}
