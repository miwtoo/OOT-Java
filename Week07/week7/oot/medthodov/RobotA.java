
package week7.oot.medthodov;

public class RobotA extends Robot{
    public RobotA(String name){
        super(name);
    }
    
    public void printWord(String word){
        System.out.println(word);
    }
    
    public void sum(int n){
        int sum = 0, d;
        while(n > 0){
            d = n % 10;
            if(d % 2 != 0){
                sum += d;
            }
            n /= 10;
        }
        System.out.println(getName() + " sum = "+ sum);
    }
}
