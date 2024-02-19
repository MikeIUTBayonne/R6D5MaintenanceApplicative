public class Driver {
    private static final int AGE_ADULT = 18;
    private final String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= AGE_ADULT;
    }

    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Car car) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changeGear(Car car, int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        car.accelerate();
    }
}