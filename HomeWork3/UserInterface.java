package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
  public static void main(String[] args) {
    HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
    List<Product> productList = new ArrayList<>();
    productList.add(new Beverage("Coca Cola", 2.5, 0.5));
    productList.add(new Beverage("Tea", 1.5, 0.3));
    productList.add(new HotBeverage("Coffee", 2.0, 0.25, 70));
    productList.add(new Food("Chocolate bar", 1.0, 0.1));
    productList.add(new Beverage("Lemon Tea", 1.8, 0.3));
    productList.add(new Beverage("Mineral Water", 1.0, 0.5));
    productList.add(new HotBeverage("Hot Cocoa", 2.2, 0.3, 65));
    productList.add(new Food("Snickers", 1.2, 0.08));
    productList.add(new Food("Cookies", 0.5, 0.05));

    vendingMachine.initProducts(productList);

    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("Меню:");
      System.out.println("1. Выбрать продукт");
      System.out.println("2. Создать заказ");
      System.out.println("3. Выход");
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
          System.out.println("Выход.");
          break;
        default:
          System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
      }
    } while (choice != 3);
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
    List<Product> selectedProducts = new ArrayList<>();
    double totalCost = 0.0;

    System.out.print("Введите количество товаров в заказе: ");
    int itemCount = scanner.nextInt();
    scanner.nextLine(); // Считываем символ новой строки

    for (int i = 0; i < itemCount; i++) {
      System.out.print("Введите название продукта: ");
      String productName = scanner.nextLine();
      Product selectedProduct = vendingMachine.getProduct(productName);

      if (selectedProduct != null) {
        selectedProducts.add(selectedProduct);
        totalCost += selectedProduct.getPrice();
      }
    }

    String customerName = "Никита Павлов"; // Ваше имя
    Order order = new Order(customerName, selectedProducts, totalCost);
    System.out.println("Информация о заказе:\n" + order);
  }
}
