package Day4_ConditinalOperater;

public class SwitchFindWeekday {
    public static void main(String[] args) {
        String weekname="sunday";
        switch (weekname){
            case "sunday" : System.out.println(1);break;
            case "Monday" : System.out.println(2);break;
            case "Tuesday" : System.out.println(3);break;
            case "Wednesday" : System.out.println(4);break;
            case "Thursday" : System.out.println(5);break;
            case "Friday" : System.out.println(6);break;
            case "Saturday" : System.out.println(7);break;
            case "Invalid week" : System.out.println(0);



        }
    }
}
