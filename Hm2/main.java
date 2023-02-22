import java.util.ArrayList;
import java.util.Random;
import java.util.jar.Attributes.Name;

import javax.swing.text.html.HTMLDocument;

import Unit.Character;
import Unit.Crossbowman;
import Unit.Monk;
import Unit.Names;
import Unit.Peasent;
import Unit.Rogue;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Wizzard;

public class main {
    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

    public static void main(String[] args) {

        ArrayList<Character> characterList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(7);
            if (a == 0) {
                characterList.add(new Monk(getName()));
            }
            if (a == 1) {
                characterList.add(new Rogue(getName()));
            }
            if (a == 2) {
                characterList.add(new Peasent(getName()));
            }
            if (a == 3) {
                characterList.add(new Sniper(getName()));
            }
            if (a == 4) {
                characterList.add(new Spearman(getName()));
            }
            if (a == 5) {
                characterList.add(new Wizzard(getName()));
            }
            if (a == 6) {
                characterList.add(new Crossbowman(getName()));
            }
           
        }

        for (Character i : characterList) {
        System.out.println(i.getInfo());
        System.out.println(i.About());
        }

    }
}