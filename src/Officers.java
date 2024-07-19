public class Officers extends AbstractMilitary implements Command{


    private Map map;


    @Override
    public String toString() {
        return
                "name: " + super.getName() +
                ", rank: " + super.getRank() +
                ", age: " + super.getAge() +
                ", map" + map;
    }

    public Officers(String name, String rank, int age, Backpack backpack, Map map) {
        super(name, rank, age, backpack);
        this.map = map;
    }


    @Override
    public void command() {
        System.out.println("Совершить нападение");
    }
}
