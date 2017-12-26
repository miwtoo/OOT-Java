package comeng.sut.test.Student;

public class SampleHide {
    public static void main(String[] args){
        StudentHide s1 = new StudentHide();
        s1.setName("Somchai");
        s1.setId("B5901234");
        s1.setAge(20);
        
        
        StudentHide s2 = new StudentHide();
        s2.setName("Somsak");
        s2.setId("B5903333");
        s2.setAge(19);
        
        
        System.out.println(s1.getName() + " has id " + s1.getId() + " and age = " + s1.getAge() );
        System.out.println(s2.getName() + " has id " + s2.getId() + " and age = " + s2.getAge() );
        
      
        s1.register("English IV");
        s2.register("OOT");
        
    }
}
