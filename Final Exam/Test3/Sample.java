package Test3;

public class Sample {
    public static void main(String[] args) {
        String s = "1:2:3:4:5:6:7:8:9:10:100:1000";
        
        String[] t = s.split(":");
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            int n = Integer.valueOf(t[i]);
            sum += n;
        }
        System.out.println("Sum = " + sum);
    }
}
