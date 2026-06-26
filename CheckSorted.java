import java.util.*;
public class CheckSorted {
    public static boolean issorted(int arr[]){
        int n =arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 8, 6, 7};
        if(issorted(arr)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
