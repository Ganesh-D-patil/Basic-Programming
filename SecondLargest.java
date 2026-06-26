import java.util.*;
public class SecondLargest {
    public static int secondLargest(int arr[]){
        int n = arr.length ;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int secondsmallest(int arr[]){
        int n = arr.length ;
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 9, 6, 8, 7};
        System.out.println("Second largest element in the array is: " + secondLargest(arr));
        System.out.println("Second smallest element in the array is: " + secondsmallest(arr));
    }
}