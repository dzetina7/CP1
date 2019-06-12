/**
 * Write a description of class LoopDrawing here.
 *
 * @author Devany Zetina
 * @version (1-23-19)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
	g2.setColor(Color.cyan);
        Ellipse2D.Double head = new Ellipse2D.Double(150, 50, 290, 100);
	g2.fill(head);
        Rectangle face = new Rectangle(235, 146, 125, 145);
		g2.draw(face);
                g2.fill(face);

        g2.setColor(Color.white);
        Ellipse2D.Double eye = new Ellipse2D.Double(260, 160, 30, 35);
           g2.draw(eye);
           g2.fill(eye);
           
            g2.setColor(Color.white);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(320, 160, 30, 35);
           g2.draw(eye2);
           g2.fill(eye2);
    
           g2.setColor(Color.black);
        Ellipse2D.Double pupil = new Ellipse2D.Double(265, 170, 20, 25);
           g2.draw(pupil);
           g2.fill(pupil);
        
           g2.setColor(Color.black);
        Ellipse2D.Double pupil2 = new Ellipse2D.Double(325, 170, 20, 25);
           g2.draw(pupil2);
           g2.fill(pupil2);
      
          g2.setColor(Color.cyan);
           Rectangle eyelid = new Rectangle(256, 149, 35, 25);
            g2.draw(eyelid);
            g2.fill(eyelid);
      
            g2.setColor(Color.cyan);
           Rectangle eyelid2 = new Rectangle(316, 149, 35, 25);
            g2.draw(eyelid2);
            g2.fill(eyelid2);

           g2.setColor(Color.cyan);
        Ellipse2D.Double mouth = new Ellipse2D.Double(200, 270, 200, 40);
	g2.fill(mouth);
        g2.draw(mouth);

       
        g2.setColor(Color.black);
           Rectangle lips = new Rectangle(235, 290, 140, 1);
            g2.draw(lips);
            g2.fill(lips);
       
         
       g2.setColor(Color.black);
        Ellipse2D.Double nose = new Ellipse2D.Double(280, 200, 40, 75);
           g2.draw(nose);

          
       g2.setColor(Color.gray);
        Ellipse2D.Double dot = new Ellipse2D.Double(200, 95, 3, 3);
           g2.draw(dot);
           g2.fill(dot);

          g2.setColor(Color.gray);
        Ellipse2D.Double dot2 = new Ellipse2D.Double(220, 80, 3, 3);
           g2.draw(dot2);
           g2.fill(dot2);

          g2.setColor(Color.gray);
        Ellipse2D.Double dot3 = new Ellipse2D.Double(250, 75, 3, 3);
           g2.draw(dot3);
           g2.fill(dot3);

      g2.setColor(Color.gray);
        Ellipse2D.Double dot4 = new Ellipse2D.Double(270, 87, 3, 3);
           g2.draw(dot4);
           g2.fill(dot4);
     
          g2.setColor(Color.gray);
        Ellipse2D.Double dot5 = new Ellipse2D.Double(300, 60, 3, 3);
           g2.draw(dot5);
           g2.fill(dot5);

          g2.setColor(Color.gray);
        Ellipse2D.Double dot6 = new Ellipse2D.Double(347, 65, 3, 3);
           g2.draw(dot6);
           g2.fill(dot6);

          g2.setColor(Color.gray);
        Ellipse2D.Double dot7 = new Ellipse2D.Double(330, 100, 3, 3);
           g2.draw(dot7);
           g2.fill(dot7);

  g2.setColor(Color.gray);
        Ellipse2D.Double dot8 = new Ellipse2D.Double(390, 75, 3, 3);
           g2.draw(dot8);
           g2.fill(dot8);
         





        
    }
}





         
        
           

                   







   	