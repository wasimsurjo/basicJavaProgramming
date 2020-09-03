import java.awt.FlowLayout;    //import default layout how everything is placed
import javax.swing.JFrame;     //basic window import
import javax.swing.JLabel;      //allows us import texts & images

class GuiJ extends JFrame{
  private JLabel item1;
  
  public GuiJ() {
    super("The Main Title");           //Main Title
    setLayout(new FlowLayout());  //Gives us default layout
  
    item1= new JLabel(" Hey, There!");
    item1.setToolTipText("This is pop up!");
   add(item1);
    }
  }