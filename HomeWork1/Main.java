package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Initialization of products
    Product product1 = new Beverage("Coca-Cola", 2.5, 0.5);
    Product product2 = new Beverage("Tea", 1.5, 0.3);
    Product product3 = new HotBeverage("Coffee", 2.0, 0.25, 70);
    Product product4 = new Food("Chocolate Bar", 1.0, 0.1);

    // Initialization of vending machine and adding products to the machine
    HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
    List<Product> productList = new ArrayList<>();
    productList.add(product1);
    productList.add(product2);
    productList.add(product3);
    productList.add(product4);
    vendingMachine.initProducts(productList);

    // Testing the vending machine
    String productName = "Coffee";
    double productVolume = 0.25;
    int productTemperature = 70;

    Product selectedProduct = vendingMachine.getProduct(productName, productVolume, productTemperature);
    if (selectedProduct != null) {
      System.out.println("Selected product: " + selectedProduct);
    } else {
      System.out.println("No such product in the vending machine.");
    }
  }
}
