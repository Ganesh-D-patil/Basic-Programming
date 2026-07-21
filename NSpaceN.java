import java.util.*;

public class NSpaceN {

    public void drawNSpaceN(int n) {

        for (int i = 1; i <= n; i++) {

            // Left numbers
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            // Spaces
            for (int j = 1; j <= 2 * (n - i) + 1; j++)
                System.out.print(" ");

            // Right numbers
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        new NSpaceN().drawNSpaceN(n);

        sc.close();
    }
}