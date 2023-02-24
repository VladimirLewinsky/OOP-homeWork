package Unit;
public class Rogue extends Character {
    int stealth;
    String name;
    protected int attack;

    public Rogue(String name) {
        super(10,10, 15,8,10, 14, 3, 1, 10, 6,name);
        this.name =name;
        
    }
    
    public int Stealth(){
        return 0;
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
        return "I am Rogue!";
    }

   
   
}
