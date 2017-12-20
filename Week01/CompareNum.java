package comeng.sut;
import java.util.Scanner;
public class Hello {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    System.out.print("Enter number 1 : ");
    num1 = sc.nextInt();

    System.out.print("Enter number 2 : ");
    num2 = sc.nextInt();

    System.out.print(num1 + " > " + num2 + " is " + (num1 > num2));
    
  }
}
