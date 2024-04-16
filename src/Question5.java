import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int lines;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines to print a pattern: ");
        lines = input.nextInt();

        for (int i = 1; i <= lines/2; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        for (int i = (lines/2) - 1; i >= 1; i--) {
            // Print spaces for alignment
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
