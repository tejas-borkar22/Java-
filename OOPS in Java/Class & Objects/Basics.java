class Person {
  String name;
  int age;

  static int count;

  // Default Constructor
  public Person() {
    name = "John Doe";
    age = 25;
    count++;
    System.out.println("Creating an object of Person class : " + Person.count);
  }

  // Parameterized Constructor
  public Person(String name, int age) {
    this(); // Calling Default Constructor
    this.name = name;
    this.age = age;
  }

  void walk() {
    System.out.println(name + " is walking... ");
  }

  void eat() {
    System.out.println(name + " is eating... ");
  }
}

public class Basics {
  public static void main(String args[]) {

    Person p1 = new Person();
    p1.name = "Ankush Jeram";
    p1.age = 22;

    Person p2 = new Person("Sharad Wapar", 32);

    System.out.println("Person 1 object : " + p1.toString());
    System.out.println(p1.name + " age : " + p1.age + " years");
    p1.eat();
    p1.walk();

    System.out.println("\n\nPerson 2 object : " + p2.toString());
    System.out.println(p2.name + " age : " + p2.age + " years");
    p2.eat();
    p2.walk();
  }
}
