import java.util.Scanner;

public class APseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Arithmetic Progression (AP) series:");
        printAPseries(a, d, n);
    }

    public static void printAPseries(int a, int d, int n) {
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term += d;
        }
    }
}
