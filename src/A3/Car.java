package A3;

public class Car extends Vehicle {
    private int horsePower;

    @Override   // *Kovarianz -> eine überschriebene Methode in einer Unterklasse darf
                // einen spezifischeren Rückgabetypen besitzen als die Methode der Oberklasse
    public Car createCopy() {
        Car car = new Car();
        car.setBrand(this.getBrand());      // ✅ brand von THIS kopieren (super = this in diesem Fall, da Car keine eigene Implementierung von getBrand() besitzt)
        car.setHorsePower(this.horsePower); // ✅ horsePower von THIS kopieren
        return car;
    }

    // Getter & Setter
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
