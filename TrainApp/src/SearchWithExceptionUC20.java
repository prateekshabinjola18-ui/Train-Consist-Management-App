// 🔥 Main Class
public class SearchWithExceptionUC20 {

    public static boolean searchBogie(String[] bogies, String key) {

        // 🔥 Fail-fast check
        if (bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // 🔍 Linear search
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309"};

        String key = "BG205";

        try {
            boolean found = searchBogie(bogies, key);

            if (found) {
                System.out.println("Bogie Found");
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}