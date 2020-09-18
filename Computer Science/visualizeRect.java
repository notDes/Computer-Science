import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class visualizeRect
{
   public static void main(String[] args)
   {
      // Construct a frame and show it
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

      // Your work goes here: Construct a rectangle and set the frame bounds

      Rectangle rect = new Rectangle(10, 20, 30 , 40);

      frame.setBounds(rect);


      JOptionPane.showMessageDialog(frame, "Click OK to continue");

      // Your work goes here: Move the rectangle and set the frame bounds again

      rect.translate(70, 80);
      frame.setBounds(rect);
   }
}

