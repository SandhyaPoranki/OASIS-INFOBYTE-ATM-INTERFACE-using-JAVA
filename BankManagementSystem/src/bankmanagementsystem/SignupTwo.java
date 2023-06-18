/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener
{
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
     JComboBox religion,category,income,education,occupation;
     String formno;
    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
      
        
        JLabel additionalDetails = new JLabel("Page 2: ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(250,80,400,30);
        add(additionalDetails);
        
        
        JLabel name = new JLabel("RELIGION:");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,150,30);
        add(name);
        
        String valReligion[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
         religion.setBounds(340,140,400,30);
         religion.setBackground(Color.WHITE);
        add(religion);
         

        JLabel fname = new JLabel("CATEGORY:");
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[] ={"General","OBC","SC","ST","BC","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(340,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
         
        
        JLabel dob = new JLabel("INCOME:");
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        
        String incomeCategory[] ={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(340,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
         JLabel gender = new JLabel("EDUCATIONAL");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
      
        
         JLabel email = new JLabel("QUALIFICATION:");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationvalues[] ={"Non-Graduation","Graduate","Post-Graduation","Doctarate","Others"};
        education = new JComboBox(educationvalues);
        education.setBounds(340,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
      
         JLabel marital = new JLabel("OCCUPATION:");
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         String occupationvalues[] ={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(occupationvalues);
        occupation.setBounds(340,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        

      
        
        
        JLabel address = new JLabel("PAN NUMBER:");
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
         pan= new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
       pan.setBounds(340,440,400,30);
        add(pan);
        
       
        JLabel aadharnum= new JLabel("AADHAR NUMBER:");
        aadharnum.setFont(new Font("Raleway", Font.BOLD,20));
        aadharnum.setBounds(100,490,200,30);
        add(aadharnum);  
        
            aadhar = new JTextField();
       aadhar.setFont(new Font("Raleway",Font.BOLD,14));
       aadhar.setBounds(340,490,400,30);
        add(aadhar);
        
        JLabel seniorcitizen= new JLabel("SENIOR CITIZEN:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD,20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);  
        
                
        
        
         syes= new JRadioButton("YES");
        syes.setBounds(340, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("NO");
       sno.setBounds(470, 540, 100, 30);
       sno.setBackground(Color.WHITE);
        add(sno);
       
        ButtonGroup sgroup = new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        
        
        
        
         JLabel pin= new JLabel("EXISTING ACCOUNT:");
        pin.setFont(new Font("Raleway", Font.BOLD,20));
        pin.setBounds(100,590,250,30);
        add(pin);  
         
        
         eyes= new JRadioButton("YES");
        eyes.setBounds(340, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("NO");
       eno.setBounds(470, 590, 100, 30);
       eno.setBackground(Color.WHITE);
        add(eno);
       
        ButtonGroup egroup = new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
        
        
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway", Font.BOLD,14));
         next.setBounds(620,660,80,30);
         next.addActionListener(this);
         add(next);

        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        
      
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String)  category.getSelectedItem();  
        String sincome = (String)  income.getSelectedItem(); 
        String seducation = (String)  education.getSelectedItem();      
        String soccupation = (String)  occupation.getSelectedItem();
        String seniorcitizen = null;      
        if(syes.isSelected())
        {
            seniorcitizen = "YES";
        }
        else if(sno.isSelected())
        {
            seniorcitizen = "NO";
        }
         String existingaccount = null;      
        if(eyes.isSelected())
        {
            existingaccount = "YES";
        }
        else if(eno.isSelected())
        {
            existingaccount = "NO";
        }
        
          String span = pan.getText();
          String saadhar = aadhar.getText();
         
    
    try
    {
       
            Conn c= new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
             setVisible(false);
        new SignupThree(formno).setVisible(true);
       
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    public static void main(String args[])
            {
                new SignupTwo("");
            }
}
