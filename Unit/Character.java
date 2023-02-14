package Unit;

import java.util.jar.Attributes.Name;

public class Character {
    // Имя Здоровье Мана Выносливость Урон Защита ДальностьАтаки Удача Скорость
    //
    String name;
    String prof;
    int health;
    int mana;
    int damage;
    int armor;
    int range;
    int luck;
    int speed;

    public Character(String name, String prof, int health, int mana, int damage, int armor, int range, int luck,
            int speed) {
        this.name = name;
        this.prof = prof;
        this.health = health;
        this.mana = mana;

        this.damage = damage;
        this.armor = armor;
        this.range = range;
        this.luck = luck;
        this.speed = speed;
    }

    public String getInfo() {

        return String.format(
                "name: %s; prof: %s; health %d; mana: %d; damage %d; armor: %d; range: %d; luck: %d; speed: %d", name,
                prof, health, mana, damage, armor, range, luck, speed);
    }

    public int Attack() {

        return this.damage -this.armor ;

    }
}
