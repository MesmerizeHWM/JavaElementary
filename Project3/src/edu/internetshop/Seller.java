package edu.internetshop;

public class Seller {

    private String sellerName;
    private double money = 0;

    public Seller(String sellerName) {
        this.sellerName = sellerName;
        this.money = money;
    }

    public String getSellerName() {
        return sellerName;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money){
        this.money += money;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerName='" + sellerName + '\'' +
                ", money=" + String.format( "%.2f", money) +
                '}';
    }
}
