package comeng.sut;
import java.io.Console;
public class InputConsole2 {
    public static void main(String[] args){
        Console cs = System.console();
        String str, name;
        int num;
        float gpa;
        char ch;

        System.out.print("Enter your name : ");
        name = cs.readLine();

        System.out.print("Enter your age : ");
        str = cs.readLine();
        num = Integer.valueOf(str);

        System.out.print("Enter your GPA : ");
        str = cs.readLine();
        gpa = Float.valueOf(str);

        ch = name.charAt(0);

        cs.printf("%s is %d years old and get GPA %.2f", name, num, gpa);
        cs.printf("\nInitial name is %c", ch);
    }
}
