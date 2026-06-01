import java.util.Scanner;
import java.util.ArrayList;

public class p3a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int greatest = Integer.MIN_VALUE;
        System.out.println("Enter numbers to find the greatest (enter -1 to stop): ");
        while(true) {
            int num = sc.nextInt();
            if(num == -1) {
                break;  
            }
            numbers.add(num);
            if(num > greatest) {
                greatest = num;
            }
        }
        System.out.println("Greatest number among the entered numbers is: " + greatest);
    }
}