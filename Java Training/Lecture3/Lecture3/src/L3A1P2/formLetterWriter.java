package L3A1P2;

public class formLetterWriter {

    public void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. "+lastName+". Thank you for your recent order.");
    }

    public void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear "+firstName+" "+lastName+". Thank you for your recent order.");
    }
}
