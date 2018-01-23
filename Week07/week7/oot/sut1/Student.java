package week7.oot.sut1;

public class Student {
    private String name;
    
    public Student(){} // เมื่อมีการสืบทอดแล้วต้องมีแบบ ปกติ เพราะคอนสรักเตอในคลลาสลูกใช้ super เรียกในคลาส
    public Student(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    private void register(){
        System.out.println("registering");
    }
    
    public void doSometing(){
        register();
    }
}
