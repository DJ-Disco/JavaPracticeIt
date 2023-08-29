package Lec3E5;

public class SandwichFilling {
    private String fillingType;
    private double kcals;

    public String getFillingType() {
        return fillingType;
    }
    public double getKcals() {
        return kcals;
    }

    SandwichFilling(String fillingType, double kcals) {
        this.fillingType = fillingType;
        this.kcals = kcals;
    }
}
