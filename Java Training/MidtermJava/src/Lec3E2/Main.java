package Lec3E2;

public class Main {
    public static void main(String[] args) {
        Billing object1 = new Billing();

        double price = 100;
        int quantity = 2;
        double coupon = 10;

        System.out.println("Test1: Price is "+object1.computeBill(price));  
        System.out.println("Test2: Price is "+object1.computeBill(price,quantity));  
        System.out.println("Test3: Price is "+object1.computeBill(price,quantity,coupon));  
    }
}
