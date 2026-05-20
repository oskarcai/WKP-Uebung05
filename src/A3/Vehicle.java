package A3;

public class Vehicle {
    private String brand;

    public Vehicle createCopy() {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(this.brand);
        return vehicle;
    }

    // Getter & Setter
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
