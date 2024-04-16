import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        int lines;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines to print a pattern: ");
        lines = input.nextInt();

        // Outer loop for the number of rows
        for (int i = lines; i >= 1; i--) {
            // Inner loop for printing asterisks in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
