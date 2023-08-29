package Exercise11;

public class Checkup {
    private int patientNumber;
    private int systolicFigure;
    private int diastolicFigure;
    private double LDL;
    private double HDL;

    Checkup () {
        this.patientNumber = 0;
        this.systolicFigure = 0;
        this.diastolicFigure = 0;
        this.LDL = 0;
        this.HDL = 0;
    }

    public int getPatientNumber(){
        return patientNumber;
    }
    public int getSystolicFigure(){
        return systolicFigure;
    }
    public int getDiastolicFigure(){
        return diastolicFigure;
    }
    public double getLDL(){
        return LDL;
    }
    public double getHDL(){
        return HDL;
    }

    public void setPatientNumber(int patientNumber){
        this.patientNumber = patientNumber;
    }
    public void setSystolicFigure(int systolicFigure){
        this.systolicFigure = systolicFigure;
    }
    public void setDiastolicFigure(int diastolicFigure){
        this.diastolicFigure = diastolicFigure;
    }
    public void setLDL(double LDL){
        this.LDL = LDL;
    }
    public void setHDL(double HDL){
        this.HDL = HDL;
    }

    public double computeRatio(){
        return this.LDL/this.HDL;
    }
    public void explainRatio(){
        System.out.println("HDL is known as \"good cholesterol\" when the optimum LDL/HDL ratio is 3.5 or lower");
    }
}
