
package week7.oot.medthodov;



public class labtest1 {
    public static void main(String[] args){
        Robot r = new Robot("X9");
        RobotA a = new RobotA("A2");
        RobotB b = new RobotB();
        b.setName("B3");
        r.sum(123); a.sum(2519); b.sum(84129);
        a.printWord("hello");
        //b.printWord("hi");            //error if remove comment
        //r.printWord("there");         //error if remove comment
    }
}
