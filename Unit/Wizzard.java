package Unit;
public class Wizzard extends Character{

    int debuff;
    int fireblast;

    public Wizzard(String name,String prof, int health, int mana,  int damage, int armor, int range, int luck,
            int speed) {
        super(name,prof, health, mana, damage, armor, range, luck, speed);

    }

    public int Debuff(){
        return debuff;
    }
    public int Fireblast(){
        return fireblast;
    }

}