//****************************
//Evanna Wong A00807066 Set A 
//
//Face.java
//****************************

import javax.swing.JApplet;
import java.awt.*;

public class Face extends JApplet
{
 
    private static final long serialVersionUID = -5190522757226105480L;

    public void paint (Graphics page)
    {
        
     final int FACE_X_COORD = 100;
     final int FACE_Y_COORD = 100;
     final int FACE_WIDTH = 200;
     final int FACE_HEIGHT = 200; 
     
     final int LEFTEAR_X_COORD = 80;
     final int RIGHTEAR_X_COORD = 260;
     final int EAR_Y_COORD = 170;
     final int EAR_WIDTH = 60;
     final int EAR_HEIGHT = 70;
     
     final int LEFTEYE_X_COORD = 145;
     final int RIGHTEYE_X_COORD = 230;
     final int EYE_Y_COORD = 170;
     final int EYE_WIDTH = 25;
     final int EYE_HEIGHT = 25;
     
     final int LEFTPUPIL_X_COORD = 152;
     final int RIGHTPUPIL_X_COORD = 237;
     final int EYEPUPIL_Y_COORD = 178;
     final int PUPIL_WIDTH = 10;
     final int PUPIL_HEIGHT = 10;
     
     final int NOSE_X_COORD = 185;
     final int NOSE_Y_COORD = 200;
     final int NOSE_WIDTH = 30;
     final int NOSE_HEIGHT = 15;
     
     final int MOUTH_X_COORD = 150;
     final int MOUTH_Y_COORD = 200;
     final int MOUTH_WIDTH = 100;
     final int MOUTH_HEIGHT = 70;
     final int MOUTH_START_ANGLE = 180;
     final int MOUTH_ARC_ANGLE = 180;
     
     
     //Draw the Face and Ears
     page.setColor (Color.orange); 
     page.fillOval (FACE_X_COORD, FACE_Y_COORD, FACE_WIDTH, FACE_HEIGHT);
     
     page.fillOval (LEFTEAR_X_COORD, EAR_Y_COORD, EAR_WIDTH, EAR_HEIGHT);
     page.fillOval (RIGHTEAR_X_COORD, EAR_Y_COORD, EAR_WIDTH, EAR_HEIGHT);
     
     //Draw the Eyes
     page.setColor (Color.white);
     page.fillOval (LEFTEYE_X_COORD,EYE_Y_COORD,EYE_WIDTH,EYE_HEIGHT);
     page.fillOval (RIGHTEYE_X_COORD,EYE_Y_COORD,EYE_WIDTH,EYE_HEIGHT);
     
     //Draw the Pupils
     page.setColor (Color.black);
     page.fillOval (LEFTPUPIL_X_COORD,EYEPUPIL_Y_COORD,PUPIL_WIDTH,PUPIL_HEIGHT);
     page.fillOval (RIGHTPUPIL_X_COORD,EYEPUPIL_Y_COORD,PUPIL_WIDTH,PUPIL_HEIGHT);
    
     //Draw the Nose
     page.setColor (Color.black);
     page.fillOval (NOSE_X_COORD,NOSE_Y_COORD,NOSE_WIDTH,NOSE_HEIGHT);
     
     //Draw the Mouth
     page.drawArc (MOUTH_X_COORD,MOUTH_Y_COORD,MOUTH_WIDTH,MOUTH_HEIGHT,MOUTH_START_ANGLE,MOUTH_ARC_ANGLE);
     }
    
    
}