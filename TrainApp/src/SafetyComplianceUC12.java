import java.util.*;

// ✅ Goods Bogie Class
class GoodsBogieUC12 {
    String type;
    String cargo;

    public GoodsBogieUC12(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Cargo: " + cargo;
    }
}

// 🔥 Main Class
public class SafetyComplianceUC12 {

    // Safety Check Method
    public static boolean isTrainSafe(List<GoodsBogieUC12> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );
    }

    public static void main(String[] args) {

        List<GoodsBogieUC12> bogies = new ArrayList<>();

        bogies.add(new GoodsBogieUC12("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogieUC12("Open", "Coal"));
        bogies.add(new GoodsBogieUC12("Box", "Grain"));

        boolean isSafe = isTrainSafe(bogies);

        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}