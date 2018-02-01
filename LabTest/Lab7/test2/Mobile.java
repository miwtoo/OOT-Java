package oot.lab7.test2;

public abstract class Mobile {
    private String carrier;
    
    public Mobile(String carrier){
        this.carrier = carrier;
    }
    
    public String getCarrier(){
        return carrier;
    }
    
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public abstract int getSimCount();
}
