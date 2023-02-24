package Unit;
public class Crossbowman extends Archers {
    int doubleattack;
    String name;
    int shot;
    
    
    // public Crossbowman(int health, int mana,int damage, int armor, int range, int luck,
    //         int speed, String name) {
    //     super( health, mana, damage, armor, range, luck, speed);
    //     this.name = name;
        
    // }
    
    
    
    public Crossbowman(String name){
        super(10,10, 0, 6,2,3, 3, 4, 10, 4,name,16);
        this.name = name;
    };




    public int Doubleattack(){
        return damage*2;
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
        return "I am   Crossbowman!";
    }
    
    
}
