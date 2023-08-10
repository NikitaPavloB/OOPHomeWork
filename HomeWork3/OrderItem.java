package HomeWork3;

public class OrderItem {
  private String name;
  private double volume;
  private int temperature;

  public OrderItem(String name, double volume, int temperature) {
    this.name = name;
    this.volume = volume;
    this.temperature = temperature;
  }

  public String getName() {
    return name;
  }

  public double getVolume() {
    return volume;
  }

  public int getTemperature() {
    return temperature;
  }
}
