
package week7.oot.labtest2;


public class Baz extends Boo{
    public Baz(String name){
        super(name);
    }
    
    public void printData(int[] n){
        System.out.print(getName() + " prints ");
        for (int i = n.length -1; i >= 0  ; i--) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}
