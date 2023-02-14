package Unit;
public class Monk extends Character {
    int heal;
    
    public Monk(String name,String prof, int health, int mana, int damage, int armor, int range, int luck,
            int speed) {
        super(name,prof, health, mana,damage, armor, range, luck, speed);
        

    }

    public int Heal(){
        return heal;
    }
    
}
