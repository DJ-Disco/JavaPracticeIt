package Lec3E2;

public class Billing {
    
    public double computeBill(double price){
        return price + (price*0.08);
    }
    public double computeBill(double price, int quantity){
        return quantity * computeBill(price);
    }
    public double computeBill(double price, int quantity, double coupon){
        coupon = coupon / 100;
        return computeBill(price, quantity) - (computeBill(price, quantity) * coupon);
    }
}
