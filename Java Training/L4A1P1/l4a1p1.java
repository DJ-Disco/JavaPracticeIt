import javax.swing.JOptionPane;

public class l4a1p1 {
    public static void main(String[] args) {

        double input;
        
        try{
            input = Double.parseDouble(JOptionPane.showInputDialog("Enter a floating-point number:"));
            System.out.println("You entered "+input);
        } catch (Exception e){
            System.out.println("Am I Gay?");
        } catch (NumberFormatException d) {
            System.out.println("Invalid input. You entered 0.0");
        }

    }
}
