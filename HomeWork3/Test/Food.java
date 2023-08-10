package HomeWork3.Test;

public class Food extends Product {
  private double weight;

  public Food(String name, double price, double weight) {
    super(name, price);
    this.weight = weight;
  }

  public String toString() {
    return super.toString() + ", Масса: " + weight + " кг";
  }
}
