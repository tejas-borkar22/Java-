package abstraction;

abstract class Car {
  int price;
  String name;
  String fuelType;

  abstract void start();

  void broke() {
    System.out.println("Car broke down.");
  }

  void displayData() {
    System.out.println("Name : " + this.name + " Fuel Type : " + this.fuelType + " Car Price : " + this.price);
  }

}

class Kia extends Car {
  Kia() {
    name = "Seltos";
    price = 1500_000;
    fuelType = "Petrol";
  }

  @Override
  void start() {
    System.out.println("Kia car is starting.");
  }
}

class Tata extends Car {
  Tata() {
    name = "Altroz";
    price = 800_000;
    fuelType = "Petrol";
  }

  @Override
  void start() {
    System.out.println("Tata car is starting.");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    Kia seltos = new Kia();
    seltos.displayData();
    Tata altroz = new Tata();
    altroz.displayData();
  }
}
