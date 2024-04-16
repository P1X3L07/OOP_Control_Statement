import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int lines;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines to print a pattern: ");
        lines = input.nextInt();

        for (int i = 0; i < lines; i++) {
            // Inner loop for printing asterisks in each row
            for (int j = 1; j <= lines; j++) {
                System.out.print(i + j);
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}