package lab_07;

public class BatteryRobotCat extends RobotCat{

    @Override
    public String charging() {
        return super.charging().concat("by battery");
    }
}
