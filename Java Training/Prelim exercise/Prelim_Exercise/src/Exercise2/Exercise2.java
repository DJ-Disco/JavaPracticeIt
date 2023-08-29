package Exercise2;
//Sum and difference and product
import javax.swing.JOptionPane;

public class Exercise2 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

        System.out.println("Sum = "+sum(num1,num2)); 
        System.out.println("Difference = "+difference(num1,num2));
        System.out.println("Product = "+product(num1,num2));


    }
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int difference(int num1, int num2) {
        return num1 - num2;
    }
    public static int product(int num1, int num2) {
        return num1 * num2;
    }
    
}
