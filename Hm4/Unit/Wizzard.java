package Unit;

import java.util.ArrayList;

public class Wizzard extends Character {

    int debuff;
    int fireblast;
    String name;

   

    public Wizzard(String name, int x, int y) {
        super(name, 30, 30, 40, 17, 9, 12, 4, 9, new int []{5,10}, x, y);
        this.name = name;
    }

   

    public int Debuff() {
        return debuff;
    }

   

    public int Fireblast() {
        return fireblast;
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
        return "I am Wizzard!";
    }

  

}