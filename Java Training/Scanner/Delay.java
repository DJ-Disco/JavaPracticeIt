public class Delay {
    public static void main(String[] args) throws Exception {
        
        for (int i=5; i>=1; i--) {
            System.out.println(i);
    
            Thread.sleep(1000);
        }

        System.out.println("Done!");

    }
}
