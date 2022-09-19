package Interface;

interface Vehicle {
  // all are the by default abstract methods.
  void changeGear(int a);

  void speedUp(int a);

  void applyBrakes(int a);
}

class Bike implements Vehicle {
  String bikeName = "Model X";
  int speed;
  int gear;

  // Parameterized Constructor
  public Bike(String name) {
    this.bikeName = name;
  }

  // to change gear
  @Override
  public void changeGear(int newGear) {

    gear = newGear;
  }

  // to increase speed
  @Override
  public void speedUp(int increment) {

    speed = speed + increment;
  }

  // to decrease speed
  @Override
  public void applyBrakes(int decrement) {

    speed = speed - decrement;
  }

  public void printStates() {
    System.out.println("Bike speed : " + speed
        + "\t Current gear: " + gear);
  }
}

public class Interface {
  public static void main(String[] args) {
    // creating instance of the bike.
    Bike bike = new Bike("Apache");
    bike.changeGear(2);
    bike.speedUp(4);
    bike.applyBrakes(1);

    System.out.println(bike.bikeName + " bike present state :");
    bike.printStates();
  }
}
