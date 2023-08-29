package Exercise5;
//finalPrice
import javax.swing.JOptionPane;

public class Exercise {
    public static void main(String[] args) {
        double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Product Price in Php"));
        double commissionRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Commission Rate in Percent"));
        double discountRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Discount Rate in Percent"));

        System.out.println("Final Price = "+finalPrice(productPrice,commissionRate,discountRate));
    }
    public static double finalPrice(double pP,double cR,double dR){
        cR = (pP*(cR/100));
        dR = (pP*(dR/100));

        return (pP+cR)-dR;
    }
}
