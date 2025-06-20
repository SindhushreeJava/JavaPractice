package Day8_StringMethods;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String amount="$12,20,55";
        System.out.println(amount.replace("$","").replace(",",""));
        //ex2
        String s="abc,123@xyz";
        String a[]=s.split(",");
        System.out.println(Arrays.toString(a));
       String b[]= a[1].split("@");
       System.out.println(Arrays.toString(b));
       System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(b[1]);
        //ex=3
        String s1="abc 123 zyz";
        String arr[] = s1.split(" ");
        System.out.println(Arrays.toString(arr));
        //* % &()-we can't use as delemeters

        //ex4
        String name="John kenedy";
        //System.out.println(name.contains("john"));
        System.out.println(name.replace('J','j').contains("john"));
        System.out.println(name.toLowerCase().contains("johan"));

    }
}
