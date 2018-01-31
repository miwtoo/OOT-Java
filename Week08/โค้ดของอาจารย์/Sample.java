package comeng.sut;
public class Sample {
    public static void main(String[] args) {
      //Vehicle v = new Vehicle("V6"); //error because cannot 
                                       //create object
      Plane pl = new Plane("Roleroyse");
      Bird b = new Bird("big"); //not use this object in program
      Parrot pa = new Parrot("small");
      pa.setFlightLevel(30.0);
      pl.setFlightLevel(27000.0);
      display(pa, 20.0);
      display(pl, 30000.0);
      //pa.fly(20.0); pl.fly(30000.0);
    }
    public static void display(Flyable x, double a) {
        x.fly(a);
    }
}
