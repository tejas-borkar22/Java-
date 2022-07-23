import java.util.Scanner;

public class loops {
  public static void main(String[] args) {
    // Types of Loops: 1.For Loops 2.While Loops & 3.Do while loops

    System.out.println("\n-- For Loop --");
    for (int i = 10; i > 0; i--) {
      System.out.print(i + " ");
    }

    System.out.println("\n-- While Loop --");
    int i = 1;
    while (i <= 10) {
      System.out.print(i + " ");
      i++;
    }

    System.out.println("\n-- Do While Loop --");
    int j = 100;
    do {
      System.out.print(j + " ");
      j -= 10;
    } while (j >= 10);

    // Conditionals
    try (
        Scanner sc = new Scanner(System.in)) {
      System.out.print("\nEnter your Income : ");
      int income = sc.nextInt();
      boolean hasHighIncome = (income > 100_000);
      System.out.println("User has high income ? " + hasHighIncome);

      // Ternary operator
      String type = income > 100_000 ? "Premium Class" : "Economy Class"; 
      System.out.println("User is " + type);
    }

  }
}
