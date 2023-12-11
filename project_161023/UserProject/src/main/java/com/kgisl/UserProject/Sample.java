package com.kgisl.UserProject;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample {
    public static void main(String[] args)throws Exception{
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
        "root", "");


        Statement smt=con.createStatement();

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
 
   

    }
}
