package Day3operators;

public class TernaryOperator {
    public static void main(String[] args) {
        //var=exp? result1 : result2;
        int a=200,b=300;
        int x=(a<b) ? a:b;
        System.out.println(x);
        int x1=(1==1)?300:400;
        System.out.println(x1);
        int x2=(1==2)?300:400;
        System.out.println(x2);

        int person_age =15;
        String res = (person_age >= 18) ? "Eligible":"not Eligible";
        System.out.println(res);


    }
}
