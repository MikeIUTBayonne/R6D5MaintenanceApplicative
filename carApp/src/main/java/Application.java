public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver myself = new Driver("John", 20);

        myself.startCar(myCar);
        myCar.accelerate();
        myself.changeGear(myCar, 80);
        myCar.decelerate();
        myself.stopCar(myCar);
        System.out.println(myCar.toString());
    }
}