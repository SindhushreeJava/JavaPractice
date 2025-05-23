package Day3operators;

public class BillingSystem {
    public static void main(String[] args) {
        //Take sample data for item price and quantity
        double price_item=359.0;// 250 per item
        int quantity =6;


        // To calculate the total price(Subtotal) of items (quantity × price)
        double subtotal =price_item * quantity;
        System.out.println("Subtotal (before discount):"  + subtotal);


       //Apply a 10% discount if the subtotal exceeds ₹1000
        double discount =(subtotal > 1000)? (subtotal *0.10) : 0;
        System.out.println("Discount Applied : " + discount);


        // find the total after discount
        double total = subtotal - discount;
        System.out.println("Total (After Discount):" + total);


        //check if customer is eligible for a free gift(f they spend more than ₹1000 and buy more than 5 items)
        boolean freegift=(total>1000) && (quantity >5);
        System.out.println("Eligible for free gift: " + freegift);


        //customer decides to add more item
        quantity++;//unary operator
        System.out.println("updated quantity (After adding one more item):" + quantity);


        // recalculate subtotal and total(Recalculate after extra Item)
        subtotal = price_item * quantity;
        discount = (subtotal >1000)? (subtotal *.10):0;
        total = subtotal-discount;


        //updated value
        System.out.println("***********After Adding Extra Item************");
        System.out.println("New Subtotal:" + subtotal);
        System.out.println("New Discount:" + discount);
        System.out.println("New total:" + total);


    }
}
