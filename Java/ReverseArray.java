import java.util.*;

// class Test
class ReverseArray {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " array element with space: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArray(arr);

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];

            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print("\nReversed array: ");
        printArray(arr);

    }

}