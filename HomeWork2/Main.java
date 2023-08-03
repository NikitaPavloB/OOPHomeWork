package HomeWork2;

// Main.java
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Никита Александрович");
        Product product1 = new Product("Яблоко", 1.5, 5);
        Product product2 = new Product("Бананы", 2.0, 0); // Нет в наличии

        Order order = createOrder(customer, product1, product2);
        System.out.println(order);
    }

    public static Order createOrder(Customer customer, Product... products) {
        Order order = new Order(customer);
        for (Product product : products) {
            order.addProduct(product);
        }
        return order;
    }
}
