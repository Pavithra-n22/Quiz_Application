
package quiz_applicationpavi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author pavit
 */

public class login extends JFrame implements ActionListener{
    JButton rules, back ;
    JTextField tfname;
    login()
    {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images/download1.jpg"));   
        JLabel image= new JLabel(i1);
        image.setBounds(0,0,600 ,450);
        add(image);
        JLabel heading = new JLabel("simple minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 45));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.BLUE);
        add(name);
        
         tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
         rules= new JButton("RULES");
         
         rules.setBounds(735,270, 120, 25);
         rules.setBackground(Color.BLUE);
         rules.addActionListener(this);
         add(rules);
         
          back= new JButton("Back");
         back.setBounds(915,270, 120, 25);
         back.setBackground(Color.BLUE);
         back.addActionListener(this);
         add(back);
         
         
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);// bydefault it will false
        
    }
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()== rules)  
      {    String name=tfname.getText();
           setVisible(false);
           new Rules(name);
      }
      else if (ae.getSource()==back)
      {
         setVisible(false);
           
      }
    }
    public static void main(String args[])
    {
        new login();
    }
}
