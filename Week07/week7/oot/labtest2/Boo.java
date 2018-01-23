
package week7.oot.labtest2;


public class Boo {
    private String name;
    public Boo(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void printData(int[] n){
        System.out.print(name + " prints ");
        for (int i = 0; i < n.length ; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}
