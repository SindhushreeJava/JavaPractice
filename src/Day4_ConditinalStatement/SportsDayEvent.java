package Day4_ConditinalStatement;

public class SportsDayEvent {
    public static void main(String[] args) {

        double time1=25; // Athlete1 time in seconds
        double time2 = 25; // Athletete2 time in seconds
        // Comparing the times using if-else
        if(time1 < time2){
            System.out.println("Athlete1 completed the race faster ");
        } else if (time2 < time1) {
            System.out.println("Athlete2 completed the race faster");
        }
        else {
            System.out.println("it is tie! completed the race in the same time");
        }


    }
}
