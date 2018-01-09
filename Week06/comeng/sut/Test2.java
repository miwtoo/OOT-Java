package comeng.sut;

public class Test2 {
    public static void main(String[] args){
        Student s1 = new Student("John");
        Student s2 = new Student("Jack", "B5901234");
        Calculator c1 = new Calculator("CASIO");
        Calculator c2 = new Calculator();
        c2.setBrand("SHARP");
        IC i1 = new IC("JAPAN");
        IC i2 = new IC("TIWAN");
        
        s1.setCalculator(c1);
        s2.setCalculator(c2);
        c1.setIC(i1);
        c2.setIC(i2);
        
        printInfo(s1);
        printInfo(s2);
        c1.calculate(1011, 3);// แต่ล่ะหลักบวกกัน
        c2.calculate(253, 3);// แต่ล่ะหลักบวกกัน_
    }
    
    public static void printInfo(Student s){
        System.out.println(s.getName() +" <"+ s.getId() +"> use calculator brand " + s.getCalculator().getBrand() + " with ic from " + s.getCalculator().getIc().getCountry());
    }
}
