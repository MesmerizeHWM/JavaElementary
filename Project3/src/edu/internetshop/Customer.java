package edu.internetshop;

public class Customer {

    private String customerName;
    private double money;

    public Customer(String customerName, double money) {
        this.customerName = customerName;
        this.money = money;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getMoney() {
        return money;
    }

    /**
     *
     * prints "Paid for order" and processes all transactions if condition is true, otherwise prints "Not enough money =(("
     */
    public void payForOrder(Order order) {
        System.out.print("Processing order: ");
        if ( this.isMoneyEnough(order) & isValidOrder(order)) {
            this.money -= order.getSum();
            for (int i = 0; i < order.getCart().size(); i++) {
                order.getCart().get(i).getSeller().addMoney(order.getCart().get(i).getPrice());
            }
            order.removeAll();
            System.out.println("Paid for order" + "\n");
        }
    }

    private boolean isMoneyEnough(Order order){
        if (money > 0 && order.getSum() <= money) {
            return true;
        }
        System.out.println("Not enough money =((" + "\n");
        return false;
    }

    private boolean isValidOrder(Order order) {
        if (this.equals(order.getCustomer())) {
            return true;
        }
        System.out.println("This is not your order" + "\n");
        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", money=" + String.format( "%.2f", money) +
                '}';
    }
}
