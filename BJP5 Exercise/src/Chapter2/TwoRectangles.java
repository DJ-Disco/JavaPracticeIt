/*
 * BJP5 Exercise 2.24: TwoRectangles
Language/Type: Java class constants for loops
Author:Marty Stepp (on 2019/09/19)

Write a program called TwoRectangles that uses two integer class constants called WIDTH and HEIGHT to draw two rectangles of stars of the given dimensions. The first rectangle should be flush left, and the second should be indented horizontally by the given width. For example, if the WIDTH and HEIGHT are 7 and 4 respectively, the program should draw the following figure:

*******
*******
*******
*******
       *******
       *******
       *******
       *******
NOTE: When submitting your solution below, set your WIDTH to 7 and HEIGHT to 4.
 */

public class TwoRectangles {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 2;
    public static void main(String[] args) {
        
        //top
        for (int j=1;j<=HEIGHT;j++) {
            for (int k=1;k<=WIDTH; k++) {
                System.out.print("*");
            }
            for (int u=1;u<=WIDTH; u++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
        //bottom
        for (int j=1;j<=HEIGHT;j++) {
            for (int k=1;k<=WIDTH; k++) {
                System.out.print(" ");
            }
            for (int u=1;u<=WIDTH; u++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
