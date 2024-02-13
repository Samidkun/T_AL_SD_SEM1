import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input assignment score
        System.out.print("Enter assignment score (0-100): ");
        double assignmentScore = scanner.nextDouble();
        if (assignmentScore < 0 || assignmentScore > 100) {
            System.out.println("Invalid value");
            return;
        }
        
        // Input quiz score
        System.out.print("Enter quiz score (0-100): ");
        double quizScore = scanner.nextDouble();
        if (quizScore < 0 || quizScore > 100) {
            System.out.println("Invalid value");
            return;
        }
        
        // Input UTS score
        System.out.print("Enter UTS score (0-100): ");
        double utsScore = scanner.nextDouble();
        if (utsScore < 0 || utsScore > 100) {
            System.out.println("Invalid value");
            return;
        }
        
        // Input UAS score
        System.out.print("Enter UAS score (0-100): ");
        double uasScore = scanner.nextDouble();
        if (uasScore < 0 || uasScore > 100) {
            System.out.println("Invalid value");
            return;
        }
        
        // Calculate final grade
        double finalGrade = (assignmentScore * 0.2) + (quizScore * 0.2) + (utsScore * 0.3) + (uasScore * 0.4);
        
        // Determine letter grade
        char letterGrade;
        if (finalGrade >= 85) {
            letterGrade = 'A';
        } else if (finalGrade >= 80) {
            letterGrade = 'B';
        } else if (finalGrade >= 75) {
            letterGrade = 'C';
        } else if (finalGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'E';
        }
        
        // Determine PASS/NOT PASS
        String passStatus = (letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C') ? "PASS" : "NOT PASS";
        
        // Output final grade, letter grade, and PASS/NOT PASS information
        System.out.println("Final grade: " + finalGrade);
        System.out.println("Letter grade: " + letterGrade);
        System.out.println("Result: " + passStatus);
   System.out.println("BY SAMID ");
   
    }
}
