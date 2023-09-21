public class Main {
    public static void main(String[] args) {
        Car car = new Car("Хонда",4);
        Car car2 = new Car("Приора",4);


        Truck truck = new Truck("Камаз",6);
        Truck truck2 = new Truck("Ман",8);


        Bicycle bicycle = new Bicycle("Сильвер",2);
        Bicycle bicycle2 = new Bicycle("Самурай",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);
        station.check(car2);
    }
}