import javax.swing.JOptionPane;
public class review
{
  public static void main(String[] args)
  {
      String name = JOptionPane.showInputDialog("What is your name?");
      JOptionPane.showInputDialog("Hello " + name + "!");
      JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
      JOptionPane.showInputDialog("I'm Sorry, " + name + " I'm afraid I can't do that!");




  }
}



/*
E1.17: Modify the program from E1.16 so that the dialog continues with the message “My name is Hal! What would you like me to do?” Discard the user’s input and display a message such as
I'm sorry, Dave. I'm afraid I can't do that.
Replace Dave with the name that was provided by the user.
*/