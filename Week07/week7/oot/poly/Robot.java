
package week7.oot.poly;




public class Robot {
    private String name;
    
    public Robot(){}
    public Robot(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void sum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(name + " sum = "+sum);
    }
}


