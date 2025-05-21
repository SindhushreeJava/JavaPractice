package Day1;


public class LibraryManagement {
    public static void main(String[] args) {
        //Book details
        String TittleOfBook = "Here There and Everywhere";
        String AuthorName = "Sudha Murty";
        int yearOfPublication = 1985 ;
        double PriceOfBook =10.99;
        boolean IsBookavailble = true;
        //Member Detail
        String MemberName = "Krishna";
        int MemberID= 234;
        char TypeOfMembership = 'A'; //adult
        //Barrowing status
        int dayBookBorrowed = 5;
        double fineperExtraDay=5.5;
        //calculate total fine(First 3 days are free)
        int Extraday = dayBookBorrowed -3;
        double TotalFine= Extraday * fineperExtraDay;

    System.out.println("*******Book details ************");
    System.out.println("TittleOfBook:"  + TittleOfBook);
    System.out.println("Author:" +  AuthorName );
    System.out.println("year of Publication :"  + yearOfPublication);
    System.out.println("Price Of Book:"  + PriceOfBook);
    System.out.println("Book availble:"  + IsBookavailble);

System.out.println("=======Member Detail=======");
System.out.println("Member Name:"  +  MemberName);
System.out.println("Member ID:"  + MemberID);
System.out.println("Type Of Membership:"  +  TypeOfMembership);

System.out.println("############ Barrowing status ############");
System.out.println("day Book Borrowed:"  +  dayBookBorrowed);
System.out.println("fine per ExtraDay:"  +  fineperExtraDay);
System.out.println("Extraday :" + Extraday );
System.out.println("Total Fine:"  +  TotalFine) ;




    }
}
