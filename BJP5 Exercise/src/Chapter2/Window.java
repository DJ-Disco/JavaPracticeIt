/*
BJP5 Exercise 2.19: Window
Language/Type: Java classes class constants for loops nested loops
Author:Marty Stepp (on 2019/09/19)


 * Write a Java program in a class named Window that produces the preceding figure as output. Use nested for loops to print the repeated parts of the figure. Once you get it to work, add one class constant to your program so that the size of the figure can be changed simply by changing that constant's value. The example output shown is at a constant size of 3, but if you change the constant, the figure should grow larger and wider proportionally.

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)
 * 
 */

public class Window {

    public static final int size = 10;
    public static void main(String[] args) {
        
        //window itself
        for (int i=1; i<=3; i++) {

            //window frame
            for (int h=1; h<=3; h++) {
                System.out.print("+");
                if (h<3) {
                    for (int u=1; u<=size; u++) {
                        System.out.print("=");
                    }
                }
            }
            System.out.println();

            //window pane height
            if (i<3){
                for (int o=1; o<=size;o++) {
                    for (int j=1; j<=3; j++) { 
                        System.out.print("|");
                        //window pane width
                        if (j<3) {
                            for (int k=1; k<=size; k++) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
