public class PatternSeries {
    //square pattern
    public void pattern1(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //right angle triangle pattern
public void pattern2(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //left angle triangle pattern
public void pattern3(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //pyramid pattern
    public void pattern4(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //number pattern
    public void pattern5(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //inverted number pattern
    public void pattern6(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    //diamond pattern
    public void pattern7(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //half diamond pattern

    public void pattern8(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverted half diamond pattern
    public void pattern9(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //hollow square pattern
    public void pattern10(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //hollow right angle triangle pattern
    public void pattern11(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //hollow inverted right angle triangle pattern
    public void pattern12(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //hollow pyramid pattern
    public void pattern13(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    //hollow diamond pattern
public void pattern14(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //pascal triangle pattern
    public void pattern15(int n) {
        for(int i=0; i<n; i++){
            int number = 1;
            for(int j=0; j<=i; j++){
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // Floyd's triangle pattern
    public void pattern16(int n) {
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    // Inverted Floyd's triangle pattern
    public void pattern17(int n) {
        int number = n * (n + 1) / 2;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number--;
            }
            System.out.println();
        }
    }

    // hollow diamond number pattern
    public void pattern18(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //n-space-n pattern
    public void pattern19(int n) {
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

    //quadrant pattern
    public void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PatternSeries ps = new PatternSeries();
        ps.pattern20(10); 
    }
}