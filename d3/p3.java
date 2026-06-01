import java.util.Scanner;
import java.util.ArrayList;

public class p3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        ArrayList<Float> numbers = new ArrayList<>();
        System.out.println("Enter numbers to calculate the average (enter -1 to stop): ");
        while(true) {
            // System.out.print("Enter a number (or -1 to stop): ");
            float num = sc.nextFloat();
            if(num == -1) {
                break;
            }
            numbers.add(num);
        }
        float sum = 0;
        for(float n : numbers){
            sum += n;
        }
        float average = sum / numbers.size();
        System.out.println("Average of the entered numbers is: " + average);




        System.out.print("completed semester ( yes / no ): ");
        String completed = sc.next();
        if(completed.equalsIgnoreCase("yes")) {
            double grade;
            System.out.print("Enter your grade: ");
            grade = sc.nextDouble();
            double letter_grade = 3.5;
            if(grade >= letter_grade) {
                System.out.println("You got a medel!");
            }
            else {
                System.out.println("No Medel");
            }
        }
        else {
            System.out.println("You need to complete the semester to be eligible for a medel.");
        }








        float sales, attendence;
        System.out.print("Enter your sales(percentage of target sales): ");
        sales = sc.nextFloat();
        System.out.print("Enter your attendance(percentage): ");
        attendence = sc.nextFloat();
        if(sales >= 95){
            if(attendence == 100){
                System.out.println("You get 60% bonus!");
            }
            else if(attendence >= 90){
                System.out.println("You get 40% bonus!");
            }
        }
        else if(sales == 90){
            if(attendence == 100){
                System.out.println("You get 40% bonus!");
            }
            else if(attendence >= 90){
                System.out.println("You get 20% bonus!");
            }
        }
        else {
            System.out.println("No bonus for you.");
        }
    }
}