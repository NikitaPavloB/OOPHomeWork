package HomeWork3.Test;

public class OrderItem {
  private String name;
  private double volume;
  private int temperature;

  public OrderItem(String name, double volume, int temperature) {
    this.name = name;
    this.volume = volume;
    this.temperature = temperature;
  }

  public OrderItem(Product product) {
    this.name = product.getName();
    if (product instanceof Beverage) {
      this.volume = ((Beverage) product).getVolume();
      this.temperature = 0; // Since it's not applicable for non-HotBeverage products
    } else if (product instanceof HotBeverage) {
      HotBeverage hotBeverage = (HotBeverage) product;
      this.volume = hotBeverage.getVolume();
      this.temperature = hotBeverage.getTemperature();
    } else {
      this.volume = 0;
      this.temperature = 0;
    }
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

  public Product getProduct(HotBeverageVendingMachine vendingMachine) {
    return vendingMachine.getProduct(name, volume, temperature);
  }
}
