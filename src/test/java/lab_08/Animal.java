package lab_08;

import java.security.SecureRandom;

public class Animal {
    private int speed;

    private String name;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                '}';
    }
}
