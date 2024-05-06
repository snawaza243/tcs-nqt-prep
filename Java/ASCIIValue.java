import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Calculate the ASCII value of the character
        int asciiValue = (int) ch;

        // Print the ASCII value
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
