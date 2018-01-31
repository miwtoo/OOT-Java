package comeng.sut;
public class Plane extends Vehicle implements
                                        Flyable {
    private double flightLevel;
    public Plane(String engine) {
        super(engine);
    }
    public void setFlightLevel(double flightLevel) {
        this.flightLevel = flightLevel;
    }
    public  void fly(double feet) {
        System.out.print("The plane with " + getEngine() + 
           " engine fly at " + feet + " feets");
        if(feet < flightLevel)
            System.out.println(" under the flight level");
        else if(feet > flightLevel)
            System.out.println(" over the flight level");
    }
}
