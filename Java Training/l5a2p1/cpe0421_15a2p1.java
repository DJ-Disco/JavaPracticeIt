package L5A2P1;
import javax.swing.JOptionPane;
public class cpe0421_15a2p1 {
    public static void main(String[] args) {
        //get user input
        int input1 = Integer.parseInt(JOptionPane.showInputDialog("Do you want normal or insured shipping?\nEnter 1 - Normal\nEnter 2 = Insured"));
        double input2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight of the package in grams"));
        char input3 = JOptionPane.showInputDialog("Enter the shipping mode\nEnter A = Air\nEnter T = Truck\nEnter M = Mail").charAt(0);

        //insured or not insured
        if(input1==1) {
            Package object = new Package(input2, input3);
            object.display();
        } else if (input1==2) {
            insuredPackage object = new insuredPackage(input2, input3);
            object.display();
        }
    }
    
}
