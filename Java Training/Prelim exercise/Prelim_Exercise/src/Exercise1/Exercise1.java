package Exercise1;
//displayIt
import javax.swing.JOptionPane;

public class Exercise1 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

        displayIt(num1,num2);
        displayItTimesTwo(num1,num2);
        displayItPlusOneHundred(num1,num2);


    }
    public static void displayIt(int num1, int num2) {
        System.out.println("displayIt()");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println();
    }
    public static void displayItTimesTwo(int num1, int num2) {
        num1 *= 2;
        num2 *= 2;

        System.out.println("displayItTimesTwo()");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println();
    }
    public static void displayItPlusOneHundred(int num1, int num2) {
        num1 += 100;
        num2 += 100;

        System.out.println("displayItPlusOneHundred()");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println();
    }
}
