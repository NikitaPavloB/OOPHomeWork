package HomeWork3;

public class HotBeverageVendingMachine extends VendingMachine {
  public Product getProduct(String name, double volume, int temperature) {
    for (Product product : products) {
      if (product instanceof HotBeverage) {
        HotBeverage hotBeverage = (HotBeverage) product;
        if (hotBeverage.name.equals(name) && hotBeverage.getVolume() == volume
            && hotBeverage.temperature == temperature) {
          return hotBeverage;
        }
      }
    }
    return null;
  }

  public boolean isAvailable(Beverage beverage) {
    for (Product product : products) {
      if (product instanceof Beverage) {
        Beverage availableBeverage = (Beverage) product;
        if (availableBeverage.name.equals(beverage.name) &&
            availableBeverage.getVolume() == beverage.getVolume() &&
            availableBeverage.getPrice() == beverage.getPrice()) {
          return true;
        }
      }
    }
    return false;
  }
}
