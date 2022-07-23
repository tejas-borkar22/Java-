import java.util.Scanner;
import java.util.Date;

public class ip {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); // Creating object of scanner class.
    System.out.println("Enter Your name ");
    String fname = sc.nextLine().trim();
    System.out.println("Full Name :" + fname);

    System.out.println("Input your age : ");
    int age = sc.nextInt();
    System.out.println("Age is " + age);

    Date now = new Date();
    System.out.println("Hello " + fname + " today is " + now);

  }
}
