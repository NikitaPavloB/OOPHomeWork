package HomeWork3;

public class Beverage extends Product {
  protected double volume;

  public Beverage(String name, double price, double volume) {
    super(name, price);
    this.volume = volume;
  }

  public String toString() {
    return super.toString() + ", Объем: " + volume + " л";
  }

  public double getVolume() {
    return volume;
  }

  public double getPrice() {
    return price;
  }
}