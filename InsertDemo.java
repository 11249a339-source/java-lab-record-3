/* <applet code="InsertDemo" width=450 height=400> </applet> */ 
import java.awt.*;
import java.io.*;
import java.applet.*;

public class InsertDemo extends Applet {
    public void init() {
        // 1. Set the layout manager of the Applet to BorderLayout
        setLayout(new BorderLayout());
        
        // 2. Instantiate the ten buttons
        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J");
        
        // 3. Create sub-panels to hold multiple buttons for specific regions
        Panel northPanel = new Panel();
        northPanel.add(b1);
        northPanel.add(b2);
        
        Panel southPanel = new Panel();
        southPanel.add(b3);
        southPanel.add(b4);
        
        Panel centerPanel = new Panel();
        centerPanel.add(b5);
        centerPanel.add(b6);

        // 4. Add components directly to the 5 distinct BorderLayout zones
        add(northPanel, BorderLayout.NORTH);   // Top area
        add(southPanel, BorderLayout.SOUTH);   // Bottom area
        add(b7, BorderLayout.EAST);            // Right side
        add(b8, BorderLayout.WEST);            // Left side
        add(centerPanel, BorderLayout.CENTER);  // Middle area remaining
    }
}
