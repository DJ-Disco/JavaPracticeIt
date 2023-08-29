package Lec4E4;

import javax.swing.JOptionPane;

public class DistanceFromAverage {
    public static void main(String[] args) {
        double[] arr;
        int input;
        double mean = 0;
 
        do {
            try{
                input = Integer.parseInt(JOptionPane.showInputDialog("Enter array size"));
                arr = new double[input];
                break;
            } catch (NumberFormatException error) {
                System.out.println("Only integers allowed in this field.");
            } catch (NegativeArraySizeException error) {
                System.out.println("No negative integers allowed in this field.");
            }
        } while (true);

        for (int i=0;i<input;i++){
            do {
                try {
                    arr[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter value for element "+i));
                    break;
                } catch (NumberFormatException error) {
                    Sy4stem.out.println("Only floats allowed in this field.");
                }
            } while (true);
            mean += arr[i];
        }

        mean /= input;

        System.out.println("Mean is "+mean);

        for (int i=0;i<input;i++) {
            System.out.println("Element "+i+" ("+arr[i]+") is "+Math.abs(arr[i]-mean)+" units away from the mean");
        }


    }
}
