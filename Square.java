import java.util.*;
public class Square {
    public void drawSquare(int n){
        
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();
        Square square = new Square();
        square.drawSquare(n);
}
    
    } 
    