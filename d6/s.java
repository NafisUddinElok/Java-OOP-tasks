import java.util.Scanner;

public class s{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.nextLine();
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();


        // if palindrome
        String original = s;
        String reversed = "";
        for(int i = original.length() - 1; i >= 0; i--){
            reversed += original.charAt(i);
        }
        if(original.equals(reversed)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }


        // counting character frequency
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i < 256; i++){
            if(freq[i] > 0){
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
}