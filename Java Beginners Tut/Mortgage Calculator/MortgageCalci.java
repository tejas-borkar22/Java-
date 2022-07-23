import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalci {
  public static double calMortage(int p, float monthlyRate, float months) {
    double mortgage = p
        * ((monthlyRate * Math.pow((1 + monthlyRate), months))
            / (Math.pow((1 + monthlyRate), months) - 1));
    return mortgage;
  }

  public static void main(String[] args) {
    final int MONTHS_IN_YR = 12;
    final int PERCENT = 100;
    Scanner sc = new Scanner(System.in);

    int p = 0;
    float monthlyRate = 0;
    float numberOfpayments = 0;

    while (true) {
      System.out.print("Enter Principal amount ($1K - $1M) : ");
      p = sc.nextInt();
      if (p >= 1000 && p <= 1_000_000)
        break;
      System.out.println("Enter a valid value. ");
    }

    while (true) {
      System.out.print("Enter Annual Interest Rate : ");
      float annualRate = sc.nextFloat();
      if (annualRate > 0 && annualRate <= 30) {
        monthlyRate = (annualRate / PERCENT) / MONTHS_IN_YR;
        break;
      }
      System.out.println("Enter a value greater than 0 to 30.");
    }

    while (true) {
      System.out.print("Enter Period (in Years ) : ");
      int years = sc.nextInt();
      if (years >= 1 && years <= 30) {
        numberOfpayments = years * MONTHS_IN_YR;
        break;
      }
      System.out.println("Enter a value between 1 to 30 years.");
    }

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(calMortage(p, monthlyRate, numberOfpayments));
    System.out.println("Monthly Mortgage is  : " + mortgageFormatted);
  }
}