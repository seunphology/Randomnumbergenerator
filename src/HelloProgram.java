
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;


public class HelloProgram extends GraphicsProgram  {
    public void run () {
        GLabel label = new GLabel("Cindy und Salu's Tandem Program", 300, 75);
        label.setFont("SansSerif= 80");
        label.setColor(Color.BLUE);
        add(label);


            GRect rectangle1 = new  GRect(10,10, 50, 50);
            rectangle1.setColor(Color.blue);
            rectangle1.setFillColor(Color.red);

            add(rectangle1);

            GRect rectangle2 = new GRect(300,75,200,100);
            rectangle2.setFilled(true);
            rectangle2.setColor(Color.RED);

            add(rectangle2);

            GOval ova = new GOval(300, 75, 200,100);
            ova.setFilled(true);
            ova.setColor(Color.green);

            add(ova);

            GLine myfunkyline = new GLine(0,0,100,100);

            add(myfunkyline);

        }


}

