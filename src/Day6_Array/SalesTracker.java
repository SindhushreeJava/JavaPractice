package Day6_Array;

public class SalesTracker {
    public static void main(String[] args) {
        //create the value with sales value for 7 day
        double sales[]={120.5,180,300,400,500,60.4,50.5};
        //intiate the variable t find the hieghest sales and it corresponding day
        double highestSales = sales[0];// start with 1st day
        int highestday =0;// highest sales day
        //find highest
        for (int i=0; i<sales.length; i++){
            if(sales[i] > highestSales){
                highestday =i;
            }
        }
        System.out.println("sales data for the week:...");
        for(int i=0; i< sales.length;i++){
            System.out.println("Day" + (i+1) +"$" +sales[i]);
        }
        System.out.println("The highest sales were on Day " + (highestday +1)+
                " with sales of $" + sales[highestday]);

    }
}
