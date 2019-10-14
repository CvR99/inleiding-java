package H5;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    //Variabelen Declareren
    int valeriegewicht;
    int hansgewicht;
    int jeroengewicht;
    int Xmas;

    public void init() {

        // Variabelen Initialiseren
        setSize(400,400);
        Xmas = 350;
        valeriegewicht = 40;
        hansgewicht = 80;
        jeroengewicht = 100;

    }

    public void paint(Graphics g) {

        //Verticale As
        g.drawLine(50,50,50, Xmas);
        //Horizontale As
        g.drawLine(50, Xmas, Xmas, Xmas);

        // Tekenen van de staven
        //1. Valerie
        g.setColor(Color.CYAN);
        g.fillRect(50, Xmas - valeriegewicht, 80, valeriegewicht);
        //2. Hans
        g.setColor(Color.ORANGE);
        g.fillRect(160, Xmas - hansgewicht,80, hansgewicht);
        //3. Jeroen
        g.setColor(Color.pink);
        g.fillRect(270, Xmas - jeroengewicht,80, jeroengewicht);

        // Gewichten
        g.setColor(Color.black);
        g.drawString("20KG",15,335);
        g.drawString("40KG",15,315);
        g.drawString("60KG",15,295);
        g.drawString("80KG",15,275);
        g.drawString("100KG",8,255);
        //Namen
        g.drawString("Valerie",70,365);
        g.drawString("Hans",185,365);
        g.drawString("Jeroen",290,365);


    }
}
