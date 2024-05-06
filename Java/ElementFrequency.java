import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int INT_MAX = Integer.MAX_VALUE;
        int[] frequency = new int[1000];

        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        // for (int i = 0; i < n; i++) {
        //     // Access the current element in the array
        //     int currentElement = arr[i];
            
        //     // Access the frequency count of the current element
        //     int frequencyCount = frequency[currentElement];
            
        //     // Increment the frequency count of the current element
        //     frequencyCount = frequencyCount + 1;
            
        //     // Update the frequency count of the current element in the frequency array
        //     frequency[currentElement] = frequencyCount;
        // }

        

        System.out.println("Element Frequency:");
        for (int i = 0; i < INT_MAX; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " : " + frequency[i]);
            }
        }
    }
}
