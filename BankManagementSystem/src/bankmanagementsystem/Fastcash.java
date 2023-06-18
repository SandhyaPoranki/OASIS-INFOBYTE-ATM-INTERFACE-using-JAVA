/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;
import java.sql.*;
public class Fastcash extends JFrame implements ActionListener{
    
JButton b1, b2, b3, b4, b5, b6, b7, b8;   
String pinnumber;
    Fastcash(String pinnumber)
    {
        this.pinnumber = pinnumber;

        setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATMM.jpg"));
         Image i2 = i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 900);
        add(image);
        
        JLabel l1 = new JLabel("Select Withdrawl amount");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(180,250,700,35);
        image.add(l1);
       
        
        b1 = new JButton("Rs 100");  
        b1.setBounds(150,335,120,35);
        image.add(b1);
        b1.addActionListener(this);
        
        
        b2 = new JButton("Rs 500");
        b2.setBounds(300,335,150,35);
        image.add(b2);
        b2.addActionListener(this);
        
        
        b3 = new JButton("Rs 1000");
        b3.setBounds(150,375,120,35);
        image.add(b3);
        b3.addActionListener(this);
        
        
        b4 = new JButton("Rs 2000");
        b4.setBounds(300,375,150,35);
        image.add(b4);
        b4.addActionListener(this);
        
        
        b5 = new JButton("Rs 5000");
        b5.setBounds(150,415,120,35);
        image.add(b5);
        b5.addActionListener(this);
        
        
        
        b6 = new JButton("Rs 10000");
        b6.setBounds(300,415,150,35);
        image.add(b6);
        b6.addActionListener(this);
        
     
        b7 = new JButton("BACK");
        b7.setBounds(300,455,150,35);
        image.add(b7);
        b7.addActionListener(this);
        
        
         setSize(800,1000);
        setLocation(500,0);
      setUndecorated(true);
        setVisible(true);
        
    }
     public void actionPerformed(ActionEvent ae)
     {
          try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //Rs 500
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            } String num = "17";
            if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == b7) {
                this.setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
    
    public static void main(String args[])
    {
        new Fastcash("");
    }
    
    
}
