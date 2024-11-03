package lab_07;

import java.util.Arrays;
import java.util.List;

public class RobotCatController {
    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();
        RobotCat windRobotCat = new WindRobotCat();
        charge(Arrays.asList(batteryRobotCat, solarRobotCat, windRobotCat));
    }
    public static void charge(List<RobotCat> robotCatList) {
        for (RobotCat robot: robotCatList
             ) {
            System.out.println(robot.charging());
        }
    }
}
