package Unit;

import java.util.ArrayList;

public class Rogue extends Character {
    int stealth;
    String name;
    protected int attack;

    
    
    public Rogue(String name, int x, int y) {
        super(name, 10, 10, 15, 8, 6, 3, 1 ,10, new int []{8,10}, x, y);
        this.name = name;
        
    }

    public int Stealth(){
        return 0;
    }

    


    @Override
    public void attack(float damage) {
        // TODO Auto-generated method stub
        super.attack(damage);
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
