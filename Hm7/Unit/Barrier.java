package Unit;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Barrier {
    protected Vektor2d coords;
    protected String barrieraEmodji;

    public String getBarrieraEmodji() {
        return barrieraEmodji;
    }

    public Barrier(Vektor2d coords) {

        this.coords = coords;
        this.barrieraEmodji = getEmodjiBarrier();
    }
    protected String getEmodjiBarrier() {
        List<String> strBarrier = Arrays.asList("🗿", "🪵", "🪨");
        return strBarrier.get(new Random().nextInt( 3));
    }
    public int[] getCoords() { return new int[]{coords.x, coords.y};}

}
