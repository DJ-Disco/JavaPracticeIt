import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      String input1, input2;

      input1 = JOptionPane.showInputDialog("Enter the distance travelled (in km):");
      input2 = JOptionPane.showInputDialog("Is the passenger a student/elderly/disabled or SED? (1 - Yes, 0 - No)");

      
      System.out.println("Distance (km): " + Double.parseDouble(input1));

      if (Double.parseDouble(input2) == 1) {
        System.out.println("Is passenger SED? Yes");
      } else {
        System.out.println("Is passenger SED? No");
      }
      
      System.out.print("Please pay P " + fareRate(Double.parseDouble(input1),Integer.parseInt(input2)));


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
