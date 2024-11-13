package lab_08;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse() {
        this.setName(getClass().getSimpleName().toString());
        this.setSpeed(new SecureRandom().nextInt(75));
    }
}
