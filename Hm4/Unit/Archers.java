package Unit;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import javax.swing.text.AbstractDocument.BranchElement;

public abstract class Archers extends Character {
    int shot;

    public Archers(String name, int maxhealth, int currenthelth, int mana, int armor, int range, int luck, int speed,
            int attack, int[] damage, int x, int y, int shot) {
        super(name, maxhealth, currenthelth, mana, armor, range, luck, speed, attack, damage, x, y);
        this.shot = shot;
    }

    @Override
    public Integer Attack(ArrayList<Character> enemy, int index) {

        Integer newdamage;
        int uron = this.attack - enemy.get(index).armor;
        if (uron >= 0) {
            newdamage = this.damage[1];
        } else {
            newdamage = this.damage[0];
        }

        return enemy.get(index).currenthelth - newdamage;

    }

    public boolean findPeasent(ArrayList<Character> team) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getClass() == Peasent.class) {
                index = i;
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else
            return false;
    }

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> enemyteam) {
        int index = super.findNearest(enemyteam);

        if (shot > 0) {
            Attack(enemyteam, index);
            findPeasent(team);
            if (findPeasent(team) == true) {
                return;
            } else {
                this.shot = this.shot - 1;
            }
        }

        if (this.currenthelth == 0 | this.shot == 0)
            return;

    }

    @Override
    public String About() {
        // TODO Auto-generated method stub
        return String.format(
                "currenthealth %d;maxhealth %d; mana: %d; attack %d;armor: %d; range: %d; luck: %d; speed: %d; name: %s; x: %d, y: %d; shot: %d",
                currenthelth, maxhealth, mana, attack, armor, range, luck, speed, name, x, y, shot);
    }

    // @Override
    // public void Die() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'Die'");
    // }

}
