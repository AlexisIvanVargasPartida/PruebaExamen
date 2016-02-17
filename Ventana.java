import javax.swing.*;
import java.awt.*;

public class  Ventana extends JFrame{
 
 JLabel username=new JLabel("Username: ");
 JTextField cajaTexto1=new JTextField(17);
 JLabel password=new JLabel("Password: ");
 JPasswordField cajaTexto2=new JPasswordField(17);
 JButton cancel=new JButton("Cancel");
 JButton ok=new JButton("Ok");

 Ventana(){
 this.setLayout(new FlowLayout());
 add(username);
 add(cajaTexto1);
 add(password);
 add(cajaTexto2);
 add(cancel);
 add(ok);

setTitle("Login");
  setSize(300,300);
setVisible(true);
}
public static void main(String []args){
  new Ventana ();
  }
 }

