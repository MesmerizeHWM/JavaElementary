package edu.internetshop;

public class InternetShopDemo {

    public static void main(String[] args) {

        Seller firstSeller = new Seller("Ivan");
        Seller secondSeller = new Seller("Mark");
        Product apple = new Product("Apple", 3.50, firstSeller);
        Product banana = new Product("Banana", 6.50, secondSeller);
        Product lemon = new Product("Lemon", 25.00, secondSeller);
        Customer customer = new Customer("Roman", 20.00);
        Customer fakeCustomer = new Customer("Danzel", 50.00);
        Order order = new Order(customer);

        //checking initial amount of money
        System.out.println(firstSeller.toString());
        System.out.println(secondSeller.toString());
        System.out.println(customer.toString() + "\n");

        order.addToCart(apple);
        order.addToCart(banana);
        order.addToCart(lemon);

        //checking status of order
        System.out.println(order.toString() + "\n");

        //checking that it won't allow us to process order due to insufficient funds
        customer.payForOrder(order);

        //checking that fakeCustomer cannot pay for the order
        System.out.println("fakeCustomer check");
        fakeCustomer.payForOrder(order);

        order.removeFromCart(lemon);
        System.out.println(order.toString() + "\n");

        //checking that transaction is processed after removing expensive product
        customer.payForOrder(order);

        System.out.println(order.toString());
        System.out.println(firstSeller.toString());
        System.out.println(secondSeller.toString());
        System.out.println(customer.toString());

    }
}
