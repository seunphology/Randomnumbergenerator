import acm.program.ConsoleProgram;

import acm.util.*;


public class SimpleRandom extends ConsoleProgram {
//Numnber of sides of each die
    private static final int NUM_SIDES = 6;

    public void run() {
        int numDice = rgen.nextInt(1,6);
        int maxRoll = numDice*NUM_SIDES;
         int numRolls = 0;

         while (true){
             int roll = rollDice(numRolls);
             numRolls++;
             if (roll==maxRoll) break ;
             println("Rolled" + roll);
         }

        println("Rolled" + maxRoll + "after" + numRolls + "rolls");
    }
// returns the total number of rolling numDice dice


private int rollDice(int numDice) { /* notice numDice is showing up here again. it can be used because its a copy of the above
that is being used as a parameter here.Another thing that gives us right is if we declare it in this method as a local variable.
Another is if it is designed as an instance of our object..which is found at the end of every java code..but inside the class.
Instance variables (and constants) can be used at anytime and in any method inside the class...funky name for them is global variable.
*/
        int total = 0;
         for (int i=0; i<numDice; i++) {
             total += rgen.nextInt(1, NUM_SIDES); // the constant NUM_SIDES here is applied because constants are also a form of instance variable
         }
         return total;
}
    // private instance variable (not in any method..but inside a class.

      private RandomGenerator rgen = RandomGenerator.getInstance();
}
