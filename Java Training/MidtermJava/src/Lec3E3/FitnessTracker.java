package Lec3E3;

public class FitnessTracker {
    private String fitnessAct;
    private int minutes;
    private String date;

    public String getActivity(){
        return fitnessAct;
    }
    public int getMinutes(){
        return minutes;
    }
    public String getDate(){
        return date;
    }

    FitnessTracker(){
        fitnessAct = "running";
        minutes = 0;
        date = "January 1";
    }

    FitnessTracker(String fitnessAct, int minutes, String date){
        this.fitnessAct = fitnessAct;
        this.minutes = minutes;
        this.date = date;
    }


}
