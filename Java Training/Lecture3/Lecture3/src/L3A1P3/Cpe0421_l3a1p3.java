package L3A1P3;

public class Cpe0421_l3a1p3 {
    public static void main(String[] args) {
        fitnessTracker object1 = new fitnessTracker();
        fitnessTracker object2 = new fitnessTracker("walking", 30, "March 28");

        System.out.println("fit1 Data:");
        getData(object1);

        System.out.println("fit2 Data:");
        getData(object2);
        
    }
    public static void getData(fitnessTracker object) {
        System.out.println("Activity Type: "+object.getActivity());
        System.out.println("Minutes Done: "+object.getMinutes());
        System.out.println("Date: "+object.getDate());
        System.out.println();
    }
}
