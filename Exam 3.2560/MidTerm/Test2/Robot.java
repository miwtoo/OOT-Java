
package Test2;

public class Robot {
    String name;
    public Robot(String name){
        this.name = name;
    }
    //int[] x = {3,45,3,25,9,25,9,6,10};
    
    public void DuplicateNumber(int[] x){
        System.out.print(name + " Duplicate Number is ");
        
        int[] y = duplicate(x);    
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+ " ");
        }
        
        System.out.println();
    }

    public void sumUniqueNumber(int[] x){
        
        int[] y = duplicate(x);
        int sum = 0;
        boolean check = true;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if(x[i] == y[j])
                    check = false;
            }
            if(check)
                sum += x[i];
            check = true;
        }
        
        System.out.println(name+" Sum of unique number " + sum);
    }
    
    public int[] duplicate(int[] x){
        int count = 0;
        
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[i] == x[j])
                    count++;
            }
        }
        
        int[] y = new int[count];
        count = 0;
        
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[i] == x[j])
                    y[count++] = x[i];
            }
        }
        return y;
    }
    
}
