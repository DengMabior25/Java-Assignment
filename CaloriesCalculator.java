import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Running
        System.out.print("Enter running duration (minutes): ");
        int runningMinutes = sc.nextInt();
        int runningCalories = (runningMinutes / 5) * 60;

        // Push-ups
        System.out.print("Enter push-ups duration (minutes): ");
        int pushupMinutes = sc.nextInt();
        int pushupCalories = (pushupMinutes / 30) * 200;

        // Planks
        System.out.print("Enter planks duration (minutes): ");
        int plankMinutes = sc.nextInt();
        int plankCalories = plankMinutes * 5;

        int totalCalories = runningCalories + pushupCalories + plankCalories;

        System.out.println("Calories burned from running: " + runningCalories);
        System.out.println("Calories burned from push-ups: " + pushupCalories);
        System.out.println("Calories burned from planks: " + plankCalories);
        System.out.println("Total calories burned: " + totalCalories);
    }
}
