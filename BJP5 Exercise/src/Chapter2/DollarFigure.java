/*
 * 
BJP5 Exercise 2.23: DollarFigure2
Language/Type: Java class constants for loops nested loops
Author:Kimberly Todd (on 2019/09/19)


 Modify your DollarFigure program from the previous exercise to become a new program called DollarFigure2 that uses a global constant for the figure's height. (You may want to make loop tables first.) The previous output used a constant height of 7. The outputs below use a constant size of 3 (left) and 5 (right):

size 3	
$$$******$$$
**$$****$$**
****$**$****

size 5
$$$$$**********$$$$$
**$$$$********$$$$**
****$$$******$$$****
******$$****$$******
********$**$********
(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)
 * 
 */

public class DollarFigure {
    public static final int height = 10;
    public static void main(String[] args) {
        for (int i=0; i<height ;i++) {
            //left side
            //first pattern
            for(int lj=1;lj<=(2*i);lj++) {
                System.out.print("*");
            }
            //second pattern
            for(int lk=1;lk<=height-i;lk++) {
                System.out.print("$");
            }
            //third pattern
            for(int lu=1;lu<=height-i;lu++) {
                System.out.print("*");
            }

            //right side
            //first pattern
            for(int ru=1;ru<=height-i;ru++) {
                System.out.print("*");
            }
            //second pattern
            for(int rk=1;rk<=height-i;rk++) {
                System.out.print("$");
            }
            //third pattern
            for(int rj=1;rj<=(2*i);rj++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}