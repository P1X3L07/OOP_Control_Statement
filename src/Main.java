//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int lines = 5; // Number of rows in the triangle

        System.out.println("Pattern #1");
        // Outer loop for the number of rows
        for (int i = 1; i <= lines; i++) {
            // Inner loop for printing asterisks in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}