package HomeWork3.Test;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine extends VendingMachine {
  public HotBeverageVendingMachine() {
    products = new ArrayList<>();
    products.add(new Beverage("Coca Cola", 2.5, 0.5, 10));
    products.add(new Beverage("Tea", 1.5, 0.3, 10));
    products.add(new HotBeverage("Coffee", 2.0, 0.25, 70, 10));
    products.add(new Food("Chocolate bar", 1.0, 0.1));
    products.add(new Beverage("Lemon Tea", 1.8, 0.3, 10));
    products.add(new Beverage("Mineral Water", 1.0, 0.5, 10));
    products.add(new HotBeverage("Hot Cocoa", 2.2, 0.3, 65, 10));
    products.add(new Food("Snickers", 1.2, 0.08));
    products.add(new Food("Cookies", 0.5, 0.05));

    // Добавьте остальные товары
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

  public boolean isAvailable(Product product) {
    for (Product p : products) {
      if (p.equals(product) && p.getQuantity() > 0) {
        return true;
      }
    }
    return false;
  }

  public void reduceProductQuantities(List<OrderItem> orderItems) {
    for (OrderItem item : orderItems) {
      Product product = getProduct(item.getName(), item.getVolume(), item.getTemperature());
      if (product != null) {
        product.setQuantity(product.getQuantity() - 1);
      }
    }
  }

  public void showRemainingProducts() {
    System.out.println("Остатки продуктов в автомате:");
    for (Product product : products) {
      System.out.println(product.getName() + " - осталось " + product.getQuantity() + " штук");
    }
  }
}
