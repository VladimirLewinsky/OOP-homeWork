package Unit;

import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes.Name;

// сделать именна для всех, добавить интерфейс (час:10), добавить абстрактный класс
public abstract class Character implements GameInterface {
    // Имя Здоровье Мана Выносливость Урон Защита ДальностьАтаки Удача Скорость
    //

    String name;

    int maxhealth;
    int currenthelth;
    int mana;
    int damage;
    int armor;
    int range;
    int luck;
    int speed;
    int attack;
    int mindamage;
    int maxdamage;

    int x;
    int y;

    // public static int manCnt - означает, что метод будет один и общий для всех
    // наследников пример Character.manCnt
    // конструктор ничего не возвращает

    public Character(int currenthelth, int maxhealth, int mana, int attack, int mindamage, int maxdamage, int armor,
            int range, int luck,
            int speed, String name) {
        // this передает значение поля каторое объявле но в классе

        this.maxhealth = maxhealth;
        this.currenthelth = currenthelth;
        this.mana = mana;
        this.armor = armor;
        this.range = range;
        this.luck = luck;
        this.speed = speed;
        this.name = name;
        this.attack = attack;
        this.mindamage = mindamage;
        this.maxdamage = maxdamage;
    }

    /*
     * добавить мин дмг макс дмг, и хп
     */
    public String About() {

        return String.format(
                "currenthealth %d;maxhealth %d; mana: %d; attack %d; mindamage %d; maxdamage %d; armor: %d; range: %d; luck: %d; speed: %d; name: %s",
                currenthelth,maxhealth, mana, attack, mindamage, maxdamage, armor,  range, luck, speed, name);
    }

    // @Override
    // public int compare(Character o1, Character o2) {

    // return Integer.compare(o1.speed, o2.speed);
    // }

    // public int compareTo(Character o) {
    // if (this.speed > o.speed)
    // return 1;
    // else if (this.speed < o.speed)
    // return -1;
    // else
    // return 0;
    // }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "";
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub

    }

    public abstract void Attack();

    public abstract void Die();

    public int getSpeed() {
        return speed;
    }

    public int getRange() {
        return range;
    }

}
