//****************************
//Evanna Wong A00807066 Set A 
//
//PieChart.java
//****************************

import javax.swing.JApplet;
import java.awt.*;

public class PieChart extends JApplet
{
 
    private static final long serialVersionUID = -5190522757226105480L;

    public void paint (Graphics page)
    {
          
    final int X_COORD = 200;
    final int Y_COORD = 200;
    
    //Declare variables
    final int RENT_AND_UTIL_WIDTH = 200;
    final int RENT_AND_UTIL_HEIGHT = 200;
    final int RENT_AND_UTIL_START_ANGLE = 0;
    final int RENT_AND_UTIL_ARC_ANGLE = 126; 
    final int RENT_AND_UTIL_TEXT_X = 320;
    final int RENT_AND_UTIL_TEXT_Y = 200;
    
    final int TRANSPORTATION_WIDTH = 200;
    final int TRANSPORTATION_HEIGHT = 200;
    final int TRANSPORTATION_START_ANGLE = 126;
    final int TRANSPORTATION_ARC_ANGLE = 54;
    final int TRANSPORTATION_TEXT_X = 130;
    final int TRANSPORTATION_TEXT_Y = 250;        
            
    final int FOOD_WIDTH = 200;
    final int FOOD_HEIGHT = 200;
    final int FOOD_START_ANGLE = 180;
    final int FOOD_ARC_ANGLE =54;
    final int FOOD_TEXT_X = 170;
    final int FOOD_TEXT_Y = 360;        
    
    final int EDUCATION_WIDTH = 200;
    final int EDUCATION_HEIGHT = 200;
    final int EDUCATION_START_ANGLE = 234;
    final int EDUCATION_ARC_ANGLE = 90;
    final int EDUCATION_TEXT_X = 300;
    final int EDUCATION_TEXT_Y = 420;
    
    final int MISCELLANEOUS_WIDTH = 200;
    final int MISCELLANEOUS_HEIGHT = 200;
    final int MISCELLANEOUS_START_ANGLE = 324;
    final int MISCELLANEOUS_ARC_ANGLE = 36;
    final int MISCELLANEOUS_TEXT_X = 400;
    final int MISCELLANEOUS_TEXT_Y = 340;
               
    //Draw Rent and Utilities: 35%
    page.setColor (Color.pink);
    page.fillArc (X_COORD,Y_COORD,RENT_AND_UTIL_WIDTH,RENT_AND_UTIL_HEIGHT, RENT_AND_UTIL_START_ANGLE, RENT_AND_UTIL_ARC_ANGLE);
    page.drawString ("Rent and Utilities",RENT_AND_UTIL_TEXT_X,RENT_AND_UTIL_TEXT_Y);
    
    //Draw Transportation: 15%
    page.setColor (Color.blue);
    page.fillArc (X_COORD,Y_COORD,TRANSPORTATION_WIDTH,TRANSPORTATION_HEIGHT,
            TRANSPORTATION_START_ANGLE,TRANSPORTATION_ARC_ANGLE);
    page.drawString ("Transportation",TRANSPORTATION_TEXT_X,TRANSPORTATION_TEXT_Y);
    
    //Draw Food: 15%
    page.setColor (Color.orange);
    page.fillArc (X_COORD,Y_COORD,FOOD_WIDTH,FOOD_HEIGHT,FOOD_START_ANGLE,FOOD_ARC_ANGLE);
    page.drawString ("Food",FOOD_TEXT_X,FOOD_TEXT_Y);
   
    //Draw Educational: 25%
    page.setColor (Color.black);
    page.fillArc (X_COORD,Y_COORD,EDUCATION_WIDTH,EDUCATION_HEIGHT,EDUCATION_START_ANGLE,EDUCATION_ARC_ANGLE);
    page.drawString ("Education",EDUCATION_TEXT_X,EDUCATION_TEXT_Y);
    
    //Draw Miscellaneous: 10%
    page.setColor (Color.red);
    page.fillArc (X_COORD,Y_COORD,MISCELLANEOUS_WIDTH,MISCELLANEOUS_HEIGHT, + 
            MISCELLANEOUS_START_ANGLE,MISCELLANEOUS_ARC_ANGLE);
    page.drawString ("Miscellaneous",MISCELLANEOUS_TEXT_X,MISCELLANEOUS_TEXT_Y);
   
    } 
}    