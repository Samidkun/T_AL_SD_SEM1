import java.util.Scanner;

public class NIMcalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your NIM: ");
        String nim = scanner.nextLine();
        
        // Extracting the last two digits of the NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        // If n is less than 10, add 10 to it
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("n: " + n + "\n");
        System.out.print("Result: ");
        
        // Displaying the series of numbers
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Skip printing 6 and 10
            }
            if (i % 2 != 0) {
                System.out.print("* "); // Print * for odd numbers
            } else {
                System.out.print(i + " "); // Print the number for even numbers
            }
        }
        System.out.println("BY SAMID NIM");
    }
}
