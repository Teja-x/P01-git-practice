import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        int side = sc.nextInt();
        System.out.println("Area of the Square is " + (side * side));
    }
}