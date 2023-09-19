public class Main {
    public static void main(String[] args) {
        Car car = new Car("car",1);
        Car car2 = new Car("car2",2);
        car.setModelName("Хонда");
        car2.setModelName("Приора");
        car2.setWheelsCount(4);

        Truck truck = new Truck("truck",5);
        Truck truck2 = new Truck("truck2",11);
        truck.setModelName("Камаз");
        truck2.setModelName("Ман");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(10);

        Bicycle bicycle = new Bicycle("bicycle",3);
        Bicycle bicycle2 = new Bicycle("bicycle2",9);
        bicycle.setModelName("Сильвер");
        bicycle2.setModelName("Самурай");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(null, bicycle, null);
        station.check(null, null, truck2);
        station.check(null, null, null);
        station.check(null, null, null);
        station.check(null, null, null);
        station.check(null, null, null);
    }
}