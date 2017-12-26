
package comeng.sut.bird;
public class Sample {
    public static void main(String[] args){
        Bird b1 = new Bird();
        b1.size = "small";
        b1.colour = "white";
        b1.age = 1;
        
        Bird b2 = new Bird();
        b2.size = "big";
        b2.colour = "black";
        b2.age = 5;
        
        
        System.out.println("The " + b1.size + " " + b1.colour + " " + " bird is " + b1.age + " years old");
        
        System.out.println("The " + b2.size + " " + b2.colour + " " + " bird is " + b2.age + " years old");
        b1.fly();
        b2.fly();
    }
}
