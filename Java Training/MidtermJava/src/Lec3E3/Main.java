package Lec3E3;

public class Main {
    public static void main(String[] args) {
        FitnessTracker object1 = new FitnessTracker();

        System.out.println("Activity: "+object1.getActivity());
        System.out.println("Minutes: "+object1.getMinutes());
        System.out.println("Date: "+object1.getDate());
        System.out.println();

        FitnessTracker object2 = new FitnessTracker("Pushups", 10, "June 28");

        System.out.println("Activity: "+object2.getActivity());
        System.out.println("Minutes: "+object2.getMinutes());
        System.out.println("Date: "+object2.getDate());
        
    }
}
