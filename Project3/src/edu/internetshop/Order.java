package edu.internetshop;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> cart = new ArrayList<>();
    private double sum;
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getCart() {
        return cart;
    }

    public double getSum() {
        return sum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addToCart(Product product) {
        cart.add(product);
        sum += product.getPrice();
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
        sum -= product.getPrice();
    }

    public void removeAll() {
        cart.clear();
        this.sum = 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "cart=" + cart.toString() +
                ", sum=" + (sum > 0 ? String.format("%.2f", sum) : 0) +
                ", customer=" + customer.getCustomerName() +
                '}';
    }
}
