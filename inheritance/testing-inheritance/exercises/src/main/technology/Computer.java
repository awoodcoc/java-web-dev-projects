public class Computer {
    private String type;
    private double serialNum;
    private boolean isOutdated = false;

    public Computer(String type, double serialNum) {
        this.type = type;
        this.serialNum = serialNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(double serialNum) {
        this.serialNum = serialNum;
    }

    public boolean isOutdated() {
        return isOutdated;
    }

    public void setOutdated(boolean outdated) {
        isOutdated = outdated;
    }
}
