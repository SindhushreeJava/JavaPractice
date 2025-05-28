package Day3operators;

public class OperatorIncremental {
    public static void main(String[] args) {
        //++ is called increment operator
        //case 1
        int a=10;
        System.out.println(a);
        a++;   // a+1
        System.out.println(a);
        //case 2 - postincrement operator
        a=20;
        int res = a++;
        System.out.println(res);
//case 3 pre increment
        a=4;
        int res1 = ++a; //
        System.out.println(res1);


    }
}
