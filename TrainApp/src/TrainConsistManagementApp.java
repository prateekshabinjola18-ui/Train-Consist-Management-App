import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Train consist stores bogie names
        List<String> trainConsist = new ArrayList<>();

        // Initial summary
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display consist
        System.out.println("Current Train Consist: " + trainConsist);
    }
}