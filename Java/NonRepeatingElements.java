import java.util.*;

public class NonRepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> result = findNonRepeatingElements(arr);

        System.out.println("Non-repeating elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findNonRepeatingElements(int[] arr) {
        int[] frequency = new int[1001]; // Assuming maximum element value is 1000

        // Count the frequency of each element
        for (int num : arr) {
            frequency[num]++;
        }

        // Collect non-repeating elements
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (frequency[num] == 1) {
                result.add(num);
            }
        }

        return result;
    }
}
