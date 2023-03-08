package Unit;

import java.util.ArrayList;

public interface GameInterface {
    

    void step(ArrayList<Character> lightteam, ArrayList<Character> darkteam);
    String getInfo();
    
}
