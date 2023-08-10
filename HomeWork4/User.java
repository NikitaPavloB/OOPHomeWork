package HomeWork4;

public abstract class User implements UserBehavior {

  private String name;
  protected boolean makeOrder;
  protected boolean takeOrder;

  public User(String name, boolean makeOrder, boolean takeOrder) {
    this.name = name;
    this.makeOrder = makeOrder;
    this.takeOrder = takeOrder;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Пользователь: имя = " + name + ", сделал заказ = " + makeOrder + ", забрал заказ = " + takeOrder;
  }
}
