
package week7.oot.poly;



public class labtest1 {
    public static void main(String[] args){
        Robot r = new Robot("X9");
        RobotA a = new RobotA("A2");
        RobotB b = new RobotB();
        b.setName("B3");
        show(r, 123);
        show(a, 25129);
        show(b, 84129);
        //b.printWord("hi");            //error if remove comment
        //r.printWord("there");         //error if remove comment
    }
    
    public static void show(Robot x, int n){
        x.sum(n); // จะไปเรียก sum ของ อันไหน ขึ้นอยู่กับ x แบบนี้เรียก polymorphisim การที่ x เรียกได้หลายอันหรือหลายรูปร่าง
    }
}
