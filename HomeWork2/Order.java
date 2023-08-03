package HomeWork2;

// Order.java
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double totalCost;
    private Customer customer;

 // Конструктор класса Order для создания объекта заказа

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalCost = 0.0;
    }

  // Метод добавления продукта в заказ

    public void addProduct(Product product) {
        if (product.getQuantity() > 0) {
            products.add(product);
            totalCost += product.getPrice();
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalCost() {
        return totalCost;
    }

// Переопределенный метод toString для получения текстового представления заказа

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Заказ для: ").append(customer.getName()).append("\n");
        sb.append("Продукты:\n");
        for (Product product : products) {
            sb.append("- ").append(product.getName()).append(", Количество: ").append(product.getQuantity())
                    .append(", Цена: ").append(product.getPrice()).append("\n");
        }
        sb.append("Общая стоимость: ").append(totalCost);
        return sb.toString();
    }
}
