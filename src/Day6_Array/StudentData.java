package Day6_Array;

public class StudentData {
    public static void main(String[] args) {
        int marks [][]= {
                {85, 78, 92, 74},//// Student 1: Math, Science, English, History
                {88, 89, 80, 90},
                {90, 94, 98, 89}
                  };
        // Display subject
        System.out.println("Student\t"+"Math\t" + "Science\t" + "English\t"+"History\t" +"Total");
        for (int r = 0; r < marks.length; r++) {
            int total = 0;

            System.out.print("S" +(r + 1)   +   "\t");
            for (int c = 0; c < marks[r].length; c++) {
                System.out.print(marks[r][c] + "\t");
                total += marks[r][c]; // Calculate total marks
            }

            // Print total marks for the student
            System.out.println(total);
        }
        }
    }

