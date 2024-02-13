import java.util.Scanner;

public class CalculateSemesterIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] courses = {"PAMB", "CTPS", "DASPRO", "PRAKTEK DASPRO", "BHS INGGRIS", "BHS INDONESIA", "AGAMA", "KTI"};
        
        // Credits for each course
        int[] sks = {2, 2, 2, 2, 2, 2, 2, 2};
        
        // Number grades for each course
        double[] numberGrades = new double[courses.length];
        
        // Letter grades for each course
        String[] letterGrades = new String[courses.length];
        
        // Grade weights for each course
        double[] gradeWeights = new double[courses.length];
        
        // Equivalent values for letter grades
        double[] equivalentValues = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0.0};
        
        double totalIP = 0; // Total IP
        int totalSKS = 0; // Total SKS
        
        // Loop through each course to get its score
        for (int i = 0; i < courses.length; i++) {
            System.out.print("Enter the number value for " + courses[i] + ": ");
            numberGrades[i] = scanner.nextDouble();
            
            // Convert number grade to letter grade based on grading scale
            letterGrades[i] = convertNumberGradeToLetterGrade(numberGrades[i]);
            
            // Determine equivalent value based on letter grade
            switch (letterGrades[i]) {
                case "A":
                    gradeWeights[i] = 4.0;
                    break;
                case "B+":
                    gradeWeights[i] = 3.5;
                    break;
                case "B":
                    gradeWeights[i] = 3.0;
                    break;
                case "C+":
                    gradeWeights[i] = 2.5;
                    break;
                case "C":
                    gradeWeights[i] = 2.0;
                    break;
                case "D":
                    gradeWeights[i] = 1.0;
                    break;
                case "E":
                    gradeWeights[i] = 0.0;
                    break;
            }
            
            // Add Equivalent Value times weight of SKS to the total IP
            totalIP += (gradeWeights[i] * sks[i]);
            
            // Add SKS to the total SKS
            totalSKS += sks[i];
        }
        
        // Display the result of Grade Conversion
        System.out.println("\nResult of Grade Conversion:");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("| %-35s | %-15s | %-12s | %-12s |\n", "Course", "Number Grade", "Letter Grade", "Grade Weight");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("| %-35s | %-15.2f | %-12s | %-12.2f |\n", courses[i], numberGrades[i], letterGrades[i], gradeWeights[i]);
        }
        System.out.println("----------------------------------------------------------------");
        
        // Calculate and display the Semester IP
        double semesterIP = totalIP / totalSKS;
        System.out.printf("\nIP: %.2f\n", semesterIP);
        
        scanner.close();
    }
    
    // Function to convert number grade to letter grade
    public static String convertNumberGradeToLetterGrade(double numberGrade) {
        if (numberGrade >= 80 && numberGrade <= 100) {
            return "A";
        } else if (numberGrade > 73 && numberGrade <= 80) {
            return "B+";
        } else if (numberGrade > 65 && numberGrade <= 73) {
            return "B";
        } else if (numberGrade > 60 && numberGrade <= 65) {
            return "C+";
        } else if (numberGrade > 50 && numberGrade <= 60) {
            return "C";
        } else if (numberGrade > 39 && numberGrade <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
