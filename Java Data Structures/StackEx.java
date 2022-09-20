// package stack;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    s1.push(4);
    s1.push(5);
    s1.push(6);
    s1.push(8);
    System.out.println("Stack : " + s1);
    System.out.println("Element Popped: " + s1.pop());
    System.out.println(s1.peek());
    // System.out.println("Element Popped: " + s1.pop());
    // System.out.println("Element Popped: " + s1.pop());
    boolean status = s1.isEmpty();
    System.out.println(status);

    // Iterating over a stack using iterator class
    // Class <wrapper class type> obj = stack.function();
    Iterator<Integer> it = s1.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println("\nSize of the stack: " + s1.size());
  }
}
