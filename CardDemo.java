/* <applet code="CardDemo" width=400 height=400> </applet> */ 
import java.awt.*;
import java.io.*;
import java.applet.*;
import java.awt.event.*; 

public class CardDemo extends Applet implements ActionListener {
    CardLayout cards; 

    public void init() {
        // Initialize CardLayout and assign it to the applet container
        cards = new CardLayout();
        setLayout(cards);
        
        // Instantiate the buttons
        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J (Click to reset)");
        
        // Attach click event listeners to the buttons
        b1.addActionListener(this); b2.addActionListener(this); 
        b3.addActionListener(this); b4.addActionListener(this); 
        b5.addActionListener(this); b6.addActionListener(this); 
        b7.addActionListener(this); b8.addActionListener(this); 
        b9.addActionListener(this); b10.addActionListener(this);
        
        // Add the buttons as unique "cards" using identification strings
        add("CardA", b1); add("CardB", b2); add("CardC", b3);
        add("CardD", b4); add("CardE", b5); add("CardF", b6);
        add("CardG", b7); add("CardH", b8); add("CardI", b9);
        add("CardJ", b10);
    }

    // Code logic to switch between cards when clicked
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().startsWith("J")) {
            cards.first(this); // Reset and go back to Button A
        } else {
            cards.show(this, "CardJ"); // Jump directly to show Button J
        }
    }
}
