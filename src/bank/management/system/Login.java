
package bank.management.system;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame {
    
    Login()
    {
        setTitle("AUTOMATIC TELLER MACHINE");
       
        setLayout(null);
        
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10, 100, 100);
        add(label);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
    }
    public static void main(String args[])
    {
        new Login();
    }
    
}
