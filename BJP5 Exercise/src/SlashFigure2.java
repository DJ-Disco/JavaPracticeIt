
 /*
 BJP5 Exercise 2.17: SlashFigure2
 
 Modify the SlashFigure program from the previous exercise to produce a new program SlashFigure2 that uses a global constant for the figure's height. The previous output used a constant height of 6. Here is the outputs for a constant height of 4 and 7 respectively: (If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!)

size 4	
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

size 7
!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!////////
\\\\\\\\\\!!!!!!//////////
\\\\\\\\\\\\!!////////////
(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.) */
 


public class SlashFigure2 {
    public static final int height = 4;
    public static void main(String[] args) throws Exception {

        for (int i=0; i<height*2; i+=2) {
            
            for (int j=1; j<=(i); j++) {
                System.out.print("\\");
            }

            for (int j=1; j<=((height-1)*4+2)-i*2; j++) {
                System.out.print("!");
            }

            for (int j=1; j<=(i); j++) {
                System.out.print("/");
            }
            System.out.println();
        }
       
        
    }
}
