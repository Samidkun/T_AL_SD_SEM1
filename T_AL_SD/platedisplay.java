import java.util.Scanner;

public class platedisplay {
    public static void main(String[] args) {
        // Define arrays
        char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] CITY = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Tegal"}
        };
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the license plate code: ");
        char inputCode = scanner.next().charAt(0);
        
        // Find the index of the input code in the CODE array
        int index = -1;
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == inputCode) {
                index = i;
                break;
            }
        }
        
        // Display result
        if (index != -1) {
            System.out.println("City corresponding to code " + inputCode + ": " + CITY[index][0]);
        } else {
            System.out.println("License plate code not found.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
