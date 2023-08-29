package L5A2P1;

public class Package {
    //datafields
    private double weight;
    private double costShipping;
    private char methodShipping;

    //constructor
    Package(double weight, char methodShipping) {
        this.weight = weight;
        this.methodShipping = methodShipping;
        calculateShipCost();
    }
    
    //setters
    void setMethodShipping(double methodShipping) {
        this.methodShipping = methodShipping;
    }
    void setWeight(double weight) {
        this.weight = weight;
    }

    //getters
    char getMethodShipping() {
        return methodShipping;
    }
    double getWeight() {
        return weight;
    }
    double getCostShipping() {
        return costShipping;
    }

    //calculations
    void calculateShipCost() {
        if(methodShipping == 'A') {
            elseifMethod(225,150,100);
        } else if(methodShipping == 'T') {
            elseifMethod(162.5,112.5,75);
        } else if(methodShipping == 'M') {
            elseifMethod(112.5,75,25);
        }
    }
    void elseifMethod(double a, double b, double c) {
        if (weight>500) {
            costShipping = a;
        } else if (weight > 250) {
            costShipping = b;
        } else if (weight <= 250) {
            costShipping = c;
        }
    }

    //display
    void display() {
        System.out.println("Weight (g): "+weight);
        if(methodShipping == 'A') {
            System.out.println("Shipping Method: Air");
        } else if(methodShipping == 'T') {
            System.out.println("Shipping Method: Truck");
        } else if(methodShipping == 'M') {
            System.out.println("Shipping Method: Mail");
        }
        System.out.println("Shipping Cost (PhP): "+costShipping);
    }



}
