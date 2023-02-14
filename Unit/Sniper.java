package Unit;
public class Sniper extends Character {
    int crit;

    public Sniper(String name,String prof, int health, int mana,  int damage, int armor, int range, int luck,
            int speed) {
        super(name,prof, health, mana, damage, armor, range, luck, speed);
        
    }
    public int Crit(){
        return crit*damage;
    }
}
