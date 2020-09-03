import javax.swing.JOptionPane;


class GUI {
  public static void main (String [] args){
  
   String x= JOptionPane.showInputDialog("Enter First Number");
   String y= JOptionPane.showInputDialog("Enter Second Number");
  
    int a= Integer.parseInt(x);
    int b= Integer.parseInt(y);
    int c= a+b;
    
    JOptionPane.showMessageDialog(null, "The Answer Is " +c+"!!", "The Sum", JOptionPane.PLAIN_MESSAGE);
  }  
}