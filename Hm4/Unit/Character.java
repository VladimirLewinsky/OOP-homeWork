package Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

// сделать именна для всех, добавить интерфейс (час:10), добавить абстрактный класс
public abstract class Character extends Vektor2d implements GameInterface {
    // Имя Здоровье Мана Выносливость Урон Защита ДальностьАтаки Удача Скорость
    //

    String name;

    int maxhealth;
    int currenthelth;
    int mana;
    int armor;
    int range;
    int luck;
    int speed;
    int attack;
    int[] damage;
    protected Vektor2d coords;
    // int x;
    // int y;

    public Character(String name, int maxhealth, int currenthelth, int mana, int armor, int range,
            int luck, int speed, int attack, int[] damage, int x, int y) {
        super(x, y);
        coords = new Vektor2d(x, y);
        this.name = name;
        this.maxhealth = maxhealth;
        this.currenthelth = currenthelth;
        this.mana = mana;
        this.armor = armor;
        this.range = range;
        this.luck = luck;
        this.speed = speed;
        this.attack = attack;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    /*
     * добавить вывод массива дамаг
     */
    public String About() {

        return String.format(
                "currenthealth %d;maxhealth %d; mana: %d; attack %d;armor: %d; range: %d; luck: %d; speed: %d; name: %s; x: %d, y: %d",
                currenthelth, maxhealth, mana, attack, armor, range, luck, speed, name, x, y);
    }

    //
    // public <T> void Mystep(List <T> list1, List <T> list2) {
    // // TODO Auto-generated method stub}

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "";
    }

    @Override
    public void step(ArrayList<Character> lightteam, ArrayList<Character> darkteam) {

        return;
    }

    public abstract Integer Attack(ArrayList<Character> enemy, int index);

    public abstract void Die();

    public int getSpeed() {
        return speed;
    }

    public int getRange() {
        return range;
    }

    public int findNearest(ArrayList<Character> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }

        }
        return index;
    }

}
