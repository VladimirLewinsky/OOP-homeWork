package Unit;

import java.util.ArrayList;
import java.util.Random;

public class Wizzard extends Character {

    int debuff;
    int fireblast;
    String name;

    public Wizzard(String name, int x, int y) {
        super(name, 30, 30, 40, 17, 9, 12, 4, 9, new int[] { 5, 10 }, x, y);
        this.name = name;
    }

    public int Debuff() {
        return debuff;
    }

    public int Fireblast() {
        return fireblast;
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
        return "I am Wizzard!";
    }

    // *
    // переписываю метод для поиска наименьшего хп
    //
    @Override
    public int findNearestlowhealth(ArrayList<Character> team) {
        double min = 100;
        int index = 0;

        for (int i = 0; i < team.size(); i++) {

            if (min > (team.get(i).maxhealth - team.get(i).currenthelth) & !team.get(i).state.equals("Die")
                    & team.get(i).currenthelth > 0 & team.get(i).maxhealth != 1) // защита от Крестьянина
                     {
                min = (team.get(i).maxhealth - team.get(i).currenthelth);
                index = i;
            }

        }
        return index;

    }

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> enemyteam) {
        if (state.equals("Die"))
            return;
        if (mana <= 0) {
            super.step(team, enemyteam);
            return;
        }

        int index = findNearestlowhealth(team);
        int minheal = damage[0];
        int maxhealth = damage[1];
        int rndheal = new Random().nextInt(3);
        float heal = (rndheal == 0) ? minheal
                : (rndheal == 2) ? maxhealth
                        : (maxhealth + minheal) / 2;
        team.get(index).healing(heal);
        mana -= 20;
        
    }

}