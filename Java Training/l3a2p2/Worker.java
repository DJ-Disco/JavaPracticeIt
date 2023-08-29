package l3a2p2;

public class Worker {
    // declare "worker1", a data field of type workerInfo
   private workerInfo worker1;
    
    // create a constructor which accepts three parameters, "name" (String),
    // "idNumber" (int), and "salary" (double)

    Worker(String name, int idNumber, double salary) { 
        worker1 = new workerInfo(name,idNumber,salary); 
    }
    
    // create another constructor that accepts no parameters
    
    Worker() {
        this("Juan dela Cruz",999999,0);
    }
    
    // create a method named "displayWorker" that accepts and returns nothing

    public void displayWorker() {
        worker1.displayWorkerInfo();
    }
    
}
