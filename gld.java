/*

Aim

To write a Java program using Applets and the Abstract Window Toolkit (AWT) layout managers to arrange ten interactive button components in a structured GridLayout framework containing 5 rows and 2 columns.

 Algorithm

• Step 1: Start the application and import the essential layout containers (java.awt.* and java.applet.*).
• Step 2: Create a public class named gld that extends the base Applet panel system.
• Step 3: Embed the HTML applet parameters via top-level comments to configure a 400x400 canvas interface layout.
• Step 4: Override the lifecycle routine by initializing the applet state inside the public void init() container block.
• Step 5: Activate the matrix structure by invoking setLayout(new GridLayout(5, 2)) to split the window into ten equal tiles.
• Step 6: Instantiate the interface items by allocating memory for ten unique clickable objects (new Button("A") through new Button("J")).
• Step 7: Inject the components sequentially into the active viewport layout frame using structural add() append updates.
• Step 8: Stop the configuration process loop and display the complete grid matrix directly inside your running viewer interface window.

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

. Grid Layout Applet (gld.java)

• Execution Command: appletviewer gld.java
• Visual Output Result:
A highly structured, uniform grid user interface splits the window evenly:
	• The window is divided into a clean matrix of 5 rows and 2 columns.
	• 10 equal-sized interactive buttons stretch automatically to fill every bit of available space.
	• The buttons are arranged horizontally in pairs: Row 1 displays [ A ] [ B ], Row 2 displays [ C ] [ D ], Row 3 displays [ E ] [ F ], Row 4 displays [ G ] [ H ], and Row 5 displays [ I ] [ J ].
