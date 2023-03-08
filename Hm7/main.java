import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import javax.swing.text.html.HTMLDocument;

import Unit.Character;
import Unit.Crossbowman;
import Unit.Monk;
import Unit.Names;
import Unit.Peasent;
import Unit.Rogue;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Vektor2d;
import Unit.Wizzard;

public class main {
    static final int UNITS = 10;
    
    public static ArrayList<Character> allteams =new ArrayList<>();
    public static ArrayList<Character> listlight =new ArrayList<>();
    public static ArrayList<Character> listdark = new ArrayList<>();
    

    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

    public static void main(String[] args) {
       
        
        Scanner user_input = new Scanner(System.in);
        
        for (int i = 0; i < UNITS; i++) {
            int a = new Random().nextInt(4);
            if (a == 0) {
                listlight.add(new Peasent(getName(), i+1, 1));
            }
            if (a == 1) {
                listlight.add(new Rogue(getName(), i+1, 1));
            }
            if (a == 2) {
                listlight.add(new Sniper(getName(), i+1, 1));
            }
            if (a == 3) {
                listlight.add(new Wizzard(getName(), i+1, 1));
            }
            // listlight.get(i).y = i + 1;
        }

        for (int j = 0; j < UNITS; j++) {
            int a = new Random().nextInt(4);
            if (a == 0) {
                listdark.add(new Peasent(getName(), j+1, 10));
            }
            if (a == 1) {
                listdark.add(new Monk(getName(), j+1, 10));
            }
            if (a == 2) {
                listdark.add(new Spearman(getName(), j+1, 10));
            }
            if (a == 3) {
                listdark.add(new Crossbowman(getName(), j+1, 10));
            }
            // listdark.get(j).y = j + 1;
        }

        // ArrayList<Character> allteams = new ArrayList<>(listdark);

        for (int i = 0; i < listlight.size(); i++) {
            allteams.add(listlight.get(i));

        }
       
        for (int i = 0; i < listdark.size(); i++) {
            allteams.add(listdark.get(i));

        }
       

        allteams.sort(new Comparator<Character>() {
            @Override
            public int compare(Character t0, Character t1) {
                if (t1.getSpeed() == t0.getSpeed()) {
                    return t1.getRange() - t0.getRange();
                }
                return t1.getSpeed() - t0.getSpeed(); // указывать в каком порядке(по какому принципу сортировать)
            }
        });

        System.out.println("\n");
        for (int i = 0; i < allteams.size(); i++) {
            System.out.println(allteams.get(i).About());
        }
        System.out.println("\n");
        
        

        while (true) {
            View.view();
            user_input.nextLine();
            for (Character character : allteams) {
                if (listlight.contains(character))
                    character.step(listlight, listdark);
                else
                    character.step(listdark, listlight);
            }
            // System.out.println("\n");
            // for (int i = 0; i < allteams.size(); i++) {
            //     System.out.println(allteams.get(i).About());
            // }
        }

        // добавить урон по наименьшему хп уже есть метод нужно пошаманить
    }
}
 