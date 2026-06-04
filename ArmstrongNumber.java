import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int  sum = 0;
        
        System.out.println(" enter your number : ");
        int n = sc.nextInt();
        int original = n;

        while (n>0) {
            
        int digit = n%10;
       sum = sum+digit*digit*digit;
        n = n/10;
        
        }
        if(sum==original){
            System.out.println(" ArmstrongNumber  ");
        }else{
            System.out.println("this not armstong number ");
        }
       
    }
}
