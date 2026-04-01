import java.util.Scanner;

public class Result_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;
        double avg;
        int countAbove = 0;
        int countBelow = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Please enter valid marks");
            }

        }

        // Calculating & displaying Total Marks
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }

        System.out.println("\nTotal Marks : " + totalMarks + " / " + 500);

        // Calculating Average
        avg = totalMarks / 5;
        System.out.println("Average : " + avg);

        // calculating grade
        if (avg >= 90) {
            System.out.println("Congrats you scored Grade A\nResult: Pass");
        } else if (avg >= 75 && avg < 90) {
            System.out.println("Bravo You scored Grade B\nResult: Pass");
        } else if (avg >= 60 && avg < 75) {
            System.out.println("scored Grade C\nResult:Pass");
        } else if (avg >= 40 && avg < 60) {
            System.out.println("Scored Grage: D\nResult pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("\n");
        // Bonus Taks: Count subject above 75 & below 40 and display them

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 75) {
                countAbove += 1;
                System.out.println("\nScored above 75");
                System.out.println("Subject " + (i + 1));
            } else if (marks[i] < 40) {
                countBelow += 1;
                System.out.println("\nScored below 40");
                System.out.println("Subject " + (i + 1));
            }

        }
        System.out.println("\n");
        System.out.println(countAbove + " Subjects scored over 75");
        System.out.println(countBelow + " Subjects scored over 40");
    }

}
