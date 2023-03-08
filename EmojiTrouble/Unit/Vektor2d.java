package Unit;

import java.util.ArrayList;

public class Vektor2d {

    public int x;
    public  int y;

    public Vektor2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getX() {

    }

    void gety() {

    }

    public double getDistance(Vektor2d enemy){
        
        return Math.sqrt(Math.pow(x - enemy.x,2) + Math.pow(y - enemy.y,2));
    }

}
