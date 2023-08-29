package Lec4E5;

import javax.swing.JOptionPane;

public class SqrtException {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number: ");
        double number;

        try{
            number = Double.parseDouble(input);
            
            if(number < 0){
                throw new ArithmeticException();
            }
            System.out.println("The Square root of " + number + " is " + Math.sqrt(number));
        }
        catch(ArithmeticException mistake){
            System.out.println("DONT PUT NEGATIVE NUMBERS YOU DUMBASS");

        }
        catch(Exception mistake){
            System.out.println("Entered number is invalid");

        }

    }
}
