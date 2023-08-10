package HomeWork4;

import java.util.Calendar;

public class Beverage extends Product {

  private Double volume;

  public Beverage(String name, int price, int quantity, Calendar bestBefore, Double volume) {
    super(name, price, quantity, bestBefore);
    this.volume = volume;
  }

  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }

  @Override
  public String toString() {
    // Используем String.format для более читаемого форматирования
    return String.format("%s, объем = %.2f", super.toString(), volume);
  }
}
