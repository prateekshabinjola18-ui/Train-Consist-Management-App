import java.util.*;
import java.util.stream.Collectors;

// ✅ Base Class
class BogieUC9 {
    String type;
    int capacity;

    public BogieUC9(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

// ✅ Passenger Bogie
class PassengerBogieUC9 extends BogieUC9 {
    public PassengerBogieUC9(String type, int capacity) {
        super(type, capacity);
    }
}

// 🔥 UC9 Main Class
public class GroupBogiesByTypeUC9 {

    // Grouping Method
    public static Map<String, List<PassengerBogieUC9>> groupBogiesByType(List<PassengerBogieUC9> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.getType()));
    }

    public static void main(String[] args) {

        List<PassengerBogieUC9> bogies = new ArrayList<>();

        bogies.add(new PassengerBogieUC9("Sleeper", 72));
        bogies.add(new PassengerBogieUC9("AC Chair", 60));
        bogies.add(new PassengerBogieUC9("Sleeper", 75));
        bogies.add(new PassengerBogieUC9("First Class", 40));
        bogies.add(new PassengerBogieUC9("AC Chair", 65));

        // 🔥 Grouping
        Map<String, List<PassengerBogieUC9>> groupedBogies = groupBogiesByType(bogies);

        // Output
        System.out.println("Grouped Bogies:");

        for (String type : groupedBogies.keySet()) {
            System.out.println("\n" + type + ":");
            groupedBogies.get(type).forEach(System.out::println);
        }

        // Original list unchanged
        System.out.println("\nOriginal List:");
        bogies.forEach(System.out::println);
    }
}