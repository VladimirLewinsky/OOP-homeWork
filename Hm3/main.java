import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.jar.Attributes.Name;
import java.util.Comparator;
import java.util.List;

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

        List<Character> listlight = new ArrayList<>();
        List<Character> listdark = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(4);
            if (a == 0) {
                listlight.add(new Peasent(getName()));
            }
            if (a == 1) {
                listlight.add(new Rogue(getName()));
            }
            if (a == 2) {
                listlight.add(new Sniper(getName()));
            }
            if (a == 3) {
                listlight.add(new Wizzard(getName()));
            }
        }

        for (int j = 0; j < 10; j++) {
            int a = new Random().nextInt(4);
            if (a == 0) {
                listdark.add(new Peasent(getName()));
            }
            if (a == 1) {
                listdark.add(new Monk(getName()));
            }
            if (a == 2) {
                listdark.add(new Spearman(getName()));
            }
            if (a == 3) {
                listdark.add(new Crossbowman(getName()));
            }
        }
        // System.out.println(Arrays.deepToString(listdark.toArray()));
        // Arrays.deepToString(listdark.toArray());
        // for (int i = 0; i < listlight.size(); i++) {
        // System.out.println(listdark.get(i).About());
        // }

        ArrayList<Character> allteams = new ArrayList<>(listdark);

        for (int i = 0; i < listlight.size(); i++) {
            allteams.add(listlight.get(i));
        }

        for (int i = 0; i < allteams.size(); i++) {
            System.out.println(allteams.get(i).About());
        }

        allteams.sort(new Comparator<Character>() {
            @Override
            public int compare(Character t0, Character t1) {
                if (t1.getSpeed() == t0.getSpeed()){
                    return t1.getRange() - t0.getRange();
                }
                return t1.getSpeed() - t0.getSpeed(); // указывать в каком порядке(по какому принципу сортировать)
            }
        });


        System.out.println("\n");
        for (int i = 0; i < allteams.size(); i++) {
            System.out.println(allteams.get(i).About());
        }

    }

}