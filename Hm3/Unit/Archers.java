package Unit;



public class Archers extends Character {
    int shot;

    public Archers(int currenthelth, int maxhealth, int mana, int attack, int mindamage, int maxdamage, int armor,
            int range, int luck, int speed, String name, int shot) {
        super(currenthelth, maxhealth, mana, attack, mindamage, maxdamage, armor, range, luck, speed, name);
        this.shot = shot;
    }
    

    @Override
    public void Attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Attack'");
    }

    @Override
    public void Die() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Die'");
    }

    public String About() {

        return String.format(
            "currenthealth %d;maxhealth %d; mana: %d; attack %d; mindamage %d; maxdamage %d; armor: %d; range: %d; luck: %d; speed: %d; name: %s; shot: %d",
                currenthelth, maxhealth, mana, attack, mindamage, maxdamage, armor,  range, luck, speed, name,shot);
    }
   

   
    
}
