package Exercise9;

public class Pizza {
    private String toppings;
    private int diameter;
    private double price;

    Pizza(){
        this.toppings = "Pepperoni";
        this.diameter = 12;
        this.price = 13.99;
    }

    public String getToppings() {
        return toppings;
    }
    public int getDiameter() {
        return diameter;
    }
    public double getPrice() {
        return price;
    }

    public void setToppings(String toppings){
        this.toppings = toppings;
    }
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
}
