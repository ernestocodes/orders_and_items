import java.util.ArrayList;
import java.util.Set;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.0;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.5;
        
        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 4.5;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;
        System.out.printf("%s, your order is ready.\n", order1.name);

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total += item1.price;
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("%s ordered a %s. Their total is $%.2f.\n", order2.name, item1.name, order2.total);

        Order order3 = new Order();
        order3.name = "Noah";
        order2.items.add(item3);
        order3.total += item3.price;
        System.out.printf("%s ordered a %s. Their total is $%.2f.\n", order3.name, item3.name, order3.total);

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("%s, your total is $%.2f\n", order4.name, order4.total);

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
