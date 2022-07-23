import java.util.Scanner;

public class fizzbuzz {
  public static void main(String[] args) {
    String div5 = "Fizz";
    String div3 = "Buzz";

    System.out.print("\nEnter Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if (num % 5 == 0 && num % 3 == 0)
      System.out.println(div5 + div3);
    else if (num % 3 == 0)
      System.out.println(div3);
    else if (num % 5 == 0)
      System.out.println(div5);
    else
      System.out.println(num);
  }
}
