public class Backpack {
    private String color;

    @Override
    public String toString() {
        return "Backpack{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Backpack(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    private int weight;
}
