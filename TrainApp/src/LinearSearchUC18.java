// 🔥 Main Class
public class LinearSearchUC18 {

    // Linear Search Method
    public static boolean searchBogie(String[] bogies, String key) {

        for (String b : bogies) {
            if (b.equals(key)) {
                return true; // found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        boolean found = searchBogie(bogies, searchKey);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}