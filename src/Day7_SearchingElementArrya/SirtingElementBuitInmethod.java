package Day7_SearchingElementArrya;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SirtingElementBuitInmethod {
    public static void main(String[] args) {
        int a[]={40,60,88,40,78,89};
        System.out.println("Array element before sorting:" + Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array element After sorting:" + Arrays.toString(a));
        System.out.println("Array element before sorting:" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array element After sorting:" + Arrays.toString(a));


        //sorting array using rever order(collection not suport primitive type
        Integer b[]={40,60,88,40,78,89};
        System.out.println("Array element before sorting:" + Arrays.toString(b));
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("Array element After sorting:" + Arrays.toString(b));

    }
}
