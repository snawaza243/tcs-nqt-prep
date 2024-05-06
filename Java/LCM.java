import java.util.Scanner;

/*
 To find the least common multiple (LCM) of two numbers, you can use the formula:
LCM(a, b) = (a * b) / GCD(a, b)
Where GCD(a, b) represents the greatest common divisor of two numbers. 
 */
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        // Calculate the LCM
        int lcm = calculateLCM(num1, num2);

        // Print the LCM
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    /**
     * Method to calculate the LCM of two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The LCM of num1 and num2.
     */
    public static int calculateLCM(int num1, int num2) {
        // Calculate the product of the two numbers
        int product = num1 * num2;

        // Calculate the GCD using the Euclidean algorithm
        int gcd = calculateGCD(num1, num2);

        // Calculate the LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
        int lcm = product / gcd;

        return lcm;
    }

    /**
     * Method to calculate the greatest common divisor (GCD) of two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The GCD of num1 and num2.
     */
    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
