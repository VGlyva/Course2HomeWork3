public class ServiceStation implements Check {

    public void check(Vehicle vehicle) {
        vehicle.service(vehicle);
    }
}