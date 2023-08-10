package HomeWork3;

public class Product implements Comparable<Product> {
  protected String name;
  protected double price;

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
