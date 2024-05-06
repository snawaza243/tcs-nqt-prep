import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        // Check if the input is non-negative
        if (n < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
        } else {
            // Calculate and print the factorial
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " = " + factorial);
        }
    }

    /**
     * Method to calculate the factorial of a non-negative integer.
     *
     * @param n The non-negative integer.
     * @return The factorial of n.
     */
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
