package L5A2P1;

public class insuredPackage extends Package {
    //datafields
    private int costAdditional;
    
    //subclass constructor
    insuredPackage(double weight, char methodShipping) {
        super(weight, methodShipping);
        super.calculateShipCost();

        if (super.getCostShipping()>200) {
            costAdditional = 275;
        } else if (super.getCostShipping()>100) {
            costAdditional = 200;
        } else {
            costAdditional = 125;
        }
    }

    //overwrite display
    void display () {
        super.display();
        System.out.println("Additional Cost: "+costAdditional);
    }
}
