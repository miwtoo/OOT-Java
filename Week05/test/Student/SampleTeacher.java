
package comeng.sut.test.Student;

public class SampleTeacher {
    public static void main(String[] args){
        StudentConstruc s = new StudentConstruc("Somsak");
        Teacher t = new Teacher("John");
        
        s.setAdvisor(t);
        
        System.out.println(s.getName() + "\'s advisor is " + s.getAdvisor().getName());
    }
}
