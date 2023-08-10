package HomeWork3.Test;

public class HotBeverage extends Beverage {
  protected int temperature;

  public HotBeverage(String name, double price, double volume, int temperature, int quantity) {
    super(name, price, volume, quantity);
    this.temperature = temperature;
  }

  public int getTemperature() {
    return temperature;
  }

  public String toString() {
    return super.toString() + ", Температура: " + temperature + "°C";
  }
}
