// *************************************************************
// Evanna Wong A00807066 Set A  
//
//Colors.java
// Draw rectangles to illustrate colors and their codes in Java
// *************************************************************
import javax.swing.JApplet;
import java.awt.*;

public class ColorsEx extends JApplet
{

    private static final long serialVersionUID = 7538215590166029506L;

    public void paint (Graphics page)
    {
    
        // Declare size constants
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;
    
        // Declare variables
        int x, y; // x and y coordinates of upper left-corner of each shape
        int width, height; // width and height of each shape
        final int TEXT_X_COORD = 230;
        final int RED_Y_COORD = 190;
        final int GREEN_Y_COORD = 210;
        final int BLUE_Y_COORD = 230;
             
        Color myColor = new Color (2486921);
        
        int redCode = myColor.getRed();
        int greenCode = myColor.getGreen();
        int blueCode = myColor.getBlue();
        
        // Set the background color and paint the screen with a white rectangle
        setBackground (Color.white);
        page.setColor(Color.white);
        page.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);
    
        // Set the color for the rectangle
        page.setColor (myColor);
    
        // Assign the corner point and width and height then draw
        x = 200;
        y = 125;
        width = 200;
        height = 150;
        page.fillRect(x, y, width, height);
        
        //Set color for text and then print color codes
        page.setColor (Color.black);
        page.drawString ("Red: " + redCode, TEXT_X_COORD,RED_Y_COORD);
        page.drawString ("Green: " + greenCode, TEXT_X_COORD, GREEN_Y_COORD);
        page.drawString ("Blue: " + blueCode, TEXT_X_COORD, BLUE_Y_COORD);
    }
}