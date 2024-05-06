import java.util.Scanner;

public class MaxSubProd {

    public static void maxSubArrayProduct(int arr[]) {
        int n = arr.length;
        int maxProduct = 1;
        int currentProduct = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currentProduct = 1;
                for (int k = i; k <= j; k++) {
                    currentProduct *= arr[k];
                }
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }
        System.out.println("Maximum product = " + maxProduct);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSubArrayProduct(arr);
    }
}
