package lab_09;

import java.security.SecureRandom;

/*
Racing animal with builder design pattern
Eagle, Falcon, Tiger, Dog, Horse, etc.
Animal tiger = new Animal.Builder().withWings(false)...build();
Animal falcon = new Animal.Builder().withWings(true)...build();
 */
public class Animal {

    private int speed;
    private String name;
    private boolean withWings;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.withWings = builder.withWings;
    }
    //READ ONLY
    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isWithWings() {
        return withWings;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", withWings=" + withWings +
                '}';
    }

    //Inner class
    public static class Builder {
        private int speed;
        private String name;
        private boolean withWings;

        //WRITE ONLY
        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
