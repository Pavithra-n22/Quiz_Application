
package quiz_applicationpavi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author pavit
 */
public class Score extends JFrame implements ActionListener {
    Score(String name, int score)
    {
         setBounds(400, 150, 750, 550);
    getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images/quiz.jpg"));   
     Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i1);
       image.setBounds(0, 200, 300, 250);
        add(image);
        
      JLabel heading= new JLabel("Thank you "+ name );
        heading.setBounds(45,30,700,30);
       heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
         JLabel lblscore= new JLabel("your score is "+ score );
        lblscore.setBounds(350,200,300,30);
  lblscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(lblscore);
        
        
          JButton submit= new JButton("play again");
         submit.setBounds(400, 270, 300, 30);
       submit.setBackground(new Color(30,144,255));
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       submit.setFont(new Font("Tahomag",Font.PLAIN,22));
    submit.addActionListener(this);
       add(submit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
setVisible(false);
new login();
    }
    public static void main(String args[])
    {
        new Score("user ",0);
    }
    
}
