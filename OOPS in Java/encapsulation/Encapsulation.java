package encapsulation;

class Laptop {
  String model;
  String ram = "4 GB";
  static String os = "Windows 11";
  private int price;

  public Laptop(String model, String ram, String os) {
    this.model = model;
    this.ram = ram;
    this.os = os;
  }

  public void getPrice() {
    System.out.println("Price of Laptop is : " + price);
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Laptop thinkPad = new Laptop("Lenevo Thinpad", "8GB", "Windows 11");
    thinkPad.setPrice(70_000);

    System.out.println("Laptop.model: " + thinkPad.model + " RAM : " + thinkPad.ram + " OS " + Laptop.os);
    thinkPad.getPrice();
  }
}
