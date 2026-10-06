import java.util.ArrayList;
import java.util.HashMap;

public class Pharmaceutical {

    ArrayList<Medicine> medicines = new ArrayList<>();
    HashMap<Integer, Medicine> medicineMap = new HashMap<>();

    // Add Medicine
    public void addMedicine(Medicine medicine) {

        if (medicineMap.containsKey(medicine.id)) {
            System.out.println("Medicine ID already exists!");
            return;
        }

        medicines.add(medicine);
        medicineMap.put(medicine.id, medicine);

        System.out.println("Medicine added successfully!");
    }

    // Search Medicine by ID
    public Medicine searchById(int id) {
        return medicineMap.get(id);
    }

    // Update Medicine
    public void updateMedicine(int id, String name, String manufacturer,
                               String category, double price, int quantity) {

        Medicine medicine = medicineMap.get(id);

        if (medicine != null) {

            medicine.name = name;
            medicine.manufacturer = manufacturer;
            medicine.category = category;
            medicine.price = price;
            medicine.quantity = quantity;

            System.out.println("Medicine updated successfully!");

        } else {
            System.out.println("Medicine not found!");
        }
    }

    // Delete Medicine
    public void deleteMedicine(int id) {

        Medicine medicine = medicineMap.get(id);

        if (medicine != null) {

            medicines.remove(medicine);
            medicineMap.remove(id);

            System.out.println("Medicine deleted successfully!");

        } else {
            System.out.println("Medicine not found!");
        }
    }

    // Display All Medicines
    public void displayMedicines() {

        System.out.println("\n===== ALL MEDICINES =====");

        if (medicines.isEmpty()) {
            System.out.println("No medicines available.");
            return;
        }

        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
