import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Checkerboard extends GraphicsProgram {

    private static final int NROWS = 8;

    private static final int NCOL = 8;

    // running the program

    public void run() {

        int sqSire = getHeight() / NROWS;

        for (int i = 0; i < NROWS; i++) {// loop counting all the rows now has another loop counting the columns in each row

            for (int j = 0; j < NCOL; j++) {
// now we need to know the x and y location of our boxes we want to draw
                int x = j * sqSire;// counts on the x axis,also depends on which column u are currently in,hence j.so,move over in the x direction j many squares
                int y = i * sqSire; // same as above. i row tells us how far down the screen we have to go to get the Y location of the square

                GRect sq = new GRect(x, y, sqSire, sqSire); //create a single box in a coordinate x,y and width and height
                sq.setFilled(((i + j) % 2) != 0); //a calculation in boolean to fill all odd boxes. 2 arguments and returns boolean

                add(sq);
            }
        }
    }

}

