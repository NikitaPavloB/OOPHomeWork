package HomeWork3;

import java.util.Iterator;
import java.util.List;

public class Order {
  private String customerName;
  private List<Product> products;
  private double totalCost;

  public Order(String customerName, List<Product> products, double totalCost) {
    this.customerName = customerName;
    this.products = products;
    this.totalCost = totalCost;
  }

  public void validateOrder(HotBeverageVendingMachine vendingMachine) {
    Iterator<Product> iterator = products.iterator();
    while (iterator.hasNext()) {
      Product product = iterator.next();
      if (product instanceof Beverage) {
        Beverage beverage = (Beverage) product;
        if (!vendingMachine.isAvailable(beverage)) {
          iterator.remove();
        }
      }
    }
  }

  public String toString() {
    StringBuilder orderDetails = new StringBuilder();
    orderDetails.append("Клиент: ").append(customerName).append("\n");
    orderDetails.append("Заказанные продукты:\n");
    for (Product product : products) {
      orderDetails.append(product.getName()).append("\n");
    }
    orderDetails.append("Общая стоимость: ").append(totalCost).append("\n");
    return orderDetails.toString();
  }
}
