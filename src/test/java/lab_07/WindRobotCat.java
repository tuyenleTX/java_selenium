package lab_07;

public class WindRobotCat extends RobotCat{
    @Override
    public String charging() {
        return super.charging().concat("by wind");
    }
}
