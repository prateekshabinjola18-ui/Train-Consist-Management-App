import java.util.HashSet;

public class TrainConsistUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Add duplicate IDs intentionally
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIds);
    }
}
