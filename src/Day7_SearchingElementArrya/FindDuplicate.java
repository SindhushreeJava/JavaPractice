package Day7_SearchingElementArrya;


public class FindDuplicate {
    public static void main(String[] args) {
        int a[]={20,50,60,40,60,30,30,80,56};
        int count=0;
        int num=30;
        for (int value: a){
            if (value==num){
                count++;
            }
        }
        System.out.println(count);
}
}
