import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sonai extends JFrame implements ActionListener
{
JLabel Username = new JLabel("Username: ");
JLabel Password = new JLabel("Password: ");

JTextField usert = new JLabel("");
JTextField passt = new JLabel("");

JButton Submit = new JButton("Submit");
}

Public void Sonai()
{
 Username.setBounds(10,20, 130,30);
 password.setBounds(10,55, 130,30);
 usert.setBounds(150,20, 240,30);
 passt.setBounds(150,55, 240,30);
 Submit.setBounds(150,65,100,30);
  
  add(Username);
  add(Password);
  add(usert);
  add(Passt);
  add(Submit);
}

public static void main(String args[])
{
Sonai SC = new Sonai();
  SC.setSize(400,100);
  SC.setVisible(true);
  SC.setLayout(null);
}
