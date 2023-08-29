package Lec3E4;

import java.util.function.BiConsumer;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        BloodData object1 = new BloodData(inputBloodType(), inputRHFactor());
        JOptionPane.showMessageDialog(null, "Patient's Blood Type is "+object1.combine(), "Prompt", JOptionPane.PLAIN_MESSAGE);
    }
    public static String inputBloodType() {
        String input;
    
        do {
            input = JOptionPane.showInputDialog("Input Blood Type (O, A, B, AB):");
    
            if (input.equals("A") || input.equals("O") || input.equals("AB") || input.equals("B")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Try Again.", "Prompt", JOptionPane.PLAIN_MESSAGE);
                continue;
            }
        } while (true);
    
        JOptionPane.showMessageDialog(null, "Blood Type \'"+input+"\' was selected", "Prompt", JOptionPane.PLAIN_MESSAGE);

        return input;
    }
    public static String inputRHFactor() {
        String input;
    
        do {
            input = JOptionPane.showInputDialog("Input RH Factor (+, -):");
    
            if (input.equals("+") || input.equals("-")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Try Again.", "Prompt", JOptionPane.PLAIN_MESSAGE);
                continue;
            }
        } while (true);
    
        JOptionPane.showMessageDialog(null, "RH Factor \'"+input+"\' was selected", "Prompt", JOptionPane.PLAIN_MESSAGE);

        return input;
    }
}
