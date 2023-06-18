/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;
import java.sql.*;
// i use this class as an object
/**
 * Steps in connecting database
 * 1)Register the driver
 * 2)Create connection
 * 3)Create statement
 * 4)Execute query
 * 5)close connection
 */
public class Conn
{
    
   Connection c;
   Statement s;
    public Conn()
    {
        try
        {
                //driver register by importing jar
            //connection creation
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Psandhy@86");
            //create statement
            s= c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
