public class Medicine {

    int id;
    String name;
    String manufacturer;
    String category;
    double price;
    int quantity;

    public Medicine(int id, String name, String manufacturer,
                    String category, double price, int quantity) {

        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {

        return "ID: " + id +
               ", Name: " + name +
               ", Manufacturer: " + manufacturer +
               ", Category: " + category +
               ", Price: ₹" + price +
               ", Quantity: " + quantity;
    }
}
