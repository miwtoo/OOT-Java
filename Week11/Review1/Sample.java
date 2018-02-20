
package Review1;

public class Sample {
    public static void main(String[] args) {
        int[] v = {35, 4219, 5410, 228, 99198, 5555};
        Px p = new Px("px");
        Qx q = new Qx("qx");
        System.out.println("stage 1");
        reveal(p, v); reveal(q, v);
        System.out.println("stage 2");
        disp(p, v, 9); disp(p, v, 5);
    }
    
    public static void reveal(Px a, int[]t){
        a.prt(t);
    }
    
    public static void disp(CC c, int[]t, int a){
        c.qrt(t, a);
    }
}
