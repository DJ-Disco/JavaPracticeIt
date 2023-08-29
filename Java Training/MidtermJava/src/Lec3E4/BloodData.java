package Lec3E4;

public class BloodData {
    private String bloodType;
    private String rhFactor;

    public String getBloodType() {
        return bloodType;
    }
    public String getRhFactor() {
        return rhFactor;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String combine(){
        return bloodType = bloodType+rhFactor;
    }

    BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }

    BloodData(String bloodType, String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
}
