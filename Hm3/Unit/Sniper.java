package Unit;

public class Sniper extends Archers {
    int crit;
    String name;
    

    public Sniper(String name) {
        super(15,15, 0, 12,8,10, 10, 5, 8, 9, name,32);
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
