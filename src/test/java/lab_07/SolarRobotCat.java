package lab_07;

public class SolarRobotCat extends RobotCat{
    @Override
    public String charging() {
        return super.charging().concat("by solar");
    }
}
