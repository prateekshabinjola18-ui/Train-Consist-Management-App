import java.util.regex.*;

// 🔥 Main Class
public class RegexValidationUC11 {

    // Train ID Validation
    public static boolean isValidTrainID(String trainId) {
        String pattern = "TRN-\\d{4}";
        return Pattern.matches(pattern, trainId);
    }

    // Cargo Code Validation
    public static boolean isValidCargoCode(String cargoCode) {
        String pattern = "PET-[A-Z]{2}";
        return Pattern.matches(pattern, cargoCode);
    }

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        if (isValidTrainID(trainId)) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (isValidCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }
    }
}