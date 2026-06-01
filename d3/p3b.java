import java.util.Scanner;
import java.util.ArrayList;

public class p3b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();
        boolean isPrime = true;
        if(a <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(a); i++) {
                if(a % i == 0) {
                    isPrime = false;
                    break;  
                }
            }
        }
        if(isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }

        
    }   
}