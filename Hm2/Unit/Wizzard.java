package Unit;

public class Wizzard extends Character {

    int debuff;
    int fireblast;
    String name;

    public Wizzard(String name) {
        super(25, 40, 5, 3, 4, 9, 9, name);
        this.name = name;

    }

    public int Debuff() {
        return debuff;
    }

    public int Fireblast() {
        return fireblast;
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
        return "I am Wizzard!";
    }

}