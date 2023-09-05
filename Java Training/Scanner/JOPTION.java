import javax.swing.JOptionPane;

public class JOPTION {
    public static void main(String[] args) throws Exception {
        int answer = JOptionPane.showConfirmDialog(null,"Do you want to enter your name?", "JAMALPROGRAM", 0);

        System.out.println(answer);

        if (answer == 0) {
            String name = JOptionPane.showInputDialog(null, "Enter your name?", "Enter Name Here", JOptionPane.QUESTION_MESSAGE);//you can also use INFORMATION MESSAGE
            JOptionPane.showMessageDialog(null, "Thank you for participating "+name+"!", "JAMALPROGRAM", 1);

        } else {
            JOptionPane.showMessageDialog(null, "Thank you for participating whatever your name is!", "JAMALPROGRAM", 1);

        }

    }
}
