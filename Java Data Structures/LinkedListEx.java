import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    l1.add(3);
    l1.add(7);
    l1.add(10);
    l1.add(12);
    l1.add(2);
    l1.add(2, 8); // Adds the element at given index
    l1.remove(2);
    l1.removeFirst();
    l1.removeLast();
    Iterator<Integer> it = l1.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }

  }
}
