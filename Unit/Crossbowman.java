package Unit;
public class Crossbowman extends Character {
    int doubleattack;
    
    public Crossbowman(String name,String prof, int health, int mana,int damage, int armor, int range, int luck,
            int speed) {
        super(name,prof, health, mana, damage, armor, range, luck, speed);
        
    }

    public int Doubleattack(){
        return damage*2;
    }
    
}
