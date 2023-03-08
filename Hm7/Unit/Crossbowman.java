package Unit;

import java.util.ArrayList;

public class Crossbowman extends Archers {
    int doubleattack;
    String name;

    public Crossbowman(String name, int x, int y) {
        super(name, 10, 10, 0, 6, 4, 3, 4, 10, new int[] { 2, 3 }, x, y, 16);
        this.name = name;

    }

    public int Doubleattack() {
        return 0;
    }

    @Override
    public void Die() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "Crossbowman!";
    }
    public String getEmoji() {
        if(currenthelth == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDDD\u200D♀️";
    }

}
