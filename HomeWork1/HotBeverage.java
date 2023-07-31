package HomeWork1;

public class HotBeverage extends Beverage {
  public HotBeverage(String name, double price, double volume, int temperature) {
    super(name, price, volume);
    this.temperature = temperature;
  }

  public String toString() {
    return super.toString() + ", Temperature: " + temperature + "°C";
  }
}
