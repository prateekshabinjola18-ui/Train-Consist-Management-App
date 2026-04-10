import java.util.*;

// ✅ Base Class
class BogieUC10 {
    String type;
    int capacity;

    public BogieUC10(String type, int capacity) {
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

// ✅ Passenger Bogie
class PassengerBogieUC10 extends BogieUC10 {
    public PassengerBogieUC10(String type, int capacity) {
        super(type, capacity);
    }
}

// 🔥 Main Class
public class TotalSeatsUC10 {

    // 🔥 Reduce Logic
    public static int calculateTotalSeats(List<PassengerBogieUC10> bogies) {
        return bogies.stream()
                .map(b -> b.getCapacity())        // extract capacity
                .reduce(0, Integer::sum);         // sum
    }

    public static void main(String[] args) {

        List<PassengerBogieUC10> bogies = new ArrayList<>();

        bogies.add(new PassengerBogieUC10("Sleeper", 72));
        bogies.add(new PassengerBogieUC10("AC Chair", 60));
        bogies.add(new PassengerBogieUC10("First Class", 40));

        int totalSeats = calculateTotalSeats(bogies);

        System.out.println("Total Seating Capacity: " + totalSeats);

        // original list unchanged
        System.out.println("\nOriginal List:");
        bogies.forEach(System.out::println);
    }
}