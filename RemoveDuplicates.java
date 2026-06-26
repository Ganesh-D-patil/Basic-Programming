import java.util.*;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;

        int i = 0;

        for (int j = 1; j < n; j++) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }

        }

        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        int length = removeDuplicates(arr);

        System.out.println("Length after removing duplicates: " + length);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}