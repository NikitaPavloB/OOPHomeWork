package HomeWork4;

import java.util.List;

public class AutomatService implements Service<Automat, Product> {

  @Override
  public Automat restock(Automat automat, Product product) {
    Product existingProduct = automat.getProduct(product.getName());
    List<Product> productList = automat.getListProduct();

    if (existingProduct != null) {
      existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
    } else {
      productList.add(product);
    }

    automat.initProduct(productList);
    return automat;
  }
}
