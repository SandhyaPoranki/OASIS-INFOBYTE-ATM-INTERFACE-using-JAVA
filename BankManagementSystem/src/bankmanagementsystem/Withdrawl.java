/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    JTextField amount;
    JButton Withdraw,back;
        String pinnumber;

    Withdrawl(String pinnumber)
    {
         this.pinnumber = pinnumber;
         setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATMM.jpg"));
         Image i2 = i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 900);
        add(image);
        
        
        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(150,250,700,35);
        image.add(text);
        
        amount= new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
         amount.setBounds(150,300,300,25);
         image.add(amount);
        
         Withdraw = new JButton("WithDraw");
         Withdraw.setBounds(300,420,150,30);
        image.add(Withdraw);
        Withdraw.addActionListener(this);
        
        
         back = new JButton("Back");
         back.setBounds(300,460,150,30);
        image.add(back);
        back.addActionListener(this);
        
        
        
        
        
        
        
        
       setSize(800,1000);
        setLocation(500,0);
      setUndecorated(true);
        setVisible(true);
    }
      public void actionPerformed(ActionEvent ae)
      {
             try{        
            String number = amount.getText();
            Date date = new Date();
            if(ae.getSource()==Withdraw){
                if(number.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Withdraw");
                }else{
                    Conn conn = new Conn();
                    conn.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'WithDrawl', '"+number+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdraw Successfull");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
            }else if(ae.getSource()== back){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
      }
    public static void main(String[] args){
        new Withdrawl("").setVisible(true);
    }
}