package Unit;

public class Peasent extends Character {
    int regen;
    String name;

    // public Peasent(String name,String prof, int health, int mana, int damage, int
    // armor, int range, int luck,
    // int speed) {
    // super(name,prof, health, mana, damage, armor, range, luck, speed);

    // }

    public Peasent(String name) {
        super(30, 10, 3, 1, 1, 5, 8,name);
        this.name = name;
    }

    public int Feed() {
        return regen;

    }

    @Override
    public void Attack() {
        // TODO Auto-generated method stub

    }

    @Override
    public void Die() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "I am Peasent!";
    }

}
