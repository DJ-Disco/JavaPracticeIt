package com.example;
//RELAYO_L2A2P2
import javax.swing.JOptionPane;

public class App 
{
    public static void main(String[] args) throws Exception {
      String input1, input2;
      double distance;
      int sed;

      input1 = JOptionPane.showInputDialog("Enter the distance travelled (in km):");
      input2 = JOptionPane.showInputDialog("Is the passenger a student/elderly/disabled or SED? (1 - Yes, 0 - No)");

      distance = Double.parseDouble(input1);
      sed = Integer.parseInt(input2);

      System.out.println("Distance (km): " + distance);

      if (sed == 1) {
        System.out.println("Is passenger SED? Yes");
      } else {
        System.out.println("Is passenger SED? No");
      }
      
      System.out.printf("Please pay P %f%n", fareRate(distance,sed));


    }
    public static double fareRate(double distance, int sed) {
      double fare = 12, temp = 0;
      distance = Math.ceil(distance);

      if (distance > 4) {
        temp = distance - 4;
        fare += temp*1.50;
      }
      
      if (sed == 1) {
        fare -= fare*0.20;
      }

      return fare;
    }
}
