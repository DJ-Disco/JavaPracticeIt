public class cpe0421_l3a3p3 {
    public static void main(String[] args) {
        Pay pay1 = new Pay();
        Pay pay2 = new Pay();
        Pay pay3 = new Pay();

        pay1.computeNetPay(40);
        pay2.computeNetPay(35,50);
        pay3.computeNetPay(45,55,12);

        System.out.println("Pay 1: "+pay1.getNetPay());
        System.out.println("Pay 2: "+pay2.getNetPay());
        System.out.println("Pay 3: "+pay3.getNetPay());
    }
}
