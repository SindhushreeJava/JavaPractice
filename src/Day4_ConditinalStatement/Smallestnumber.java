package Day4_ConditinalStatement;

public class Smallestnumber {
    public static void main(String[] args) {
        int a=100,b=8,c=40;
        if((a<b) && (a<c)){
            System.out.println("a is th smallest number");
        } else if ((b<a)&&(b<c)) {
            System.out.println("b is th smallest number");

        }
        else {
            System.out.println("C is the smallest number");
        }
    }
}
