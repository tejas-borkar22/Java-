import java.util.Scanner;

public class Guess {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int myNum = (int) (Math.random() * 100);
    // System.out.println(myNum);
    int ip;
    System.out.println("Guess the number between 1 - 100 !!!");
    do {
      ip = sc.nextInt();
      if (ip == myNum) {
        System.out.println("Woohooo, You are Right :-) " + myNum);
        break;
      } else if (ip > myNum)
        System.out.println("Your number is too large. ");
      else
        System.out.println("Your number is too small. ");
    } while (ip > 0);
    if (ip < 0)
      System.out.println("Better luck next time :-( " + myNum);
  }
}
