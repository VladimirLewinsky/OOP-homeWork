package Unit;

public class Sniper extends Archers {
    int crit;
    String name;

  

    public Sniper(String name, int x, int y) {
        super(name,15, 15, 0, 12, 9, 10, 5, 8, new int []{8,10},  x, y, 32);
        this.name = name;
    }

    

    public int Crit() {
        return 0;
    }

   
    
    @Override
    public void Die() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "I am Sniper!";
    }

}
