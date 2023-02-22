package Unit;

public class Spearman extends Character {

    int splashattack;
    String name;

    public Spearman(String name) {
        super(50, 10, 10, 7, 1, 2, 6, name);
        this.name = name;

    }

    public int Splashattack() {
        return splashattack;
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
        return "I am Spearman!";
    }

}
