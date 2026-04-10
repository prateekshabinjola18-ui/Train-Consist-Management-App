import java.util.*;
import java.util.stream.Collectors;

// ✅ Renamed Base Class (to avoid conflict)
class BogieUC8 {
    String type;
    int capacity;

    public BogieUC8(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

// ✅ Renamed Passenger Class
class PassengerBogieUC8 extends BogieUC8 {
    public PassengerBogieUC8(String type, int capacity) {
        super(type, capacity);
    }
}

// 🔥 UC8 Main Class
public class FilterPassengerBogiesUsingStreams {

    // Stream filtering method
    public static List<PassengerBogieUC8> filterBogiesByCapacity(List<PassengerBogieUC8> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<PassengerBogieUC8> bogies = new ArrayList<>();

        bogies.add(new PassengerBogieUC8("Sleeper", 72));
        bogies.add(new PassengerBogieUC8("AC Chair", 60));
        bogies.add(new PassengerBogieUC8("First Class", 40));
        bogies.add(new PassengerBogieUC8("General", 90));
        bogies.add(new PassengerBogieUC8("Luxury", 80));

        int threshold = 70;

        // 🔥 Apply Stream Filter
        List<PassengerBogieUC8> filteredBogies = filterBogiesByCapacity(bogies, threshold);

        System.out.println("Filtered Bogies (Capacity > " + threshold + "):");

        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            filteredBogies.forEach(System.out::println);
        }

        // ✅ Original list unchanged
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);
    }
}