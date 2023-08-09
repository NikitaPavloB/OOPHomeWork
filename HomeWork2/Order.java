package HomeWork2;

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

  public String toString() {
    StringBuilder orderDetails = new StringBuilder();
    orderDetails.append("Клиент: ").append(customerName).append("\n");
    orderDetails.append("Заказанные продукты:\n");
    for (Product product : products) {
      orderDetails.append(product).append("\n");
    }
    orderDetails.append("Общая стоимость: ").append(totalCost).append("\n");
    return orderDetails.toString();
  }
}
