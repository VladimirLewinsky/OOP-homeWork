package Unit;

import java.util.jar.Attributes.Name;
// сделать именна для всех, добавить интерфейс (час:10), добавить абстрактный класс
public abstract class  Character implements GameInterface {
    // Имя Здоровье Мана Выносливость Урон Защита ДальностьАтаки Удача Скорость
    //
    
    String name;
    int health;
    int mana;
    int damage;
    int armor;
    int range;
    int luck;
    int speed;
    //  public static int manCnt - означает, что метод будет один и общий для всех наследников пример Character.manCnt
    // конструктор ничего не возвращает
    public Character( int health, int mana, int damage, int armor, int range, int luck, 
            int speed,String name) {
         // this передает значение поля каторое объявле но в классе
        
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.armor = armor;
        this.range = range;
        this.luck = luck;
        this.speed = speed;
        this.name = name;
    }

    public String About() {

        return String.format(
                "health %d; mana: %d; damage %d; armor: %d; range: %d; luck: %d; speed: %d; name: %s",
                 health, mana, damage, armor, range, luck, speed, name);
    }

    public abstract void Attack();


    public abstract void Die();

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "";
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        
    }

    

    
}
