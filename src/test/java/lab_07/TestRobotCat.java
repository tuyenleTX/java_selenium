package lab_07;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        batteryRobotCat.setName("Kitty");
        batteryRobotCat.setDeliveryDate("1/1/2024");
        RobotCat solarRobotCat = new SolarRobotCat();
        solarRobotCat.setName("Doraemon");
        solarRobotCat.setDeliveryDate("1/10/2000");
        System.out.println(batteryRobotCat);
        System.out.println(solarRobotCat);

        System.out.println(batteryRobotCat.charging());
        System.out.println(solarRobotCat.charging());
    }
}
