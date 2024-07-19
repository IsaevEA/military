public class Soldier extends AbstractMilitary implements Fire{

    private Weapon weapon;
    private Backpack backpack;

    @Override
    public String toString() {
        return "Soldier{" +
                "weapon=" + weapon +
                ", backpack=" + backpack +
                '}';
    }

    public Soldier(String name, String rank, int age, Weapon weapon, Backpack backpack) {
        super(name,rank,age);
        this.backpack = backpack;
        this.weapon = weapon;
    }


    @Override
    public void fire() {
        System.out.println("Совершаю выстрел");
    }
}
