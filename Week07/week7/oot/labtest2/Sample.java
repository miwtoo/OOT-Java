
package week7.oot.labtest2;

public class Sample {
    public static void main(String[] args){
        Foo f = new Foo("foo");
        Boo b = new Boo("Boo");
        Baz c = new Baz("baz");
        
        int[] n = {15, 25 , 109, 2, 3};
        
        display(f,n);
        display(b,n);
        display(c,n);
    }
    
    public static void display(Boo a, int[] m){
        a.printData(m);
    }
}
