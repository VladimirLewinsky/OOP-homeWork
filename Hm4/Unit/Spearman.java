package Unit;

import java.util.ArrayList;

public class Spearman extends Character {

    int splashattack;
    String name;

    

    public Spearman(String name,int x, int y) {
        super(name, 10, 10, 10, 4, 4, 5, 1, 2, new int []{1,3}, x, y);
        this.name = name;
        
    }

    

    public int Splashattack() {
        return splashattack;
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
        return "I am Spearman!";
    }

  
}
