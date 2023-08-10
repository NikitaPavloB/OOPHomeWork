package HomeWork4;

import java.util.Comparator;

public class ProductVolumeComorator implements Comparator<Product> {

  @Override
  public int compare(Product o1, Product o2) {
    if (((Beverage) o1).getVolume() > ((Beverage) o2).getVolume()) {
      return 1;
    } else if (((HotBeverage) o1).getVolume() < ((HotBeverage) o2).getVolume()) {
      return -1;
    } else
      return 0;
  }

}