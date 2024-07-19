import java.util.PrimitiveIterator;

public abstract class AbstractMilitary {
    private String name;
    private String rank;
    private int age;

    private Backpack backpack;


    public AbstractMilitary(String name, String rank, int age, Backpack backpack) {
        this.name = name;
        this.rank = rank;
        this.age = age;
        this.backpack = backpack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    @Override
    public String toString() {
        return "AbstractMilitary{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", age=" + age +
                ", backpack=" + backpack +
                '}';
    }
}
