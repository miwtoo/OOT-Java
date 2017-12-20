package comeng.sut;
import java.io.Console;
public class InputConsole {
  public static void main(String[] args){
    Console cs = System.console();
    String str;
    int num;

    System.out.print("Enter a number : ");
    str = cs.readLine();
    num = Integer.valueOf(str);
    cs.printf("This num %d",num);
  }
}
