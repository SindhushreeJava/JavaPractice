package Day7_SearchingElementArrya;

import java.util.Scanner;

public class TakingMultipleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("your name is:" + name);
        System.out.println("Enter your age:");
        int age=sc.nextInt();

        System.out.println("Enter unknown value:");
        Object value=sc.next();
        System.out.println("Enter unknown value:" + value);

    }
}
