package Unit;

import java.util.ArrayList;

public class Peasent extends Character {
    int regen;
    String name;

   

    public Peasent(String name,int x, int y) {
        super(name, 1, 1, 10, 1, 3, 1, 1, 5, new int []{1,2}, x, y);
        this.name = name;
    }

   

    public int Feed() {
        return regen;

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
        return "I am Peasent!";
    }



   
   

   
}
