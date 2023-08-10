package HomeWork4;

import java.util.List;

public class HotAutomatService implements Service<HotBeverageAutomat, HotBeverage> {

  @Override
  public HotBeverageAutomat restock(HotBeverageAutomat automat, HotBeverage product) {
    Product addProduct = automat.getProductOnName(product.getName());
    List<Product> listProducts = automat.getListProduct();
    if (addProduct != null) {
      addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
    } else {
      listProducts.add(product);
    }
    automat.initProduct(listProducts);
    return automat;

  }

}