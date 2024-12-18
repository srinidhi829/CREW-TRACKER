
package employee.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener{
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading = new JLabel("CREW TRACKER");
        heading.setBounds(350,15,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.BLACK);
        add(heading);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/photo.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        JButton ClickHere=new JButton("CLICK HERE TO CONTINUE");
        ClickHere.setBounds(400,400,300,70);
        ClickHere.setBackground(Color.BLACK);
        ClickHere.setForeground(Color.WHITE);
        ClickHere.addActionListener(this);
        image.add(ClickHere);
        setSize(1170,650);
        setLocation(200,50);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args){
        new Splash();
    }
}
