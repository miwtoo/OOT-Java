public class Sample1 {
    public static void main(String[] args) {
        //String s = new String("hello"); v. เต็ม
        String s = "hello";
        String t = "there";
        
        String u;
        
        u = s+" "+t; // การเอามาเชื่อมกัน
        System.out.println(u);
        
        System.out.println(s.length()); // ความยาว
        
        for (int i = 0; i < s.length(); i++) 
            System.out.print(s.charAt(i)); // ดึงแต่ล่ะตัว
        
    }
}
