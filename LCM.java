import java.util.*;

public class LCM {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        while (b != 0) {

            int temp = b;

            b = a % b;

            a = temp;
        }

        int gcd = a;

        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM is : " + lcm);

        sc.close();
    }
}