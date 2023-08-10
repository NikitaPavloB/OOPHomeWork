package HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class Automat {

  protected List<Product> listProduct = new ArrayList<>();

  public void initProduct(List<Product> productList) {
    listProduct = productList;
  }

  public List<Product> getListProduct() {
    return listProduct;
  }

  public void setListProduct(List<Product> listProduct) {
    this.listProduct = listProduct;
  }

  public Product getProduct(String name) {
    for (Product product : listProduct) {
      if (product.getName().equals(name)) {
        return product;
      }
    }
    return null;
  }

  public Order<Product> createOrder(List<Product> shoppingList, Automat automat, Human human) {
    ArrayList<Product> purchasedItems = new ArrayList<>();
    Product shoppingProduct;
    double totalPrice = 0;

    for (Product product : shoppingList) {
      shoppingProduct = automat.getProduct(product.getName());
      if (shoppingProduct != null && shoppingProduct.getQuantity() > 0) {
        purchasedItems.add(shoppingProduct);
        totalPrice += shoppingProduct.getPrice();
        shoppingProduct.setQuantity(shoppingProduct.getQuantity() - 1);
      } else if (shoppingProduct != null && shoppingProduct.getQuantity() == 0) {
        System.out.println(product.getName() + " нет в наличии");
      }
    }

    human.setTakeOrder(true);
    Order<Product> order = new Order<>(purchasedItems, human, automat, totalPrice);
    human.setMoney(human.getMoney() - totalPrice);

    return order;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("Автомат [\n");
    for (Product product : listProduct) {
      result.append(product).append("\n");
    }
    return result.append("]").toString();
  }
}
