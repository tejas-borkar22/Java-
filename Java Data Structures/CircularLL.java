public class CircularLL {
  // Creating head & tail for circular LL
  Node head, tail;

  class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
      this.data = data;
    }
  }

  void insertAtLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
      tail.next = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
      tail.next = head;
    }
  }

  void displayLL() {
    Node n1 = head;
    if (head == null && tail == null)
      System.out.println("Linked List is empty, nothing to display.");
    else {
      do {
        System.out.print(n1.data + " -> ");
        n1 = n1.next;
      } while (n1 != head);
      System.out.println();
    }
  }

  void deleteNode() {
    if (tail != head) {
      head = head.next;
      tail.next = head;
    } else {
      head = tail = null;
    }
  }

  public static void main(String[] args) {
    CircularLL list1 = new CircularLL();
    list1.insertAtLast(2);
    list1.insertAtLast(5);
    list1.insertAtLast(8);
    list1.insertAtLast(11);
    list1.displayLL();
    list1.deleteNode();
    list1.displayLL();
    list1.deleteNode();
  }
}
