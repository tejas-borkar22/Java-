
import java.text.NumberFormat;
import java.util.Arrays;

public class array {

  // User defined func to print array
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    /*
     * Method 1 to declare array suing new keyword.
     * 
     * int[] marks = new int[4];
     * marks[0] = 85;
     * marks[1] = 80;
     * marks[2] = 92;
     * marks[3] not assigned, by default value will be 0.
     * 
     */

    // Method 2 : Need to know the no. of elements & values prior.
    int[] marks = { 85, 80, 92, 0 };
    System.out.println("3rd index of arr" + marks[3]);

    // Array Functions or Properties : 1. Length
    System.out.println(" Array length : " + marks.length);

    // 2. sort
    System.out.print("  Before sorting : ");
    printArr(marks);
    Arrays.sort(marks);
    System.out.print("\n  After sorting : ");
    printArr(marks);

    // 3. Arrays.toString() : Shows string representation of array
    System.out.println("\n\ntoString : " + Arrays.toString(marks));

    // 2D Array
    int[][] finalMarks = { { 84, 90, 79, 93 }, { 80, 88, 94, 0 } };
    System.out.println("\nStudent 1 Bio marks: " + finalMarks[0][3]);
    System.out.println("Student 2 Maths marks: " + finalMarks[1][2]);

    // Use deepToString() in case of multi dimensional arrays.
    System.out.println("deepToString() : " + Arrays.deepToString(finalMarks));

    // Casting in java is the assigning values of one type to another.
    // Two types of casting : Implicit & Explicit.
    // 1. Implict Casting
    int price = 150;
    double gst = (price * 18) / 100;
    double finalPrice = price + gst; // Implict Casting => int casted into double.
    System.out.println("GST : " + gst);
    System.out.println("Final Price : " + finalPrice);

    // 2. Explict Casting
    int p = 133;
    double discount = (p * 17.5) / 100;
    int fp = p - (int) discount; // Explicit Casting => double casted into int implicitly.
    System.out.println("Discount : " + discount);
    System.out.println("Final Price : " + fp);

    // Casting using wrapper class
    String x = "2";
    int y = Integer.parseInt(x) + 3; // Wrapper class for int parses string into integer
    System.out.println("y =  " + y);

    String a = "2.6";
    double b = Double.parseDouble(a) + 3.2; // Wrapper class for double parses string into double
    System.out.println("b =  " + b);

    // Constant Values: A constant is a variable in Java which has a fixed value
    // i.e. it cannot be assigned a different value once assigned.
    // Prefix 'final' is used to declare constant values.

    final float PI = 3.142F; // Final value can not be reassigned or changed.

    // Math Class : Min & Max
    System.out.println("Max Element :" + Math.max(10, 15));
    System.out.println("Min Element :" + Math.min(8, 12));

    // Random : Prints random value between 0.0 to 1.0.
    System.out.println("Random Value :" + (int) (Math.random() * 100));

    // Round : Rounds a floating point number toa whole number.
    int result = Math.round(4.23F);
    System.out.println("Round method : " + result);

    // Number Formatting
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String currencyResult = currency.format(2459.88);
    System.out.println("Price is : " + currencyResult);

  }
}
