package Day7_SearchingElementArrya;

public class SearchingElement {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int search_element=30;
        boolean status = false; // false -not found ture - found
        for(int i=0;i<=a.length-1;i++){
            if (a[i] == search_element){
                System.out.println("Element fund");
                status = true;
                break;
            }

        }
        if(status == false){
            System.out.println("Element is not found");

    }
        }
}
