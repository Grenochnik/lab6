public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car("Ford", "Focus");
        Truck truck = new Truck("Man", "TGX");
        Ecar ecar = new Ecar("Tesla", "Cybertruck");

        System.out.println(car.toStrung());
        car.start();
        truck.start();
        ecar.start();

        car.refuel(60);
        truck.refuel(150);
        ecar.charge(90);

        car.getFuelLevel();
        truck.getFuelLevel();
        ecar.getBattaryLevel();

        car.stop();
        truck.stop();
        ecar.stop();
    }
}