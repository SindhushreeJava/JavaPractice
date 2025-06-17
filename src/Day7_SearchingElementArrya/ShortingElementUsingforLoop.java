package Day7_SearchingElementArrya;

import java.util.Arrays;
import java.util.Collections;

public class ShortingElementUsingforLoop {
    public static void main(String[] args) {
        int a[]={50,20,40,100};
        System.out.println("Originsl Array: ");
       System.out.println(Arrays.toString(a));
       int temp = 0;
        for (int i =0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if (a[j] < a[i]){
                    temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }
        }
        System.out.println("Sorted arry: ");
        System.out.println(Arrays.toString(a));


    }

}
