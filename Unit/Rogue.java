package Unit;
public class Rogue extends Character {

    int stealth;
    protected int attack;
    public Rogue(String name,String prof, int health, int mana,  int damage, int armor, int range, int luck,
            int speed) {
        super(name, prof,health, mana, damage, armor, range, luck, speed);
        
    }
    
    public int Stealth(){
        return 0;
    }
  
}
