/* <applet code="gld" width=400 height=400> </applet> */ // Added the missing applet tag
import java.awt.*;
import java.io.*;
import java.applet.*;

public class gld extends Applet {
    public void init() {
        // Sets a grid layout with 5 rows and 2 columns
        setLayout(new GridLayout(5, 2));
        
        // Fixed button instantiations (added 'new' keyword and space)
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
        
        // Adds the buttons sequentially into the grid layout
        add(b1); add(b2); add(b3); add(b4); add(b5);
        add(b6); add(b7); add(b8); add(b9); add(b10);
    }
}
