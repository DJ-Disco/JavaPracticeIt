package Practice;
//shuffle array
import javax.swing.JOptionPane;

public class Practice {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));
    
        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            int temp = Integer.parseInt(JOptionPane.showInputDialog("Enter element "+(i+1)+":"));
            arr[i] = temp;
        }

        for (int i=0;i<size;i++){
            for (int k=0;k<size;k++) {
                System.out.print(arr[k]+" ");
            }

            int temp = arr[0];

            for (int j=0;j<size-1;j++) {
                arr[j] = arr[j+1];
            }

            arr[size-1] = temp;
            System.out.println();
        }
    }

}
