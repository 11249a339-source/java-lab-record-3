Aim
    To write and execute a Java program using Applets and the Abstract Window Toolkit (AWT) graphics class to design and draw a human face shape utilizing geometric primitives like ovals, circles, and arcs.
    
Algorithm

• Step 1: Start the program and import the necessary functional libraries: java.awt.* for the geometric shapes and drawing tools, and java.applet.* to inherit the window containers.
• Step 2: Create a public class named face that extends the core Applet class structure.
• Step 3: Define the HTML embed configurations using custom multi-line comments (/* <applet code="face" width=300 height=300></applet> */) so the system execution environment sets up the appropriate output window dimensions.
• Step 4: Override the framework's default lifecycle method by implementing public void paint(Graphics g).
• Step 5: Render the base layout structures using outline commands:
	• Call g.drawOval(40, 40, 120, 150) to generate the main outer head silhouette.
	• Call g.drawOval(25, 92, 15, 30) and g.drawOval(160, 92, 15, 30) to frame the left and right ears on either side of the head.
• Step 6: Render the internal sensory features using filled and outlined shapes:
	• Call g.drawOval(57, 75, 30, 20) and g.drawOval(110, 75, 30, 20) to trace the outer eye outlines.
	• Call g.fillOval(68, 81, 10, 10) and g.fillOval(121, 81, 10, 10) to paint the solid, dark pupils centered inside both eyes.
• Step 7: Render the center details and smile using math coordinates:
	• Call g.fillOval(85, 100, 30, 30) to position a solid circular nose profile directly in the middle of the face canvas.
	• Call g.fillArc(60, 125, 80, 40, 180, 180) to build an upside-down arc boundary, establishing a smiling mouth curve at the base of the facial structure.
• Step 8: Terminate the graphics execution loop and display the compiled, rendered window directly to the user's terminal window platform.
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
• Visual Output Result:
A window opens displaying a complete line-art drawing of a human face centered on a white background:
	• Head: A large vertical oval outline forms the main shape of the face.
	• Eyes: Two medium oval outlines sit near the top, each containing a small, solid black circle (pupils) perfectly centered inside.
	• Nose: A solid black circle sits directly in the middle of the face.
	• Mouth: A wide, solid semi-circular arc curves upward at the bottom to form a distinct smile.
	• Ears: Two small vertical ovals touch the outer left and right edges of the main head shape.
