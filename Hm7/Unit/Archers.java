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

    // @Override
    // public Integer attack(ArrayList<Character> enemy, int index) {

    // Integer newdamage;
    // int uron =enemy.get(index).armor - this.attack;
    // if (uron >= 0) {
    // newdamage = this.damage[1];
    // } else {
    // newdamage = this.damage[0];
    // }

    // return enemy.get(index).currenthelth - newdamage;

    // }

    @Override
    public void attack(float damage) {
        // TODO Auto-generated method stub
        super.attack(damage);
    }

    // public boolean findPeasent(ArrayList<Character> team) {

    // int count = 0;
    // for (int i = 0; i < team.size(); i++) {
    // if (team.get(i) instanceof Unit.Peasent) {
    // team.get(i).state = "Busy";
    // count++;
    // }
    // }
    // if (count > 0) {
    // return true;
    // } else
    // return false;
    // }

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> enemyteam) {

        if (state.equals("Die") || shot <= 0) {

            shot = 0;
            return;
        }

        int index = super.findNearest(enemyteam);
        int mindamage = damage[0];
        int maxdamage = damage[1];
        float damage = (enemyteam.get(index).armor - attack > 0) ? mindamage
                : (enemyteam.get(index).armor - attack < 0) ? maxdamage
                        : (mindamage + maxdamage) / 2;

        enemyteam.get(index).attack(damage);

        for (int i = 0; i < team.size(); i++) {
            if (team.get(i) instanceof Unit.Peasent && team.get(i).state.equals("Stand")) {
                team.get(i).state = "Busy";
                shot++;
                return;

            }

            shot--;
        }

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
