// ✅ Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ✅ Passenger Bogie Class
class PassengerBogieUC14 {
    String type;
    int capacity;

    public PassengerBogieUC14(String type, int capacity) throws InvalidCapacityException {

        // 🔥 Validation
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

// 🔥 Main Class
public class InvalidCapacityUC14 {

    public static void main(String[] args) {

        try {
            PassengerBogieUC14 b1 = new PassengerBogieUC14("Sleeper", 72);
            System.out.println("Created: " + b1.getType());

            // ❌ This will throw exception
            PassengerBogieUC14 b2 = new PassengerBogieUC14("AC", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}