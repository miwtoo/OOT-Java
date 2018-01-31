package comeng.sut;
public class Boo extends Foo {
    public void doX1() {
        System.out.println("doX1");         
    }
    public String doX2(int a) {
        return a+"";
    }
    public void doY() {
       System.out.println("doY");
       System.out.println(Boo.n);
    }
}
