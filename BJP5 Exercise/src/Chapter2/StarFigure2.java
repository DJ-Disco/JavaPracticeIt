/*
 * 
 * BJP5 Exercise 2.21: StarFigure2
Language/Type: Java class constants escape sequences for loops nested loops
Author:Kimberly Todd (on 2019/09/19)

Modify your StarFigure code from the previous problem to use a constant for the size. The outputs below use a constant size of 3 (left) and 6 (right):

size 3	
////////\\\\\\\\
////********\\\\
****************

size 6
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************
(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)
 */


public class StarFigure2 {
    public static final int height = 4;
    public static void main(String[] args) {
        int width = (height-1)*4; 
        for (int i=0; i<height; i++) {
            //left side
            for (int j=width; j>(width/(height-1))*i; j--) {
                System.out.print("/");
            }
            for (int k=1; k<=(width/(height-1))*i; k++) {
                System.out.print("*");
            }

            //right side
            for (int k=1; k<=(width/(height-1))*i; k++) {
                System.out.print("*");
            }
            for (int j=width; j>(width/(height-1))*i; j--) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
    
}
