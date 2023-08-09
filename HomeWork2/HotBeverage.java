package HomeWork2;

public class HotBeverage extends Beverage {
  protected int temperature;

  public HotBeverage(String name, double price, double volume, int temperature) {
    super(name, price, volume);
    this.temperature = temperature;
  }

  public String toString() {
    return super.toString() + ", Температура: " + temperature + "°C";
  }
}
