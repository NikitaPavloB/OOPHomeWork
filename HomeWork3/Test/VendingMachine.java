package HomeWork3.Test;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
  protected List<Product> products;

  public VendingMachine() {
    products = new ArrayList<>();
  }

  public void initProducts(List<Product> productsList) {
    products = new ArrayList<>(productsList);
  }

  public Product getProduct(String name) {
    for (Product product : products) {
      if (product.name.equals(name)) {
        return product;
      }
    }
    return null;
  }

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
}
