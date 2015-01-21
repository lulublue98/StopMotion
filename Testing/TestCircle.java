import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
 
public class drawCircle {

    private void drawCircle(int x, int y, int radius)
    {
        drawOval(x - radius, y - radius, radius*2, radius*2);
    }
}
    /*
 
  public void paint(Graphics g) {
     Graphics2D ga = (Graphics2D)g;
     ga.setPaint(Color.red);
     ga.drawOval(150,150,100,100);
  }
               
  public static void main(String args[]) 
  {
      TestCircle frame = new TestCircle();       
      frame.addWindowListener(
      new WindowAdapter()
      {
         public void windowClosing(WindowEvent we)
         {
            System.exit(0);
         }
      }
      );
            
      frame.setSize(400, 400);
      frame.setVisible(true);
   }
}
*/
