import java.util.Scanner;

public class MergeSortBookPrices {

    // Merge two sorted halves
    static void merge(double[] prices, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Compare and merge
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Merge Sort
    static void mergeSort(double[] prices, int left, int right) {

        if (left < right) {

            int middle = left + (right - left) / 2;

            // Sort left half
            mergeSort(prices, left, middle);

            // Sort right half
            mergeSort(prices, middle + 1, right);

            // Merge sorted halves
            merge(prices, left, middle, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        // Take book prices
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of book " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        // Apply Merge Sort
        mergeSort(prices, 0, n - 1);

        // Display sorted prices
        System.out.println("\nBook prices in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }

        sc.close();
    }
}