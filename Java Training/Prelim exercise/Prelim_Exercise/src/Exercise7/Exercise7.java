package Exercise7;
//salary
import javax.swing.JOptionPane;

public class Exercise7 {
    public static void main(String[] args) {
        double payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Pay Rate (per Hour):"));
        double regularHours = Double.parseDouble(JOptionPane.showInputDialog("Enter Regular Hours:"));
        double overtimeHours = Double.parseDouble(JOptionPane.showInputDialog("Enter Overtime Hours:"));

        System.out.println("Daily salary = "+dailySalary(payRate, regularHours, overtimeHours));
        System.out.println("Weekly salary (6 days a week) = "+weeklySalary(dailySalary(payRate, regularHours, overtimeHours)));

        
        
    }
    public static double dailySalary(double pR, double rH, double oH){
        return (rH*pR)+(oH*pR);
    } 
    public static double weeklySalary(double dailySalary){
        return dailySalary*6;
    }
    
}
