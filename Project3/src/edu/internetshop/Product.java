package edu.internetshop;

public class Product {

    private String title;
    private double price;
    private Seller seller;

    public Product(String title, double price, Seller seller) {
        this.title = title;
        this.price = price;
        this.seller = seller;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + String.format("%.2f", price) +
                ", seller=" + seller.getSellerName() +
                '}';
    }
}
