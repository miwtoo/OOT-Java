package comeng.sut;
public class Bird implements Flyable {
    private String size;
    
    public Bird(String size) {
        this.size = size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public  void fly(double feet) {
        
    }
}
