public class Soldier extends AbstractMilitary implements Fire{

    private Weapon weapon;

    @Override
    public String toString() {
        return "Soldier{" +
                "weapon=" + weapon +
                '}';
    }

    public Soldier(String name, String rank, int age, Backpack backpack, Weapon weapon) {
        super(name,rank,age, backpack);
        this.weapon = weapon;
    }


    @Override
    public void fire() {
        System.out.println("Совершаю выстрел");
    }
}
