package lab_08;

public class RobotDogStaticLearning {
    private static int dogId = 0; //static means class variable - is shared among classes
    //class members includes class variable and class methods and defined though static
    //can we override class members? only for class variable but not class method. To override class variable use static block
    /* for example, in the sub-class, use code as below:
    static {
        dogId = dogId + 2;
    }
     */
    //for class method, if sub-class use a method as same as parent class, there will be no error, each class owns its method
    //non-static method can access static method but static method can only access static method
    //if defines static final, it considers as a constant, cannot change value
    public RobotDogStaticLearning() {
        dogId ++;
    }

    public  int getDogId() {
        return dogId;
    }

    public static int increaseDogId() {
        return dogId ++;
    }

    public static void main(String[] args) {
        RobotDogStaticLearning dog1 = new RobotDogStaticLearning();
        RobotDogStaticLearning dog2 = new RobotDogStaticLearning();
        System.out.println(dog1.getDogId()); //2 --dogId is static variable and is shared
        System.out.println(dog2.getDogId()); //2
    }
}
