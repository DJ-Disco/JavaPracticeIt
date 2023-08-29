package Exercise4;
//exponent
import javax.swing.JOptionPane;

public class Exercise4 {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));

        System.out.println("Square = "+square(num));
        System.out.println("Cube = "+cube(num));
    }

    public static int square(int num){
        return num*num;
    }
    public static int cube(int num){
        return square(num)*num;
    }
    
}
