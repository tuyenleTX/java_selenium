package lab_08;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger() {
        this.setName(getClass().getSimpleName().toString());
        this.setSpeed(new SecureRandom().nextInt(100));
    }
}
