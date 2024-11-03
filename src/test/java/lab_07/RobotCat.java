package lab_07;

public class RobotCat {
    private String name;
    private String deliveryDate;

    public RobotCat() {
    }

    public RobotCat(String name, String deliveryDate) {
        this.name = name;
        this.deliveryDate = deliveryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String charging() {
        return "Charging: ";
    }
    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
