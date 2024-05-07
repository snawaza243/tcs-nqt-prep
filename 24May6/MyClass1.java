import java.util.Scanner;

public class MyClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the total count of numbers
        System.out.print("Enter the total count of numbers: ");
        int n = sc.nextInt();

        // Prompt the user to enter the numbers
        System.out.println("Enter the numbers:");
        int[] numbers = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            numbers[i] = sc.nextInt();
        }

        // Call the Find_MissingNumber function and print the result
        int missingNumber = Find_Missing_Number(numbers, n);
        System.out.println("Missing number is: " + missingNumber);
    }

    public static int Find_Missing_Number(int[] numbers, int n) {
        // Calculate the expected sum using the summation formula (n * (n + 1) / 2)
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of entered numbers
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }

        // Calculate the missing number
        int missingNumber = expectedSum - actualSum;

        return missingNumber;
    }
}
