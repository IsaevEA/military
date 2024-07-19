public class Officers extends AbstractMilitary implements Command{


    private Map map;

    private Backpack backpack;

    @Override
    public String toString() {
        return
                ", map=" + map +
                ", backpack=" + backpack +
                '}';
    }

    public Officers(String name, String rank, int age, Map map, Backpack backpack) {
        super(name, rank, age);
        this.map = map;
        this.backpack = backpack;
    }


    @Override
    public void command() {
        System.out.println("Совершить выстрел");
    }
}
