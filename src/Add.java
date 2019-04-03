import acm.program.ConsoleProgram;

public class Add extends ConsoleProgram {

    private static final int SENTINEL = 0;

    public void run () {

        int total = 0;

      /*  int val =  readInt("Enter Value: ");

        while (val!= SENTINEL) {
            total += val;
            val = readInt("Enter value:");

        } */
        while (true) {
            int val = readInt("Enter val:");

            if (val==SENTINEL) break;

            total+= val;


            println("Total = " + total);
        }
    }
}

