package Test1;

public class Foo {
    public void disp(int[] n){
        for (int i = n.length-1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}
