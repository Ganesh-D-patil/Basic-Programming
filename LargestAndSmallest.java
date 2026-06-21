import java.util.*;

public class LargestAndSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {

            int number = sc.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

        sc.close();
    }
}