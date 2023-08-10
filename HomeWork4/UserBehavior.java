package HomeWork4;

import java.util.List;

public interface UserBehavior {

  void setMakeOrder(boolean setMake);

  void setTakeOrder(boolean setTake);

  boolean isMakeOrder(boolean isMake);

  boolean isTakeOrder(boolean isTake);

  Order<Product> makeOrder(List<String> listHuman, Automat automat, Human human);

}