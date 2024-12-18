
package employee.managment.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {
    JButton add,view,remove;
        Home(){
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/photo3.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);
        JLabel heading=new JLabel("Employee Managment System");
        heading.setBounds(650,20,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(heading);
        add=new JButton("Add Employee");
        add.setBounds(700,90,250,40);
        add.addActionListener(this);
        image.add(add);
 
        view=new JButton("View or Update Employee");
        view.setBounds(700,150,250,40);
        view.addActionListener(this);
        image.add(view);
        
        remove=new JButton("Remove Employee");
        remove.setBounds(700,210,250,40);
        remove.addActionListener(this);
        image.add(remove);
        
            setLayout(null);
            setSize(1120,630);
            setLocation(250,100);
            setVisible(true);
            
}
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==add){
                setVisible(false);
                new AddEmployee();
            }
            else if(ae.getSource()==view){
                setVisible(false);
                new ViewEmployee();
            }
            
            else{
                setVisible(false);
                new RemoveEmployee();
                
        }}
    public static void main(String[] args){
        new Home();
}}
