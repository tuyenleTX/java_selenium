package lab_08;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog() {
        this.setName(getClass().getSimpleName().toString());
        this.setSpeed(new SecureRandom().nextInt(60));
    }
}
