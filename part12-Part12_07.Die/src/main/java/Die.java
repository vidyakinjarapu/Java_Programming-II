
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
        // Initialize the value of numberOfFaces here
        //hey its me
    }

    public int throwDie() {
        int numSelected = 0;
        Random rand = new Random();
        numSelected = rand.nextInt(this.numberOfFaces) + 1  ;
        return numSelected;
    }
}
