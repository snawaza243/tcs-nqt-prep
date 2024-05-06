import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove vowels from the string
        String result = removeVowels(input);

        // Print the string without vowels
        System.out.println("String without vowels: " + result);
    }

    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel (uppercase or lowercase)
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                result.append(ch); // If it's not a vowel, add it to the result
            }
        }

        return result.toString();
    }
}
