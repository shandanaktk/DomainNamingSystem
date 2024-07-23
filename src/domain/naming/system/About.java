package domain.naming.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.Color;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Back");
        add(b1);
        b1.setBounds(260, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

         s =    " Welcome, Dear Users to a Virtual Domain Naming System.                                    \n  "
                + "\nThe virtual Domain Naming System is a GUI based product that "
                + "enables the users to interact with a Virtual Domain Naming System   "
                + "designed for efficient management of associations between domain names "
                + "and their corresponding IP addresses. Through a user-friendly web interface, "
                + "individuals can store valid domain names alongside their respective IP addresses. \n\n"
                + "Users have the capability to add new mappings, allowing "
                + "them to input domain names, IP addresses, and optional descriptions. \n\n"
                + " The system ensures proper validation of inputs to maintain data integrity and includes error  ,"
                + "handling mechanisms to address issues such as incorrect formats or duplicate entries. \n\n\n"
                
                + "TOOLS AND TECHNOLOGIES USED:\n"
                + "\nTechnology :-  Java"
                + "\nDatabase  :- Mysql"
                + "\nConcepts :- OOP core concepts including abstraction, Java Swing, JOptionPane etc."; 
        
        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 625, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        Color darkRed = new Color(200, 200, 200);
        contentPane.setBackground(darkRed);
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(260, 10, 180, 80);

        l1.setForeground(new Color(0,0,0));

        Font f2 = new Font("RALEWAY", Font.BOLD, 25);
        l1.setFont(f2);

        setBounds(400, 100, 700, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        menu su = new menu();
	su.setVisible(true);
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
