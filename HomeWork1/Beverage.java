package HomeWork1;

public class Beverage extends Product {
  protected double volume; // Change private to protected

  public Beverage(String name, double price, double volume) {
    super(name, price);
    this.volume = volume;
  }

  public String toString() {
    return super.toString() + ", Volume: " + volume + " L";
  }

  // Add a getter method for volume
  public double getVolume() {
    return volume;
  }
}
