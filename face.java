import java.awt.*;
import java.io.*;
import java.applet.*; // 1. Fixed package name

/* <applet code="face" height=300 width=300> </applet> */ // 2. Fixed syntax and class name

public class face extends Applet { // 3. Filename must be face.java
    public void paint(Graphics g) {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20); // 4. Removed duplicate comma and empty argument
        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);
        g.fillOval(85, 100, 30, 30);
        g.fillArc(60, 125, 80, 40, 180, 180);
        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
