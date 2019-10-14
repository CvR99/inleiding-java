package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int a, b, c, uitkomst, uitkomstb, uitkomstc;



    public void init() {
        a = 60 * 60;
        b = a* 24;
        c = b* 365;
        uitkomst = a;
        uitkomstb = b;
        uitkomstc = c;


    }

    public void paint(Graphics g) {


        g.drawString("Seconden in een uur " + uitkomst,50,50);
        g.drawString("Seconden in een dag " + uitkomstb, 50,80);
        g.drawString("Seconden in een jaar " + uitkomstc,50,110);

    }
}