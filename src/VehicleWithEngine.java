public class VehicleWithEngine extends Vehicle {
    public VehicleWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service(Vehicle vehicle) {
        super.service(vehicle);
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
