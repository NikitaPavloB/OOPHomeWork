package HomeWork1;

public class HotBeverageVendingMachine extends VendingMachine {
  public Product getProduct(String name, double volume, int temperature) {
    for (Product product : products) {
      if (product instanceof HotBeverage) {
        HotBeverage hotBeverage = (HotBeverage) product;
        if (hotBeverage.name.equals(name) && hotBeverage.volume == volume && hotBeverage.temperature == temperature) {
          return hotBeverage;
        }
      }
    }
    return null;
  }
}
