import javax.swing.text.html.HTMLDocument;

import Unit.Crossbowman;
import Unit.Monk;
import Unit.Peasent;
import Unit.Rogue;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Wizzard;

public class main {
    public static void main(String[] args) {
        
        Rogue rogue = new Rogue("Jon","Rogue", 45, 15, 15, 5, 1, 10, 15);
        Monk monk = new Monk("Ted","Monk", 25, 30, 5, 2, 3, 5, 8);
        Crossbowman crossbowman = new Crossbowman("Gari","Crossbowman", 32, 10, 10,  3, 4, 3, 10);
        Wizzard wizzard = new Wizzard("Amadeus","Wizzard", 25, 40, 5, 3, 4, 9, 9);
        Sniper sniper = new Sniper("Logan","Sniper", 20, 15, 12, 3, 5, 10, 14);
        Spearman spearman = new Spearman("Gustaf","Spearman", 50, 10, 10, 7, 1, 2, 6);
        Peasent peasent = new Peasent("Bob","Peasent", 30, 10, 3, 1, 1, 1, 8);
        
        System.out.println(rogue.getInfo());
        System.out.println(rogue.Attack());
    }
}