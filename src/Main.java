
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("АК-47", 2);
        Map map = new Map("Пустыня", "Оборона военнозначимой местности");
        Backpack backpack = new Backpack("Зеленый", 5);

        Soldier soldier1 = new Soldier("Max", "Soldier", 22, weapon, backpack);
        Soldier soldier2 = new Soldier("Max", "Soldier", 22, weapon, backpack);
        Soldier soldier3 = new Soldier("Max", "Soldier", 22, weapon, backpack);
        Soldier soldier4 = new Soldier("Max", "Soldier", 22, weapon, backpack);

        Officers officers = new Officers("Max", "Soldier", 22, map, backpack);

        Squad squad = new Squad();
        squad.add(soldier1);
        squad.add(soldier2);
        squad.add(soldier3);
        squad.add(soldier4);
        squad.add(officers);


        squad.printInfo();
    }
}