import java.util.*;
public class PrintDivisor {
    public static void printdivisor(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        return;
    }
    public static void main(String ares[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to print its divisors: ");
        int n = sc.nextInt();
        printdivisor(n);
    }
}
