import java.awt.FlowLayout;
import java.awt.event.ActionListener;//waits for the user to commit action
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
  
class main{
  public static void main(String [] args){
          
    EventHandling x=new EventHandling();
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    x.setSize(350,150);
    x.setVisible(true);
  
  }
} 
class EventHandling extends JFrame{
    
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField pass;
    
    public EventHandling(){
      super("The Main Title");
      setLayout(new FlowLayout());
      
      item1=new JTextField(10); //10 is length
      add(item1);
      
      item2=new JTextField("What's Your Name?");
      add(item2);
      
      item3=new JTextField("Try Editing This!", 20);
      item3.setEditable(false); //Removes edit permissions
      add(item3);
    
    pass = new JPasswordField("mypass");
    add (pass);
    
    thehandler handler=new thehandler(); 
    
    item1.addActionListener(handler);
    item2.addActionListener(handler);
    item3.addActionListener(handler);
    pass.addActionListener(handler);
    
    
    }
    
    private class thehandler implements ActionListener{ //Implementations= Inherits everything of that class//since class is created inside another class, this class will have access to parent class
                  
      public void actionPerformed(ActionEvent event){
          String string="Hello!";
          
          if (event.getSource()==item1) //if item1 is clicked
        string=String.format("You Typed : %s", event.getActionCommand());
          else if(event.getSource()==item2) //if item2 is clicked
        string=String.format("Your Name Is : %s ? Got It!", event.getActionCommand());
          else if(event.getSource()==item3) //if item3 is clicked
        string=String.format("field 3: %s", event.getActionCommand());
          else if(event.getSource()==pass) //if pass is clicked
        string=String.format("Password! : %s", event.getActionCommand());
      
          JOptionPane.showMessageDialog(null, string);
    }
  }
}