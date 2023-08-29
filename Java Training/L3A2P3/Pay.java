public class Pay {

    private double workHours;
    private double payRate;
    private double withholdRate;
    private double grossPay;
    private double netPay;

    public double getNetPay() {
        return netPay;
    }
    
    public void computeNetPay(double workHours, double payRate, double withholdRate) {
        netPay = (workHours * payRate) - ((workHours * payRate)*(withholdRate/100));
    }

    public void computeNetPay(double workHours, double payRate) {
        this.computeNetPay(workHours,payRate,15);
    }

    public void computeNetPay(double workHours) {
        this.computeNetPay(workHours,45,15);
    }
    
}
