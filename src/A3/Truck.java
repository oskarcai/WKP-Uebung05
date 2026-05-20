package A3;

public class Truck extends Vehicle {
    private double maxLoad;

    @Override
    public Truck createCopy() {
        Truck truck = new Truck();
        truck.setBrand(this.getBrand());// ✅ brand von THIS kopieren (super = this in diesem Fall, da Truck keine eigene Implementierung von getBrand() besitzt)
        truck.setMaxLoad(this.maxLoad); // ✅ horsePower von THIS kopieren
        return truck;
    }

    // Getter & Setter
    public double getMaxLoad() {
        return maxLoad;
    }
    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
}
