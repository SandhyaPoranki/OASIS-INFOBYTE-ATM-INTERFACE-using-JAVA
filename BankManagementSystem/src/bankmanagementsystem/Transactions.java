/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,cashwithdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber)
    {
        this.pinnumber = pinnumber;

        setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATMM.jpg"));
         Image i2 = i1.getImage().getScaledInstance(800, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 900);
        add(image);
        
        JLabel l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(180,250,700,35);
        image.add(l1);
       
        
        deposit = new JButton("DEPOSIT");  
        deposit.setBounds(150,335,120,35);
        image.add(deposit);
        deposit.addActionListener(this);
        
        
        cashwithdrawl = new JButton("CASH WITHDRAWL");
        cashwithdrawl.setBounds(300,335,150,35);
        image.add(cashwithdrawl);
        cashwithdrawl.addActionListener(this);
        
        
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(150,375,120,35);
        image.add(fastcash);
        fastcash.addActionListener(this);
        
        
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(300,375,150,35);
        image.add(ministatement);
        ministatement.addActionListener(this);
        
        
        pinchange = new JButton("PIN CHANGE");
        pinchange.setBounds(150,415,120,35);
        image.add(pinchange);
        pinchange.addActionListener(this);
        
        
        
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(300,415,150,35);
        image.add(balanceenquiry);
        balanceenquiry.addActionListener(this);
        
     
        exit = new JButton("EXIT");
        exit.setBounds(300,455,150,35);
        image.add(exit);
        exit.addActionListener(this);
        
        
         setSize(800,1000);
        setLocation(500,0);
      setUndecorated(true);
        setVisible(true);
        
    }
     public void actionPerformed(ActionEvent ae)
     {
          if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==cashwithdrawl){ 
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){ 
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }else if(ae.getSource()==ministatement){ 
            new MiniStatement(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){ 
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()==exit){ 
            System.exit(0);
        }
     }
    
    public static void main(String args[])
    {
        new Transactions("");
    }
    
    
}
