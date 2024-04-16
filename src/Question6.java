import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int lines;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines to print a pattern: ");
        lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= lines - i; j++) {
                System.out.print("   "); // Adjust spacing for clarity
            }

            // Print numbers for the current row in ascending order
            for (int j = 0; j < i; j++) {
                int num = (int) Math.pow(2, j); // Calculate power of 2
                System.out.print(formatNumber(num));
            }

            // Print numbers for the current row in reverse order (excluding the last number)
            for (int j = i - 2; j >= 0; j--) {
                int num = (int) Math.pow(2, j); // Calculate power of 2
                System.out.print(formatNumber(num));
            }

            // Move to the next line after each row is printed
            System.out.println();
        }

        input.close();
    }

    // Helper method to format numbers with appropriate spacing
    private static String formatNumber(int num) {
        if (num < 10) {
            return " " + num + " "; // Single-digit numbers with extra space padding
        } else {
            return num + " "; // Double-digit numbers with single space padding
        }
    }
}
