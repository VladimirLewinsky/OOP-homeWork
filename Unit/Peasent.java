package Unit;
public class Peasent extends Character{
    int regen;
    
    public Peasent(String name,String prof, int health, int mana, int damage, int armor, int range, int luck,
            int speed) {
        super(name,prof, health, mana, damage, armor, range, luck, speed);
        
    }
    
    public int Feed(){
        return regen;
        
    }
    
}
