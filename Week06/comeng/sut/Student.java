package comeng.sut;

public class Student {
    private String name;
    private String id;
    private Calculator c;
    
    public Student(String name){
        this.name = name;
        this.id = "anonymos id";
    }
    
    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    
    public void setCalculator(Calculator c){
        this.c = c;
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public Calculator getCalculator(){
        return c;
    }
}
