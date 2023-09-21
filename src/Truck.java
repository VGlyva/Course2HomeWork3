public class Truck extends VehicleWithEngine{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service(Vehicle vehicle) {
        super.service(vehicle);
        checkTrailer();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
