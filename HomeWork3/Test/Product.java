package HomeWork3.Test;

public class Product implements Comparable<Product> {
  protected String name;
  protected double price;
  protected int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String toString() {
    return name + " (Цена: " + price + ")";
  }

  @Override
  public int compareTo(Product other) {
    return Double.compare(this.price, other.price);
  }
}
