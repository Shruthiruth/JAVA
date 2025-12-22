import java.util.Scanner;

public class test14 {

    // Function to check if string is a palindrome
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();

        // Check if it is a palindrome
        if (!isPalindrome(s)) {
            System.out.println("The string is not a palindrome.");
            return;
        }

        // Edge case: single character cannot be broken
        if (s.length() == 1) {
            System.out.println("");
            return;
        }

        // Convert string to char array to modify
        char[] arr = s.toCharArray();

        // Traverse only left half
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';  // replace first non-'a' with 'a'
                System.out.println(new String(arr));
                return;
            }
        }

        // If all left-half chars are 'a', change last char to 'b'
        arr[arr.length - 1] = 'b';
        System.out.println(new String(arr));
    }
}
