package Day7_SearchingElementArrya;

import java.util.Arrays;

public class SortinString {
    public static void main(String[] args) {
        //char a[]={'D','C','B','A'};
        String a[]={"Scott","Marry","Johan","David" };
        System.out.println("before sorting" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After shorting" + Arrays.toString(a));

    }
}
