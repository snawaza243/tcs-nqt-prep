import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calculate the sum of numbers in the string
        int sum = calculateSumOfNumbers(input);

        // Print the sum
        System.out.println("Sum of numbers in the string: " + sum);
    }

    public static int calculateSumOfNumbers(String str) {
        int sum = 0;
        StringBuilder numStr = new StringBuilder();

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is a digit, append it to the numStr
            if (Character.isDigit(ch)) {
                numStr.append(ch);
            } else {
                // If numStr is not empty, convert it to an integer and add it to the sum
                if (numStr.length() > 0) {
                    sum += Integer.parseInt(numStr.toString());
                    numStr.setLength(0); // Clear the numStr for the next number
                }
            }
        }

        // Add the last number (if any) to the sum
        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());
        }

        return sum;
    }
}
