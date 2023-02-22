package Unit;
public class Rogue extends Character {
    int stealth;
    String name;
    protected int attack;

    public Rogue(String name) {
        super(40, 15, 14, 5, 1, 10, 10,name);
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
