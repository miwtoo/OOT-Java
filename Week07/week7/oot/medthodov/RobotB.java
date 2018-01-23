package week7.oot.medthodov;


public class RobotB extends Robot{
    public void sum(int n){
    int last = n %10;
    while(n > 9){
        n /= 10;
    }
    System.out.println(n + last);
    }
}
