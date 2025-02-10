package Hotel.management.System;

import javax.swing.*;

public class Splash extends JFrame {

    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/welcome.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,1200,620);
        add(label);

        setLayout(null);
        setLocation(300,80);
        setSize(1200,680);
        setVisible(true);

        try{
            Thread.sleep(5000);
            new Login();
            //setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String []args)
    {
        new Splash();
    }

}
