package HomeWork3.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
  public static void main(String[] args) {
    HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("Меню:");
      System.out.println("1. Выбрать продукт");
      System.out.println("2. Создать заказ");
      System.out.println("3. Показать остатки товаров");
      System.out.println("4. Выход");
      System.out.print("Выберите опцию: ");
      choice = scanner.nextInt();
      scanner.nextLine(); // Считываем символ новой строки

      switch (choice) {
        case 1:
          selectProduct(vendingMachine, scanner);
          break;
        case 2:
          createOrder(vendingMachine, scanner);
          break;
        case 3:
          vendingMachine.showRemainingProducts();
          break;
        case 4:
          System.out.println("Выход.");
          break;
        default:
          System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
      }
    } while (choice != 4);

    scanner.close(); // Закрываем Scanner после использования
  }

  private static void selectProduct(HotBeverageVendingMachine vendingMachine, Scanner scanner) {
    System.out.print("Введите название продукта: ");
    String productName = scanner.nextLine();

    Product selectedProduct = vendingMachine.getProduct(productName);
    if (selectedProduct != null) {
      System.out.println("Выбранный продукт: " + selectedProduct);
    } else {
      System.out.println("Нет такого товара в автомате.");
    }
  }

  private static void createOrder(HotBeverageVendingMachine vendingMachine, Scanner scanner) {
    List<OrderItem> orderItems = new ArrayList<>();
    System.out.print("Введите количество товаров в заказе: ");
    int itemCount = scanner.nextInt();
    scanner.nextLine(); // Считываем символ новой строки
    for (int i = 0; i < itemCount; i++) {
      System.out.print("Введите название продукта: ");
      String productName = scanner.nextLine();
      Product product = vendingMachine.getProduct(productName);
      if (product != null) {
        double volume = 0.0;
        int temperature = 0;
        if (product instanceof HotBeverage) {
          System.out.print("Введите объем (литры): ");
          volume = scanner.nextDouble();
          System.out.print("Введите температуру (°C): ");
          temperature = scanner.nextInt();
          scanner.nextLine(); // Считываем символ новой строки
        }
        orderItems.add(new OrderItem(productName, volume, temperature));
      } else {
        System.out.println("Товар с названием " + productName + " не найден в автомате.");
      }
    }

    Order order = createOrder(orderItems, vendingMachine, "Никита Павлов");
    order.validateOrder(vendingMachine); // Validate the order
    vendingMachine.reduceProductQuantities(orderItems); // Уменьшение количества товаров в автомате
    System.out.println("Информация о заказе:\n" + order);
  }

  public static Order createOrder(List<OrderItem> items, HotBeverageVendingMachine vendingMachine,
      String customerName) {
    List<Product> selectedProducts = new ArrayList<>();
    double totalCost = 0.0;

    for (OrderItem item : items) {
      Product product = vendingMachine.getProduct(item.getName(), item.getVolume(), item.getTemperature());
      if (product != null) {
        selectedProducts.add(product);
        totalCost += product.getPrice();
      }
    }

    Order order = new Order(customerName, selectedProducts, totalCost);
    return order;
  }
}
