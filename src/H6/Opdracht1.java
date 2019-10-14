package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double a, uitkomst;

    public void init() {
        a = 113;
        uitkomst = a / 4;
        uitkomst *=10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

    }

    public void paint(Graphics g){

        g.drawString("De uitkomst is: " + uitkomst,20,20);
        // Verdeling
        g.drawString("Jan: €28,20",20,40);
        g.drawString("Ali: €28,20",20,60);
        g.drawString("Jeanette: €28,20",20,80);
        g.drawString("Celine: €28,20",20,100);

    }

}