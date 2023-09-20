public class ServiceStation implements Check {

    public void check(Vehicle vehicle) {
        if (vehicle instanceof Bicycle) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
        } else if (vehicle instanceof Truck) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            ((Truck) vehicle).checkEngine();
            ((Truck) vehicle).checkTrailer();
        } else if (vehicle instanceof Car) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            ((Car) vehicle).checkEngine();
        }
    }
}