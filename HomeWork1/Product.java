package HomeWork1;

public class Product {
  protected String name;
  protected double price;
  protected double volume; // Add volume field to Product
  protected int temperature; // Add temperature field to Product

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String toString() {
    return name + " (Price: " + price + ")";
  }
}
