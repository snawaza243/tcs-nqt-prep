import java.util.Scanner;

public class PrimeNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter lower and higher boundary numbers
        int lowerBound, higherBound;
        do {
            System.out.print("Enter the lower boundary number (between 0 and 100): ");
            lowerBound = sc.nextInt();
        } while (lowerBound < 0 || lowerBound > 100);

        do {
            System.out.print("Enter the higher boundary number (between " + lowerBound + " and 100): ");
            higherBound = sc.nextInt();
        } while (higherBound < lowerBound || higherBound > 100);

        // List all prime numbers between the lower and higher boundary numbers
        System.out.println("Prime numbers between " + lowerBound + " and " + higherBound + ":");
        for (int num = lowerBound; num <= higherBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
