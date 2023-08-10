package HomeWork4;

import java.util.Calendar;

public abstract class Product implements Comparable<Product> {

  private String name;
  private int price;
  private int quantity;
  private Calendar bestBefore;

  public Product(String name, int price, int quantity, Calendar bestBefore) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.bestBefore = bestBefore;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public Calendar getBestBefore() {
    return bestBefore;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setBestBefore(Calendar bestBefore) {
    this.bestBefore = bestBefore;
  }

  @Override
  public String toString() {
    return "Продукт: Название = " + name + ", цена = " + price + ", количество = " + quantity + ", Годен до = "
        + bestBefore.get(Calendar.YEAR) + "/" + (bestBefore.get(Calendar.MONTH) + 1);
  }

  @Override
  public int compareTo(Product otherProduct) {
    return this.getName().compareTo(otherProduct.getName());
  }
}
