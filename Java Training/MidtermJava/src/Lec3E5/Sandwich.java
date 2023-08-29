package Lec3E5;

import javax.sound.midi.Soundbank;

public class Sandwich {
    private Bread bread;
    private SandwichFilling filling;

    
    Sandwich(String breadType, double breadCals, String fillingType, double fillingCals) {
        bread = new Bread(breadType, breadCals);
        filling = new SandwichFilling(fillingType, fillingCals);
    }

    public void displaySandwich(){
        System.out.println("Bread: "+bread.getBreadType);
        System.out.println("Filling: "+filling.getFillingType);
        System.out.println("Total Kcals: "+((2*bread.getKcals)+filling.getKcals));
    }
    
}
