package HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class Human extends User {

  private double money;
  private Automat automat;

  public Human(String name, boolean makeOrder, boolean takeOrder, double money) {
    super(name, makeOrder, takeOrder);
    this.money = money;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  @Override
  public void setMakeOrder(boolean makeOrder) {
    this.makeOrder = makeOrder;
  }

  @Override
  public void setTakeOrder(boolean takeOrder) {
    this.takeOrder = takeOrder;
  }

  @Override
  public boolean isMakeOrder(boolean isMake) {
    return true;
  }

  @Override
  public boolean isTakeOrder(boolean isTake) {
    return true;
  }

  public void setAutomat(Automat automat) {
    this.automat = automat;
  }

  public Automat getAutomat() {
    return automat;
  }

  @Override
  public Order<Product> makeOrder(List<String> listHuman, Automat automat, Human human) {
    ArrayList<Product> shoppingList = new ArrayList<>();
    Product shoppingProduct;
    for (String productName : listHuman) {
      shoppingProduct = automat.getProduct(productName);
      if (shoppingProduct != null) {
        shoppingList.add(shoppingProduct);
      }
    }
    human.setMakeOrder(true);
    return automat.createOrder(shoppingList, automat, human);
  }

  @Override
  public String toString() {
    return super.toString() + " деньги = " + money;
  }
}
