package comeng.sut;
public class Parrot extends Bird {
    private double flightLevel;
    public Parrot(String size) {
        super(size);
    }
    public void setFlightLevel(double flightLevel) {
        this.flightLevel = flightLevel;
    }
    public void fly(double feet) {
        System.out.print("The " + getSize() + 
           " parrot fly at " + feet + " feets");
        if(feet < flightLevel)
            System.out.println(" under the flight level");
        else if(feet > flightLevel)
            System.out.println(" over the flight level");
    }
}
