
package oot.lab7.test1;

public abstract class Mobile {
    private String carrier;
    
    public String getCarrier(){
        return carrier;
    }
    
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public abstract int getSimCount();
}
