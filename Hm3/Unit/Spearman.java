package Unit;

public class Spearman extends Character {

    int splashattack;
    String name;

    public Spearman(String name) {
        super(10,10, 10, 4,1,3, 5, 1, 2, 4, name);
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
