package Unit;
public class Monk extends Character {
    int heal;
    String name;

    // public Monk(String name,String prof, int health, int mana, int damage, int armor, int range, int luck,
    //         int speed) {
    //     super(name,prof, health, mana,damage, armor, range, luck, speed);
        

    // }
    
    public Monk(String name) {
        super(25, 30, 5, 2, 3, 5, 8,name);
        this.name = name;
    }




    public int Heal(){
        return heal;
    }

    @Override
    public void Attack() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Die() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "I am Monk!";
    }
    
   
}
