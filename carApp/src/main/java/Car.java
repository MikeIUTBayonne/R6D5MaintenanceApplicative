public class Car {
    private static final int MAXIMUM_SPEED = 120;
    private static final int MINIMUM_SPEED = 0;
    private final String model;
    private final String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        if (speed + 10 <= MAXIMUM_SPEED) {
            speed += 10;
            System.out.println(this.toString());
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void decelerate() {
        if (speed - 10 >= MINIMUM_SPEED) {
            speed -= 10;
            System.out.println(this.toString());
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    @Override
    public String toString() {
        String string;
        string = "Modèle : " + model + "\n";
        string = string + "Couleur : " + color + "\n";
        string = string + "Vitesse actuelle : " + speed;
        return string;
    }
}