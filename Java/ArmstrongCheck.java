import java.util.Scanner;

/*

153:
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
370:
3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370
371:
3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
407:
4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407

 */
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isArmstrong = checkArmstrong(number);

        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean checkArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
