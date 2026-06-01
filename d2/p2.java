import java.util.Scanner;
import java.util.ArrayList;


public class p2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int year;
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }



        int sum_even = 0, sum_odd = 0;
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                evenNumbers.add(i);
                sum_even += i;
            } else {
                oddNumbers.add(i);
                sum_odd += i;
            }
        }
        System.out.println("Even numbers from 1 to 20: " + evenNumbers);
        System.out.println("Odd numbers from 1 to 20: " + oddNumbers);
        System.out.println("Sum of even numbers from 1 to 20 is: " + sum_even);
        System.out.println("Sum of odd numbers from 1 to 20 is: " + sum_odd);


        

    }
}