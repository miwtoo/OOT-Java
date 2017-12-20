package comeng.sut;
import java.util.Scanner;
public class InputScanner {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.print("Enter a number : ");
    num = sc.nextInt();

    System.out.printf("This num %d",num);
  }
}
