
package Review3;


public class Sample {
    public static void main(String[] args) {
        String s = "orange=20:banana=15:mango=30:grape=40";
        int total = 0;
        String[] t = s.split(":");
        for(int i = 0; i < t.length; i++) {
            String[] c = t[i].split("=");
            
            System.out.println(c[0].toUpperCase() +" "+ c[1]);
            int qty = Integer.valueOf(c[1]);
            total += qty;
        }
        System.out.println("Total = " +total);
    }
}