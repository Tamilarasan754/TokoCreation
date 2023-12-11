package com.kgisl.UserProject;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EventProject extends Exception{
    private static Connection con;
    private static Statement smt;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        try {
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
              "root", "");
                 smt=con.createStatement();
                 select();
                 update();
                 select();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
              

        
    }
    public static void select()
    {
        try {
           // int val=sc.nextInt();
            String strSelect = "select * from eventstable";
         System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
 
         ResultSet rset = smt.executeQuery(strSelect);
       System.out.println("The records are selected are:");
       int rowCount=0;
       while(rset.next()) {   // Repeatedly process each row
            int event_id = rset.getInt("event_id");  // retrieve a 'String'-cell in the row
            String  event_name = rset.getString("event_name");  // retrieve a 'double'-cell in the row
             Date    event_date   = rset.getDate("event_date");   
             String location=rset.getString("location");
             String discription=rset.getString("description");  
                // retrieve a 'int'-cell in the row
            System.out.println(event_id + ", " + event_name+", "+event_date+", "+location+", "+discription);
            ++rowCount;
         }
         System.out.println("Total number of records = " + rowCount);
         con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    public static void update()
    {
        try {
            String strUpdate = "update eventstable set location = 'coimbatore' where event_id = 201";
         System.out.println("The SQL statement is: " + strUpdate + "\n");  // Echo for debugging
         int countUpdated = smt.executeUpdate(strUpdate);
         System.out.println(countUpdated + " records affected.\n");

         select();
         
       
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
