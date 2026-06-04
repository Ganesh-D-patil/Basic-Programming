import java.util.*;
public class FibonnaciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your terms : ");

        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.println("this is our series: ");

        System.out.print(first + " " + second + " ");

        for(int i = 2; i < n; i++){
            int next = first + second;

            first = second;
            second = next;

            System.out.print(next + " ");
        }

        sc.close();
    }
}