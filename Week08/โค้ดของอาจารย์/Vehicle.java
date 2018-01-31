package comeng.sut;
public abstract class Vehicle {
    private String engine;
    
    public Vehicle(String engine) {
        this.engine = engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getEngine() {
        return engine;
    }
}
