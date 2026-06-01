import java.util.Scanner;

public class p8c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 5;

        double[][] grades = new double[students][subjects];
        double[] credits = new double[subjects];

        System.out.println("Enter credits for 5 subjects:");
        for (int j = 0; j < subjects; j++) {
            System.out.print("Credit for subject " + (j + 1) + ": ");
            credits[j] = sc.nextDouble();
        }

        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter grades for Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                grades[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < students; i++) {

            double total = 0;
            double totalCredits = 0;

            for (int j = 0; j < subjects; j++) {
                total += grades[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = total / totalCredits;

            System.out.println("CGPA of Student " + (i + 1) + " = " + cgpa);
        }

        sc.close();
    }
}