import java.util.LinkedList;

public class TrainConsistUC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        // Display after insertion
        System.out.println("After adding Pantry Car:");
        System.out.println(trainConsist);

        // Remove first bogie
        trainConsist.removeFirst();

        // Remove last bogie
        trainConsist.removeLast();

        // Final consist
        System.out.println("Final Ordered Train Consist:");
        System.out.println(trainConsist);
    }
}