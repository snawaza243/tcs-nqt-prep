// Rotate array by kth element
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        rotateArray(arr, k);

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        // To handle the case where k > n
        k = k % n;

        reverse(arr, 0, n - k - 1); // Reverse the first n - k elements
        reverse(arr, n - k, n - 1); // Reverse the last k elements
        reverse(arr, 0, n - 1); // Reverse the entire array
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}