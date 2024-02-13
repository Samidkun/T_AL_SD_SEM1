import java.util.Scanner;

public class SpeedDistanceTimeCalculator {
    
    public static void menu() {
        System.out.println("Choose the formula to calculate:");
        System.out.println("1. Speed");
        System.out.println("2. Distance");
        System.out.println("3. Time");
    }

    public static double calculateSpeed(double distance, double time) {
        return distance / time;
    }

    public static double calculateDistance(double speed, double time) {
        return speed * time;
    }

    public static double calculateTime(double distance, double speed) {
        return distance / speed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the distance (in units): ");
                double distance1 = scanner.nextDouble();
                System.out.print("Enter the time taken (in units): ");
                double time1 = scanner.nextDouble();
                double speed = calculateSpeed(distance1, time1);
                System.out.println("Speed = " + speed + " units per time");
                break;
            case 2:
                System.out.print("Enter the speed (in units per time): ");
                double speed2 = scanner.nextDouble();
                System.out.print("Enter the time taken (in units): ");
                double time2 = scanner.nextDouble();
                double distance2 = calculateDistance(speed2, time2);
                System.out.println("Distance = " + distance2 + " units");
                break;
            case 3:
                System.out.print("Enter the distance (in units): ");
                double distance3 = scanner.nextDouble();
                System.out.print("Enter the speed (in units per time): ");
                double speed3 = scanner.nextDouble();
                double time3 = calculateTime(distance3, speed3);
                System.out.println("Time = " + time3 + " time units");
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
