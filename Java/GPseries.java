import java.util.Scanner;

public class GPseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the common ratio (r): ");
        double r = sc.nextDouble();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Geometric Progression (GP) series:");
        printGPseries(a, r, n);
    }

    /**
     * Method to print the GP series.
     *
     * @param a The first term of the GP series.
     * @param r The common ratio of the GP series.
     * @param n The number of terms in the GP series.
     * 
     *          Enter the first term (a): 2
     *          Enter the common ratio (r): 3
     *          Enter the number of terms (n): 5
     * 
     *          Geometric Progression (GP) series:
     *          2.0 6.0 18.0 54.0 162.0
     */

    public static void printGPseries(double a, double r, int n) {
        double term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term *= r;
        }
    }
}
