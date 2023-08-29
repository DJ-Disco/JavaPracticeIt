package l3a2p2;

public class cpe042l_l3a2p2 {

    public static void main(String[] args) {
        // instantiate "juan" as a worker type object, pass nothing to its constructor
        Worker juan = new Worker();
        
        // instantiate "pedro" as a worker type object, pass the values "Pedro Simon",
        // 197354, and 12500.00 to its constructor
        Worker pedro = new Worker("Pedro Simon", 197354, 12500.00);
        
        
        System.out.println("Juan's info:");
        // call the displayWorker methods of Juan
        juan.displayWorker();
        
        
        System.out.println("\nPedro's info:");
        // call the displayWorker methods of Pedro
        pedro.displayWorker();
        
    }
    
}
