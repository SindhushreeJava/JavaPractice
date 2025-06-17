package Day7_SearchingElementArrya;

import java.util.Arrays;

public class SortingElement {
    public static void main(String[] args) {
        int a[]={20,450,60,70};
        System.out.println("Brfore sorting");
        //to print the array value
        System.out.println(Arrays.toString(a));//[20,450,60,70]
        Arrays.sort(a);//sorting in array
        System.out.println("After sorting");
        System.out.println(Arrays.toString(a));//[20, 60, 70, 450]
    }
}
