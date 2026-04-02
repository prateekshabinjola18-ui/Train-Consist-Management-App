import java.util.ArrayList;

public class TrainConsistUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Final state
        System.out.println("Final train consist:");
        System.out.println(passengerBogies);
    }
}