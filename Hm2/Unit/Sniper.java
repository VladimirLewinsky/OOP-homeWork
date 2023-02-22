package Unit;

public class Sniper extends Character {
    int crit;
    String name;


    public Sniper(String name) {
        super(20, 15, 18, 3, 5, 8, 10, name);
        this.name = name;

    }

    public int Crit() {
        return crit * damage;
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
        return "I am Sniper!";
    }

}
