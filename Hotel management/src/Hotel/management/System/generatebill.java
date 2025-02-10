package Hotel.management.System;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class generatebill extends JFrame{

    generatebill(){
        JPanel panel = new JPanel();
        panel.setBounds(0,30,800,450);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        //panel.setBackground(new Color(3,45,48));
        add(panel);

        JButton check= new JButton("close");
        check.setBounds(720,0,80,30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        add(check);

        JButton check1 = new JButton("Print");
        check1.setBounds(320,400,120,30);
        check1.setForeground(Color.WHITE);
        check1.setBackground(Color.BLACK);
        panel.add(check1);


        setUndecorated(true);
        getContentPane().setBackground(new Color(3,45,48));

        setLayout(null);
        setSize(800,500);
        setVisible(true);
    }

    public static void main(String []args)
    {
        new generatebill();
    }
}
