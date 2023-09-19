public class Laptop extends Computer {

    private double weight;

    public Laptop (double aWeight, String type, double serialNum) {
        super (type, serialNum);
        weight = aWeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
