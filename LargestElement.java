import java.util.*;
public class LargestElement {
   public static int largestElement(int arr[]){
        int n = arr.length ;
        int largest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 9, 6, 8, 7};
        System.out.println("Largest element in the array is: " + largestElement(arr));
    }
        
}
