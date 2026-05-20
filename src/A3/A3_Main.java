package A3;

public class A3_Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Generic Vehicle");
        Vehicle vehicleCopy = vehicle.createCopy();

        System.out.println("VehicleOriginal: " + vehicle.getBrand() + "\n" + "VehicleCopy: " + vehicleCopy.getBrand());

        Car car = new Car();
        car.setBrand("BMW");
        car.setHorsePower(320);
        Car carCopy = car.createCopy();

        System.out.println("CarOriginal: " + car.getBrand() + "\t" + car.getHorsePower() + "\n" + "CarCopy: " + carCopy.getBrand() + "\t" + carCopy.getHorsePower());

        Truck truck = new Truck();
        truck.setBrand("MAN");
        truck.setMaxLoad(18.5);
        Truck truckCopy = truck.createCopy();

        System.out.println("TruckOriginal: " + truck.getBrand() + "\t" + truck.getMaxLoad() + "\n" + "TruckCopy: " + truckCopy.getBrand() + "\t" + truckCopy.getMaxLoad());

    }
}
