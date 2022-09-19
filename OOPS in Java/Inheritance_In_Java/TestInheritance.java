package Inheritance_In_Java;

class Employee {
  String name;
  int age;
  static String Org = "FIS Global";
  static int count;

  // Default Constructor
  public Employee() {
    name = "John Doe";
    age = 25;
    count++;
    System.out.println("Creating an object of Employee class : " + Employee.count);
  }

  // Parameterized Constructor
  public Employee(String name, int age) {
    this(); // Calling Default Constructor
    this.name = name;
    this.age = age;
  }

  void work() {
    System.out.println(name + " is working... ");
  }

  void sleep(int hours) {
    System.out.println(name + " is sleeps " + hours + " hours a day.");
  }
}

// Single Inheritance : is-a relation
class Developer extends Employee {
  public Developer(String name, int age) {
    super(name, age); // Calling constructor of immediate parent
  }

}

public class TestInheritance {
  public static void main(String[] args) {

    Employee emp1 = new Employee("Sivam Sharma", 23);
    Developer d1 = new Developer("Anuj Rao", 24);

    System.out.println("\nEmployee name : " + emp1.name + " Age : " + emp1.age);
    System.out.println("\nDeveloper name : " + d1.name + " Age : " + d1.age);
    d1.work();
    d1.sleep(7);

  }
}
