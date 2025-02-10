package Hotel.management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Bill extends JFrame {


    Bill(){

        JTextField tx1;

        JPanel panel = new JPanel();
        panel.setBounds(0,0,1103,768);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,250,600,500);
        table.setForeground(Color.white);
        table.setBackground(new Color(3,45,48));
        panel.add(table);



        JButton check = new JButton("Search");
        check.setBounds(650,150,120,30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add(check);

        JButton check1 = new JButton("Refresh");
        check1.setBounds(850,150,120,30);
        check1.setForeground(Color.WHITE);
        check1.setBackground(Color.BLACK);
        panel.add(check1);

        JLabel salary = new JLabel("Search By Check-Out Date :");
        salary.setBounds(100,150,200,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(salary);

        tx1= new JTextField();
        tx1.setBounds(350,150,150,20);
        panel.add(tx1);


        JLabel id = new JLabel("Bill_Id");
        id.setBounds(30,200,50,20);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(id);



        JLabel customerName = new JLabel("Cust_Name");
        customerName.setBounds(90,200,100,20);
        customerName.setForeground(Color.WHITE);
        customerName.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(customerName);

        JLabel  mobileNumber= new JLabel("Mob_No");
        mobileNumber.setBounds(190,200,70,20);
        mobileNumber.setForeground(Color.WHITE);
        mobileNumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(mobileNumber);

        JLabel gender= new JLabel("Gender");
        gender.setBounds(270,200,70,20);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(gender);

        JLabel email = new JLabel("Email");
        email.setBounds(350,200,70,20);
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(email);

        JLabel aadharCard= new JLabel("Aadhar");
        aadharCard.setBounds(430,200,100,20);
        aadharCard.setForeground(Color.WHITE);
        aadharCard.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(aadharCard);

        JLabel checkin = new JLabel("Check-in-Date");
        checkin.setBounds(510,200,150,20);
        checkin.setForeground(Color.WHITE);
        checkin.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(checkin);

        JLabel checkout= new JLabel("Check-Out-Date");
        checkout.setBounds(630,200,150,20);
        checkout.setForeground(Color.WHITE);
        checkout.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(checkout);

        JLabel price = new JLabel("Price");
        price.setBounds(780,200,50,20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(price);

        JLabel number = new JLabel("NO_of days");
        number.setBounds(850,200,100,20);
        number.setForeground(Color.WHITE);
        number.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(number);

        JLabel amount = new JLabel("Total Amount");
        amount.setBounds(970,200,150,20);
        amount.setForeground(Color.WHITE);
        amount.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(amount);



        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1103,768);
        setVisible(true);


        try{
            con c = new con();
            String EmployeeSQL = "select * from Bill";
            ResultSet resultSet = c.statement.executeQuery(EmployeeSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));



        }catch (Exception e){
            e.printStackTrace();
        }



    }

    public static void main(String []args)
    {
        new Bill();
    }

}
