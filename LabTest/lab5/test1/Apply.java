
package oot.lab5.test;

public class Apply {
    public static void main(String[] args){
        Student s1 = new Student("Robert","B5999999",3.00); 
        Student s2 = new Student("Alex","B5733334",2.7); 
        Student s3 = new Student(); 
        
        Major m1 = new Major ("1111", "CPE");
        Major m2 = new Major ("2222", "IE");
        Major m3 = new Major ("3333", "TE");
        
        s3.setName("Tom");
        s3.setSid("B59995553");
        s3.setGpa(3.33);
        
        s1.setMajor(m1);
        s2.setMajor(m2);
        s3.setMajor(m3);
        
        disp(s1);
        disp(s2);
        disp(s3);
    }
    public static void disp(Student s){
        System.out.printf("%s\t%s\tgetsgpa %f studying in %s\n", s.getName(),s.getSid(), s.getGpa(),s.getMajor().getMname());
    }
}
