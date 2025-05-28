package Day4_ConditinalStatement;

public class LargestNumber {
    public static void main(String[] args) {
        int a=20,b=50,c=50;
        if ((a>b) && (a>c)){
            System.out.println("a is the largest number");

        } else if ((b>a)&&(b>c)) {
            System.out.println("b is the largest number");

        }
        else {
            System.out.println("C is the largest number");
        }

    }
}
