package comeng.sut.test.Student;

public class StudentConstruc {
    private String name;  //private is infomation hiding only medthod can get เพื่อการควบคุมการตั้งตัวแปรหรือส่งตัวแปร
    private String id;
    private int age;
    private Teacher advisor;
    
    public StudentConstruc() { //default constructor 
        // name is class not have return type
        // run when object create at StudenHide();
        
        //System.out.println("Hello Student");
        
        //this.name = "anonymous name";
        //this.id = "anonymous id";
        
        this("anonymous name"); // เรียก constructor overloaded กันเอง
    }
    
    public StudentConstruc(String name) { // Overloaded constuctor
        this.name = name;
    }
    
    public StudentConstruc(String name , String id) { // Overloaded constuctor
        this.name = name;
        this.id = id;
    }
    
    
    
    
    
    public void register(String subject){
        System.out.println(name + " is registering " + subject);
        
    }
    public void setName(String name){
        this.name = name; // this เพื่อไม่ให้สับสนชื่อ
    }
    
    public void setId(String d){
        this.id = d;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAdvisor(Teacher advisor){
        this.advisor = advisor;
    }
    
    public Teacher getAdvisor(){
        return advisor;
    }
}
