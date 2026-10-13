/* <applet code="linrect" width=400 height=400> </applet> */ 
import java.awt.*;
import java.io.*;
import java.applet.*;

public class linrect extends Applet {
    public void paint(Graphics g) {
        // Draws a basic diagonal line
        g.drawLine(10, 10, 50, 50);
        
        // Draws an empty rectangle outline
        g.drawRect(10, 60, 40, 30);
        
        // Draws a filled solid rectangle (shifted to x=70 so it doesn't overlap)
        g.fillRect(70, 10, 30, 80); 
        
        // Draws an empty rounded rectangle outline
        g.drawRoundRect(10, 100, 80, 50, 10, 10);
        
        // Draws a smaller filled rounded rectangle inside the outline above
        g.fillRoundRect(20, 110, 60, 30, 5, 5);
        
        // Draws the final diagonal line with both required endpoint coordinates
        g.drawLine(100, 10, 230, 50); 
    }
}
