package HomeWork3.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Инициализация торгового автомата и добавление продуктов в автомат
    HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
    List<Product> productList = new ArrayList<>();
    productList.add(new Beverage("Coca Cola", 2.5, 0.5, 10));
    productList.add(new Beverage("Tea", 1.5, 0.3, 10));
    productList.add(new HotBeverage("Coffee", 2.0, 0.25, 70, 10));
    productList.add(new Food("Chocolate bar", 1.0, 0.1));
    productList.add(new Beverage("Lemon Tea", 1.8, 0.3, 10));
    productList.add(new Beverage("Mineral Water", 1.0, 0.5, 10));
    productList.add(new HotBeverage("Hot Cocoa", 2.2, 0.3, 65, 10));
    productList.add(new Food("Snickers", 1.2, 0.08));
    productList.add(new Food("Cookies", 0.5, 0.05));
    vendingMachine.initProducts(productList);

    // Тестирование торгового автомата
    String productName = "Coffee";
    double productVolume = 0.25;
    int productTemperature = 70;

    Product selectedProduct = vendingMachine.getProduct(productName, productVolume, productTemperature);
    if (selectedProduct != null) {
      System.out.println("Выбранный продукт: " + selectedProduct);
    } else {
      System.out.println("Нет такого товара в автомате.");
    }

    // Создание заказа
    List<OrderItem> orderItems = new ArrayList<>();
    orderItems.add(new OrderItem("Coffee", 0.25, 70));
    orderItems.add(new OrderItem("Tea", 0.3, 0));
    Order order = UserInterface.createOrder(orderItems, vendingMachine, "Никита Павлов");
    order.validateOrder(vendingMachine); // Validate the order
    System.out.println("Информация о заказе:\n" + order);

    vendingMachine.showRemainingProducts();
  }
}
