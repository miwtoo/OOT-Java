
package comeng.sut;

public class Calculator {
    private String brand;
    private IC ic;
    
    
    public Calculator(){}
        
    public Calculator(String brand){
        this.brand = brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setIC(IC ic){
        this.ic = ic;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public IC getIc(){
        return ic;
    }
    
    
    
    public void calculate(int a, int b){
        
        System.out.println(brand + " calculate " + sumDigit(a) + "^" +  b + " = " + power(sumDigit(a), b));
    }
    
    public int sumDigit(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n/= 10;
        }
        return sum;
    }
    public int power(int x, int y){
        int result = 1;
        for(int i = 1; i <= y; i++)
            result *= x;
        
        return result;
    }
}
