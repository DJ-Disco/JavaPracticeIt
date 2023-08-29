package Exercise8;
//interest
import javax.swing.JOptionPane;

public class Exercise8 {
    public static void main(String[] args) {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount of Money:"));
        double years = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount of Years:"));
        double interest = Double.parseDouble(JOptionPane.showInputDialog("Enter Interest Rate per Year:"));
    
        System.out.println("Amount of Money Originally = "+amount);
        System.out.println("Interest Rate per Year = "+(interest/100));
        System.out.println("Money after "+years+" years = "+calculation(amount,years,(interest/100)));
    }
    public static double calculation(double amount, double years, double interest){
        return amount*Math.pow((1+interest),years);
    }
}

