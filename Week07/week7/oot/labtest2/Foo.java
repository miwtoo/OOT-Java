
package week7.oot.labtest2;


public class Foo extends Boo{
    public Foo(String name){
        super(name);
    }
    public void printData(int[] n){
        int max = n[0], min = n[0];  
        System.out.print(getName() + " prints ");
        for (int i = 0; i < n.length ; i++) {
            if(n[i] > max)
                max = n[i];
            if(n[i] < min)
                min = n[i];
        }
        for (int i = 0; i < n.length; i++) {
            if(n[i] != min && n[i] != max)
                System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}
