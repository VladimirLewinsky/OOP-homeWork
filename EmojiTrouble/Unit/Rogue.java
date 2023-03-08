package Unit;

import java.util.ArrayList;

public class Rogue extends Character {
    int stealth;
    String name;
    protected int attack;

    public Rogue(String name, int x, int y) {
        super(name, 10, 10, 15, 8, 6, 3, 1, 10, new int[] { 8, 10 }, x, y);
        this.name = name;

    }

    public int Stealth() {
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
        return "Rogue!";
    }

    @Override
    public String getEmoji() {
        if (currenthelth == 0)
            return "\uD83D\uDC80";
        return "\uD83E\uDD77";
    }

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> enemyteam) {
        if (state.equals("Die")) {
            return;
        }
        int index = super.findNearest(enemyteam);
        int friendindex = super.findNearest(team);
        int mindamage = damage[0];
        int maxdamage = damage[1];
        float damage = (enemyteam.get(index).armor - attack > 0) ? mindamage
                : (enemyteam.get(index).armor - attack < 0) ? maxdamage
                        : (mindamage + maxdamage) / 2;

        int totaly = y - enemyteam.get(index).y;
        int totalx = x - enemyteam.get(index).x;

        if (totaly == 1 || totaly == -1 || totalx == 1 || totalx == -1) {
            enemyteam.get(index).attack(damage);
            return;
        }


        if (totaly < -1){
            y++;
        }
        if (totaly > 1)
            y--;
            
        if (x != enemyteam.get(index).x) {
            if (totalx < 0)
                x++;
            if (totalx > 0)
                x--;
        }

    }

}
