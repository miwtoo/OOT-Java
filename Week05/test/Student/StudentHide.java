package comeng.sut.test.Student;

public class StudentHide {
    private String name;  //private is infomation hiding only medthod can get เพื่อการควบคุมการตั้งตัวแปรหรือส่งตัวแปร
    private String id;
    private int age;
    
    
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
    
   
}
