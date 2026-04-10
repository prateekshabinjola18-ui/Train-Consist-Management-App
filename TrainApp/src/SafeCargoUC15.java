// ✅ Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ✅ Goods Bogie Class
class GoodsBogieUC15 {
    String type;
    String cargo;

    public GoodsBogieUC15(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // 🔥 Safe Assignment Method
    public void assignCargo(String cargo) {
        try {
            // ❌ Unsafe condition
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Cannot assign Petroleum to Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed\n");
        }
    }
}

// 🔥 Main Class
public class SafeCargoUC15 {

    public static void main(String[] args) {

        GoodsBogieUC15 b1 = new GoodsBogieUC15("Cylindrical");
        GoodsBogieUC15 b2 = new GoodsBogieUC15("Rectangular");

        // ✅ Safe
        b1.assignCargo("Petroleum");

        // ❌ Unsafe (handled)
        b2.assignCargo("Petroleum");

        // ✅ Program continues
        b2.assignCargo("Coal");
    }
}