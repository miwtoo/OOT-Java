package Test1;


public class Sample {
    public static void main(String[] args) {
        Foo f = new Foo();
        Boo b = new Boo();
        int[] n = new int[]{8,15,100,20,99,69};
        
        System.out.println("===Show 1===");
        show1(f,n);
        show1(b,n);
        
        System.out.println("===Show 2===");
        show2(b,"license", "silence");
        show2(b,"machine", "cinema");
}

    public static void show1(Foo f, int[]n){
        f.disp(n);
    }
    
    public static void show2(Cal c, String a, String b){
        c.calculate(a, b);
    }
}
