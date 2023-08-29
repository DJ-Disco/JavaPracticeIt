package Lec3E5;

public class Bread {
    private String breadType;
    private double kcals;

    public String getBreadType() {
        return breadType;
    }
    public double getKcals() {
        return kcals;
    }

    Bread(String breadType, double kcals) {
        this.breadType = breadType;
        this.kcals = kcals;
    }
}
