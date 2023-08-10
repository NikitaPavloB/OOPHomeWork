package HomeWork4;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

        public static void main(String[] args) {

                // Создание продуктов
                Product hotBeverageProduct1 = new HotBeverage("Lungo", 100, 12,
                                new GregorianCalendar(2023, 7, 20, 0, 0), 0.2, 80);
                Product hotBeverageProduct2 = new HotBeverage("Macchiato", 200, 10,
                                new GregorianCalendar(2023, 7, 20, 0, 0), 0.5, 60);
                Product hotBeverageProduct3 = new HotBeverage("Cappuccino", 150, 5,
                                new GregorianCalendar(2023, 7, 20, 0, 0), 0.5, 80);
                HotBeverage hotBeverageProduct4 = new HotBeverage("Glasse", 210, 0,
                                new GregorianCalendar(2023, 7, 20, 0, 0), 0.8, 50);
                HotBeverage hotBeverageProduct5 = new HotBeverage("Americano", 100, 13,
                                new GregorianCalendar(2023, 7, 20, 0, 0), 0.2, 70);
                Product foodProduct1 = new Food("Cookie", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 25);
                Product foodProduct2 = new Food("Chocolate", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 20);
                Product foodProduct3 = new Food("Bun", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 18);

                // Инициализация списков продуктов
                List<Product> hotBeverageProducts = new ArrayList<>();
                hotBeverageProducts.add(hotBeverageProduct1);
                hotBeverageProducts.add(hotBeverageProduct2);
                hotBeverageProducts.add(hotBeverageProduct3);
                hotBeverageProducts.add(hotBeverageProduct4);
                hotBeverageProducts.add(hotBeverageProduct5);

                List<Product> foodProducts = new ArrayList<>();
                foodProducts.add(foodProduct1);
                foodProducts.add(foodProduct2);
                foodProducts.add(foodProduct3);

                // Инициализация автоматов
                HotBeverageAutomat hotBeverageAutomat = new HotBeverageAutomat();
                hotBeverageAutomat.initProduct(hotBeverageProducts);

                System.out.println("HotBeverageAutomat до пополнения:\n" + hotBeverageAutomat.toString());
                System.out.println("----------");

                HotBeverage hotBeverageProduct6 = new HotBeverage("Glasse", 210, 12,
                                new GregorianCalendar(2023, 7, 20, 0, 0), 0.8, 50);
                HotBeverage hotBeverageProduct7 = new HotBeverage("IceCoffee", 100, 7,
                                new GregorianCalendar(2023, 7, 20, 0, 0), 0.2, 30);

                HotAutomatService hotAutomatService = new HotAutomatService();
                hotAutomatService.restock(hotBeverageAutomat, hotBeverageProduct6);

                System.out.println("HotBeverageAutomat после пополнения " + hotBeverageProduct6.getName() + " на "
                                + hotBeverageProduct6.getQuantity() + ":\n" + hotBeverageAutomat.toString());
                System.out.println("----------");

                hotAutomatService.restock(hotBeverageAutomat, hotBeverageProduct7);
                System.out.println("HotBeverageAutomat после пополнения " + hotBeverageProduct7.getName() + " на "
                                + hotBeverageProduct7.getQuantity() + ":\n" + hotBeverageAutomat.toString());
                System.out.println("----------");
                System.out.println("----------");

                Automat foodAutomat = new Automat();
                foodAutomat.initProduct(foodProducts);
                System.out.println("Automat до пополнения:\n" + foodAutomat.toString());
                System.out.println("----------");

                Food foodProduct4 = new Food("Twix", 80, 21, new GregorianCalendar(2023, 10, 10, 0, 0), 25);
                Food foodProduct5 = new Food("Bounty", 90, 18, new GregorianCalendar(2023, 10, 10, 0, 0), 20);

                AutomatService automatService = new AutomatService();
                automatService.restock(foodAutomat, foodProduct4);

                System.out.println("Automat после пополнения " + foodProduct4.getName() + " на "
                                + foodProduct4.getQuantity() + ":\n" + foodAutomat.toString());
                System.out.println("----------");

                automatService.restock(foodAutomat, foodProduct5);
                System.out.println("Automat после пополнения " + foodProduct5.getName() + " на "
                                + foodProduct5.getQuantity() + ":\n" + foodAutomat.toString());
                System.out.println("----------");
                System.out.println("----------");

                Human human = new Human("Nik", false, false, 500);
                human.setAutomat(hotBeverageAutomat);
                System.out.println("Покупатель сделал заказ -> " + human.toString());
                System.out.println("----------");

                System.out.println("Наличие в автомате до реализации заказа:\n" + hotBeverageAutomat.toString());
                System.out.println("----------");

                List<String> orderItems = new ArrayList<>();
                orderItems.add("Espresso");
                orderItems.add("Glasse");
                System.out.println(human.makeOrder(orderItems, hotBeverageAutomat, human));

                System.out.println("----------");
                System.out.println("Покупатель получил заказ -> " + human.toString());

                System.out.println("----------");
                System.out.println("Наличие в автомате после выдачи заказа:\n" + hotBeverageAutomat.toString());

        }
}
