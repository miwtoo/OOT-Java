
package wood.box.tset;


public class Box {
    private Wood component;
    
    public void setComponent(Wood component){
        this.component = component;
    }
    
    public Wood getComponent(){
        return component;
    }
    
    public int getVolume(){
        return component.getSide()* component.getArea();
    }
}
