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
