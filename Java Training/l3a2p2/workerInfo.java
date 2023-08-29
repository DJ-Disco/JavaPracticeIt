package l3a2p2;

/*
Write what is asked under the comments
*/

public class workerInfo {
    // define three data fields 
    // "name" (String), "idNumber" (int), and "salary" (double)
    private String name;
    private int idNumber;
    private double salary; 
    
    
    // create a constructor that has three parameters for "name", "idNumber",
    // and "salary
    
    workerInfo(String name, int idNumber, double salary) {
      // body of constructor
      // assign the values of the three parameters to the data fields you
      // declared earlier
      this.name = name;
      this.idNumber = idNumber;
      this.salary = salary;
    }
    
    // create a method named "displayWorkerInfo" which accepts and returns nothing

    public void displayWorkerInfo() {
      // body of displayWorkerInfo
      // print the values of the three data fields you declared above, one
      // variable for each line of output
      System.out.println("Name: "+name);
      System.out.println("ID Number: "+idNumber);
      System.out.println("Salary: "+salary);
    }
}
