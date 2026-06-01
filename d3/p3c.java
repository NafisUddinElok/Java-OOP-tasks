import java.util.Scanner;
import java.util.ArrayList;

public class p3c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);





        int[] arr = {1, 2, 3, 4, 5};
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }




        System.out.println("\nEnter numbers to count even and odd (enter -1 to stop): ");
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int num = sc.nextInt();
            if(num == -1) {
                break;  
            }
            list.add(num);
        }
        int even = 0, odd = 0;
        for(int n : list) {
            if(n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even numbers entered: " + even);
        System.out.println("Number of odd numbers entered: " + odd);    



        //printing fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }


    }
}