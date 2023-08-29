import javax.swing.JOptionPane;

public class VowelExtractor {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Input N:"));
        String str = JOptionPane.showInputDialog("Input String:");
        char[] ch = new char[N];
        
        ch = vowelExtractor(str, N, ch);
        
        for (char c : ch) {
            System.out.print(c);
        }
        
    }
    public static char[] vowelExtractor(String str, int N, char[] ch) {
        int n = 0;
        boolean loop = true;
        while (loop) {
            for (int i = 0; i<str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    ch[n] = str.charAt(i);
                    n += 1;
                    if (n==N) {
                        loop = false;
                        break;
                    }
                }
            }
        }
        return ch;
    }
}
