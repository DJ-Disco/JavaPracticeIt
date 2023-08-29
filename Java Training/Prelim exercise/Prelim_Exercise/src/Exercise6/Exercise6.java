package Exercise6;
//division
import javax.swing.JOptionPane;

public class Exercise6 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

        divide(num1,num2);
    }
    public static void divide(int num1, int num2) {
        int result = num1/num2;
        int remainder = num1%num2;

        System.out.print(num1+" divided by "+num2+" is "+result);
        if (remainder!=0) {
            System.out.print(" with a remainder of "+remainder);
        }
        
    }
    
}
