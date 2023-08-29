package Exercise3;
//eggs
import javax.swing.JOptionPane;

public class Exercise3 {
    public static void main(String[] args) {

        int numberOfEggs = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of eggs"));

        int dozen = numberOfEggs/12;
        int remain = numberOfEggs%12;

        System.out.println(numberOfEggs+" eggs is "+dozen+" full dozen (with "+remain+" eggs remaining)");
        
    }
    
}
