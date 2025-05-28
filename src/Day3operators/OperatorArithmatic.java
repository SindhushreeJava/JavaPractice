package Day3operators;

public class OperatorArithmatic {
    public static void main(String[] args) {
        //Arithmatic Operators + - * / %
        int a=20,b=10;
        System.out.println("Sum of a and b is: " +(a+b));
        System.out.println("Diff of a and b is: " +(a-b));
        System.out.println("Multiplication of a and b is: " +(a*b));
        System.out.println("division of a and b is: " +(a/b));
        System.out.println("modulo of a and b is: " +(a%b));
        int result=(a+b);
        System.out.println("Sum of a and b is: " + result);
//relational/comparision operaters > >= < < = != ==
        //returns true/false(Userd b/w two variables)
        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a>=b);//true
        System.out.println(a<=b); //false
        System.out.println(a>=b); //true
        b=20;
        System.out.println(a<=b); //true
        System.out.println(a>=b); //true

        System.out.println(a!=b); //false
        System.out.println(a==b); //true

        boolean res = a > b;
        System.out.println(res);
//Logical operaters && || !
        //returns boolean value (used(worked) b/w boolean variable)
        boolean x=true;
        boolean y=false;
        System.out.println(x && y);//false
        System.out.println(x || y);//true
        System.out.println( !y);//true
        System.out.println( !x);//false
        boolean b1=10 > 20;
        System.out.println(b1);//false
        boolean b2 =20 >10;
        System.out.println(b2);//true
        System.out.println(b1 && b2);



    }
    
}
