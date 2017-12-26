
package wood.box.tset;

public class Wood {
    private int side;
    
    public int getArea(){
        return side*side;
    }
    
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        this.side = side;
    }
}
