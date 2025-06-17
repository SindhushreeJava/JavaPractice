package Day7_SearchingElementArrya;

public class MissingNumberInArray {
    public static void main(String[] args) {
        //Array should not have duplicate
        //Array no need to be sorted order
        //value should be in range
        int a[]={1,3,4,5};
        //1+3+4+5=13
        //1+2+3+4+5=15
        int sum1=0;
        for (int i=0;i<a.length;i++){
            sum1=sum1+a[i];

        }
        System.out.println("Sum of element in array:"  + sum1);
        int sum2=0;
        for (int i=1;i<= 5;i++){
            sum2=sum2+i;

        }
        System.out.println("Sum of range element in array:"  + sum2);
        System.out.println("missing number is :" +  (sum2-sum1));

    }
}
