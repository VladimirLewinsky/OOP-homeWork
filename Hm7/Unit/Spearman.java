package Unit;

import java.util.ArrayList;

public class Spearman extends Character {

    int splashattack;
    String name;

    public Spearman(String name, int x, int y) {
        super(name, 10, 10, 10, 4, 4, 5, 1, 2, new int[] { 1, 3 }, x, y);
        this.name = name;

    }

    public int Splashattack() {
        return splashattack;
    }

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> enemyteam) {
        if (state.equals("Die")) {
            return;
        }
        int index = super.findNearest(enemyteam);
        int mindamage = damage[0];
        int maxdamage = damage[1];
        float damage = (enemyteam.get(index).armor - attack > 0) ? mindamage
                : (enemyteam.get(index).armor - attack < 0) ? maxdamage
                        : (mindamage + maxdamage) / 2;

        int totaly = y - enemyteam.get(index).y;
        int totalx = x - enemyteam.get(index).x;
        if (totaly == 1 || totaly == -1 || totalx ==1 || totalx == -1){
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
        return "Kpearman!";
    }

    public String getEmoji() {
        if (currenthelth == 0)
            return "\uD83D\uDC80";
        return "\uD83D\uDC77\u200D♂️";
    }

}
