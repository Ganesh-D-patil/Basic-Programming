import java.util.*;
public class MissingValues {
    public static void missingValues(int[] arr, int n) {
        int hash[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                System.out.print( " your missing number is : " +i);

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        int n = 6;
        missingValues(arr, n);
    }
}
