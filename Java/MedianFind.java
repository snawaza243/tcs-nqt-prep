import java.util.*;

public class MedianFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            int mid1 = arr.length / 2;
            System.out.print("Median: " + arr[mid1]);
        } else {
            int idx = arr.length / 2;

            double mid2 = (double) (arr[idx] + arr[idx - 1]) / 2;

            System.out.print("Median: " + mid2);
        }
    }
}
