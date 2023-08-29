public class Student {
    /* l3a2p1
    Use the this reference for variables and constructors to optimize the
    code below
    */    
    
    private String name;
    private int idNumber;
    private double grade;
    
    public Student(String name, int idNumber, double grade){
        this.name = name;
        this.idNumber = idNumber;
        this.grade = grade;
    }
    
    public Student(String name){
        this(name,9999999,0);
    }
    
    public Student(int idNumber){
        this("Juan dela Cruz",idNumber,0);
    }
    
    public Student(double grade){
        this("Juan dela Cruz",9999999,grade);
    }
    
    public Student(String name, int idNumber){
        this(name,idNumber,0);
    }
    
    public Student(String name, double grade){
        this(name,9999999,grade);
    }
    
    public Student(int idNumber, double grade){
        this("Juan dela Cruz",idNumber,grade);
    }
}
