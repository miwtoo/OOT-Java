
package week7.oot.sut1;

public class Sample {
    public static void main(String[] args){
        /*Student s = new Student(); // ก่อนนี้ register เป็น public
        s.register();
        
        UnderGradStudent u = new UnderGradStudent();
        u.register();
        
        GradStudent g = new GradStudent();
        g.register();*/
        
        /*Student s = new Student();
        s.doSometing();
        
        UnderGradStudent u = new UnderGradStudent();
        u.doSometing();
        
        GradStudent g = new GradStudent();
        g.doSometing();*/
        
        GradStudent g = new GradStudent();
        g.setName("Josh");
        System.out.println(g.getName());
        g.doThesis();
        
        /*Student s = new Student(); 
        s.doThesis();  // แม่เรียกไม่ได้
        UnderGradStudent u = new UnderGradStudent();
        u.doThesis();  //คลาสอื่นที่สืบทอดด้วยเรียกไม่ได้*/
        
        UnderGradStudent u1 = new UnderGradStudent("eiei");
    }
}
