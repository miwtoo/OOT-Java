package comeng.sut.test.Student;

public class Sample {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Somchai";
        s1.id = "B5901234";
        s1.age = 20;
        
        
        Student s2 = new Student();
        s2.name = "Somsak";
        s2.id = "B5903333";
        s2.age = 19;
        
        
        System.out.println(s1.name + " has id " + s1.id + " and age = " + s1.age );
        System.out.println(s2.name + " has id " + s2.id + " and age = " + s2.age );
        
      
        s1.register("English IV");
        s2.register("OOT");
        
    }
}
