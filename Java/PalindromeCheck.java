import java.util.Scanner;

// Check number is palindrome or not
/*
121: Read from left to right or right to left, it remains the same.
1331: Same as above, it reads the same in both directions.
45654: It's also a palindromic number.
123454321: It's a larger palindromic number.
12321: Another example of a palindromic number.
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPalindrome = checkPalindrome(number);

        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(int number) {
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}
