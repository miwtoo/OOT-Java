package oot.mid.test1;

public class Chip {

    private String ic;
    private String name;
    
    public Chip(){}
    public Chip(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    
}
