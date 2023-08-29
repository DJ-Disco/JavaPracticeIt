package Lec4E1;

import javax.swing.JOptionPane;

public class BadSubscriptCaught {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int input;

        do {
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog("Input element no."));
                System.out.println("Element you entered displays "+arr[input]);
                break;
            } catch (ArrayIndexOutOfBoundsException error) {
                System.out.println("Element is out of bounds");
            } catch (NumberFormatException error) {
                System.out.println("Invalid input.");
            }
        } while (true);
    }


}
