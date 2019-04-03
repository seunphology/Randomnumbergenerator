import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class SimpleRaandom extends ConsoleProgram {

    private static final int NUM_SIDES = 6;

    public void run () {

        rgen.setSeed(1);

        int dieRoll = rgen.nextInt(1, NUM_SIDES);

        println("You rolled" + dieRoll);
    }

    private RandomGenerator rgen = RandomGenerator.getInstance();
}
