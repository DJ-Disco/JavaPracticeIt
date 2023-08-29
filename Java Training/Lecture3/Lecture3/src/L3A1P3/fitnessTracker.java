package L3A1P3;

public class fitnessTracker {
    private String activity;
    private int minutes;
    private String date;

    public String getActivity(){
        return activity;
    }
    public int getMinutes() {
        return minutes;
    }
    public String getDate() {
        return date;
    }

    fitnessTracker() {
        activity = "running";
        minutes = 0;
        date = "January 1";
    }

    fitnessTracker(String activity, int minutes, String date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }
}
