
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("АК-47", 2);
        Map map = new Map("Пустыня", "Оборона военнозначимой местности");
        Backpack backpack = new Backpack("Зеленый", 5);

        Soldier soldier1 = new Soldier("Max", "Soldier", 22, backpack,  new Weapon("Зеленый", 5) );
        Soldier soldier2 = new Soldier("Max", "Soldier", 22, backpack,  new Weapon("Зеленый", 5) );
        Soldier soldier3 = new Soldier("Max", "Soldier", 22, backpack,  new Weapon("Зеленый", 5) );
        Soldier soldier4 = new Soldier("Max", "Soldier", 22, backpack,  new Weapon("Зеленый", 5) );

        Officers officers = new Officers("Max", "Soldier", 22, backpack, map );
        Officers officers1 = new Officers("Max", "Soldier", 22, backpack, map );
        Officers officers2= new Officers("Max", "Soldier", 22, backpack, map );
        Officers officers3= new Officers("Max", "Soldier", 22, backpack, map );

        Squad squad = new Squad();
        squad.add(soldier1);
        squad.add(soldier2);
        squad.add(soldier3);
        squad.add(soldier4);
        squad.add(officers);


        squad.printInfo();
    }
}