package Day5Looping;

public class LaundryMachine {
    public static void main(String[] args) {
        int washingduration = 5;
        for (int minute= 1; minute <= 5; minute++) {
            if (minute < 5) {
                System.out.println("Washing ..minute: "+ minute);
            } else {
                System.out.println("Washing completed");
            }
        }
    }
}

