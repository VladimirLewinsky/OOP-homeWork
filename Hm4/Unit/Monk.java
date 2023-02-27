package Unit;

import java.util.ArrayList;

public class Monk extends Character{
    int heal;
    String name;

    
   

    public Monk(String name,int x, int y) {
        super(name, 30, 30, 25, 12, 5, 7, 3, 5, new int []{-3,-5}, x, y);
        this.name = name;
        
    }

    public int Heal() {
        return heal;
    }

    

    @Override
    public Integer Attack(ArrayList<Character> enemy, int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void Die() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "I am Monk!";
    }

    

   

}
