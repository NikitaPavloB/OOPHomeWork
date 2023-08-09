package HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Initialization of products
    Product product1 = new Beverage("Кока-кола", 2.5, 0.5);
    Product product2 = new Beverage("Чай", 1.5, 0.3);
    Product product3 = new HotBeverage("Кофе", 2.0, 0.25, 70);
    Product product4 = new Food("Плитка шоколада", 1.0, 0.1);

    // Инициализация торгового автомата и добавление продуктов в автомат
    HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
    List<Product> productList = new ArrayList<>();
    productList.add(product1);
    productList.add(product2);
    productList.add(product3);
    productList.add(product4);
    vendingMachine.initProducts(productList);

    // Тестирование торгового автомата
    String productName = "Кофе";
    double productVolume = 0.25;
    int productTemperature = 70;

    Product selectedProduct = vendingMachine.getProduct(productName, productVolume, productTemperature);
    if (selectedProduct != null) {
      System.out.println("Выбранный продукт: " + selectedProduct);
    } else {
      System.out.println("Нет такого товара в автомате..");
    }

    // Создание заказа
    List<OrderItem> orderItems = new ArrayList<>();
    orderItems.add(new OrderItem("Кофе", 0.25, 70));
    orderItems.add(new OrderItem("Чай", 0.3, 0));
    Order order = createOrder(orderItems, vendingMachine, "Никита Павлов");
    System.out.println("Информация о заказе:\n" + order);
  }

  public static Order createOrder(List<OrderItem> items, VendingMachine vendingMachine, String customerName) {
    List<Product> selectedProducts = new ArrayList<>();
    double totalCost = 0.0;

    for (OrderItem item : items) {
      Product product = vendingMachine.getProduct(item.getName(), item.getVolume(), item.getTemperature());
      if (product instanceof Beverage) {
        Beverage beverage = (Beverage) product;
        if (beverage.getVolume() >= item.getVolume()) {
          selectedProducts.add(beverage);
          totalCost += beverage.getPrice();
        }
      }
    }

    Order order = new Order(customerName, selectedProducts, totalCost);
    return order;
  }
}