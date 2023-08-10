package HomeWork3.Test;

public class Beverage extends Product {
  protected double volume;

  public Beverage(String name, double price, double volume, int quantity) {
    super(name, price, quantity);
    this.volume = volume;
  }

  public String toString() {
    return super.toString() + ", Объем: " + volume + " л";
  }

  public double getVolume() {
    return volume;
  }
}
