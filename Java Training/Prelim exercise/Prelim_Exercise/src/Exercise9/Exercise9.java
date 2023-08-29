package Exercise9;

public class Exercise9 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();

        pizza1.setToppings("Mushrooms");
        pizza1.setDiameter(18);
        pizza1.setPrice(17.99);

        System.out.println("Toppings = "+pizza1.getToppings());
        System.out.println("Diameter = "+pizza1.getDiameter());
        System.out.println("Price = "+pizza1.getPrice());

    }
}
