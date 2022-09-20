import java.util.Arrays;

public class ArraysExample {
  public static int search(int a[], int key) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == key)
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = new int[10];
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = count++;
    }
    for (int j = 0; j < arr.length; j++)
      System.out.print(arr[j] + " ");
    System.out.println("\n\n -----2D Arrays-----");
    // 2D Arrays
    int[][] a2 = new int[3][4];
    for (int row = 0; row < a2.length; row++) {
      for (int col = 0; col < a2[row].length; col++) {
        a2[row][col] = count++;
      }
    }
    for (int row = 0; row < a2.length; row++) {
      for (int col = 0; col < a2[row].length; col++) {
        System.out.print(a2[row][col] + " ");
      }
      System.out.println();
    }
    int a3[] = new int[] { 32, 6, 8, 5, 2, 17 };
    Arrays.sort(a3);
    for (int j = 0; j < a3.length; j++)
      System.out.print(a3[j] + " ");

    System.out.println("\nIndex value is : " + search(a3, 15));
  }
}
