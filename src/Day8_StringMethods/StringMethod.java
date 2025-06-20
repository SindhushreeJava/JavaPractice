package Day8_StringMethods;

public class StringMethod {
    public static void main(String[] args) {
        //declaration of String variable
        String s ="welcome";
        String s5 ="welcome";
        //string Object
        String s1 = new String("welcome");
        //System.out.println(s1);
        //length() - return length of a string(number of character)
        s1.length();
        //System.out.println(s1.length());
       // System.out.println("welcome".length());
        // concat() - joining string
        String s2= "to java";
        s1.concat(s2);
    //System.out.println(s1.concat(s2));
   // System.out.println(s.concat(s1).concat(s2));
    //trim()- remove the space right and left side
        String s4="    welcome   ";
       // System.out.println(s4);
       // System.out.println("before trim" + s4.length());
        //System.out.println(s4.trim());
       // System.out.println("after trim" + s4.trim().length());
        //charAt() - return the character from string based on index
        //index start from 0
        //System.out.println(s.charAt(3));
        //contains() - check the given string is the part of the string-
        //contains()- retuns true/false (case sensitive)
       boolean p = s.contains("wel");
        //System.out.println(p);
        //System.out.println(s.contains("welme"));
        //equals(), equalIsIgnoreCase()(it will treat upper and lower char - compare strings
        // returns true
        System.out.println("---iI111111111"+(s1==s));
        System.out.println("****22222222>"+(s==s5));
        System.out.println(s.equals(s1));
        System.out.println("Welcome".equalsIgnoreCase(s1));
        //replace()-replace single/multiple(sequance) of characters in string
        s="welcome to selenium java selenium python selenium C#";
        System.out.println(s.replace('e','X'));
        System.out.println(s.replace("selenium","playwrite" ));

        //Substring()-extract the substring from main string
        //starting index-0
        //ending index-1
        System.out.println(s5.substring(0,3));
        System.out.println(s5.substring(4,7));
        s="abcaacc";
        System.out.println(s.replace('a', 'x'));

        //toUpperCase() toLowerCase
        s="welcome";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        //split()-split the string into multiple parts based on delimeter
        // split() returns array
        String r="abcd@gmail.com";
        String a[]= r.split("@");
        System.out.println(a[0]);//abcd
        System.out.println(a[1]);

    }
}
