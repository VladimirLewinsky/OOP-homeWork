package Unit;

import java.util.ArrayList;
import java.util.Random;

public class Monk extends Character {
    int heal;
    String name;

    public Monk(String name, int x, int y) {
        super(name, 30, 30, 40, 12, 5, 7, 3, 5, new int[] { 3, 5 }, x, y);
        this.name = name;

    }

    public int Heal() {
        return heal;
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
        return "Monk!";
    }

    @Override
    public String getEmoji() {
        if (currenthelth == 0)
            return "\uD83D\uDC80";
        return "\uD83E\uDDD9\u200D♂️";
    }

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
            int index = super.findNearest(enemyteam);
            int mindamage = damage[0];
            int maxdamage = damage[1];
            float damage = (enemyteam.get(index).armor - attack > 0) ? mindamage
                    : (enemyteam.get(index).armor - attack < 0) ? maxdamage
                            : (mindamage + maxdamage) / 2;

            int totaly = y - enemyteam.get(index).y;
            int totalx = x - enemyteam.get(index).x;
            if (totaly == 1 || totaly == -1 || totalx ==1 || totalx == -1) {
                enemyteam.get(index).attack(damage);
                return;
            }
            if (totaly < 0)
                y++;
            if (totaly > 1)
                y--;
            if (x != enemyteam.get(index).x) {
                if (totalx < 0)
                    x++;
                if (totalx > 0)
                    x--;
            }
        }

        int index = findNearestlowhealth(team);
        int minheal = damage[0];
        int maxhealth = damage[1];
        int rndheal = new Random().nextInt(3);
        float heal = (rndheal == 0) ? minheal
                : (rndheal == 2) ? maxhealth
                        : (maxhealth + minheal) / 2;
        team.get(index).healing(heal);
        mana -= 10;

    }

}
