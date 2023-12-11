package com.kgisl.UserProject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
import java.util.Set;
import java.sql.CallableStatement;

public class PrepareStmt {
    private static Connection con;
    private static PreparedStatement smt;
    public static void main(String[] args) {
        try {
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
              "root", "");
                 
          //  joins();
           // insert();
        // multiinsert();
               //select();
        // delete();
       // procall();
      // exists();
    //   multiLine();
    
               con.close();
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
         smt=con.prepareStatement(strSelect);
         ResultSet rset = smt.executeQuery();
       System.out.println("The records are selected are:");
       int rowCount=0;
       while(rset.next()) {   // Repeatedly process each row
            String event_id = rset.getString("event_id");  // retrieve a 'String'-cell in the row
            String  event_name = rset.getString("event_name");  // retrieve a 'double'-cell in the row
             Date    event_date   = rset.getDate("event_date");   
             String location=rset.getString("location");
             String discription=rset.getString("description");  
                // retrieve a 'int'-cell in the row
            System.out.println(event_id + ", " + event_name+", "+event_date+", "+location+", "+discription);
            ++rowCount;
         }
         System.out.println("Total number of records = " + rowCount);
        // con.close();
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
        public static void insert()
        {
             try {
        Connection Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
        "root", "");
         String sqlInsert= "insert into eventstable values (?,?,?,?,?)";
         PreparedStatement stmt = Conn.prepareStatement(sqlInsert);
         stmt.setInt(1,211);
         stmt.setString(2, "long jump");
         stmt.setString(3,"2023-12-10");
         stmt.setString(4,"chennai");
         stmt.setString(5,"longJump");
         int val=stmt.executeUpdate();
         System.out.println("No.of Inserted Data"+val);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            select();

        }
        public static void delete()
        {
            try {
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
              "root", "");
               String sqlDelete = "delete from eventstable where event_id = ?";
                          PreparedStatement stmt=con.prepareStatement(sqlDelete);
                          stmt.setInt(1, 211);

                       int count=stmt.executeUpdate();

            System.out.println("No of Rows Delete " +count+ "\n");
            select();
                
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
           
        }
        public static void joins()
        {
            try {
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
              "root", "");
               String sjoins = "SELECT er.registration_id,es.event_name,us.username AS athlete_name,er.registration_date FROM eventregistrationstable er\r\n" + //
                       "JOIN eventstable es ON er.event_id=es.event_id\r\n" + //
                       "JOIN athletestable ath ON er.athlete_id=ath.athlete_id\r\n" + //
                       "JOIN userstable us ON ath.user_id=us.user_id";
                          PreparedStatement stmt=con.prepareStatement(sjoins);

                          ResultSet rset=stmt.executeQuery();
                          while(rset.next())
                          {
                    int registration_id = rset.getInt("registration_id");  // retrieve a 'String'-cell in the row
                    String  event_name = rset.getString("event_name");  // retrieve a 'double'-cell in the row
                    String    athlete_name   = rset.getString("athlete_name");   
                    Date registration_date=rset.getDate("registration_date");

                    System.out.println(registration_id+" "+event_name+" "+athlete_name+" "+registration_date);
                          }
                
            } catch (Exception e) {
                // TODO: handle 
                System.out.println(e.getMessage());

            }
        } 
        public static void multiinsert()throws Exception
    {try {
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
          String strInsertt;
            strInsertt = "INSERT INTO eventstable values(?, ?, ?, ?, ?)";
                 
        //    stmt = conn.prepareStatement(strInsertt);

           PreparedStatement st = conn.prepareStatement(strInsertt);
        st.setInt(1,212);
        st.setString(2, "smiley");
        st.setString(3, "2023-10-21");
        st.setString(4, "erode");
        st.setString(5, "two teams");
        st.addBatch();

        st.setInt(1, 213);
        st.setString(2, "kgsmiley");
        st.setString(3, "2023-10-11");
        st.setString(4, "Namakkal");
        st.setString(5, "threeteams");
        st.addBatch();

         System.out.println("The SQL statement is: " + strInsertt + "\n");  // Echo for debugging
//int countInserted = st.executeUpdate();
  //       System.out.println(countInserted + " records inserted.\n");
          //int rowCount = 0;

          
      // int[] result = st.executeBatch();
         // System.out.println(result);
         select();

          //stmt.close();
         // conn.close();
      


    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
    }
}
public static void call()
{
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");

          String select = "{call sample()}";

        CallableStatement stmt = conn.prepareCall(select);

        ResultSet rset=stmt.executeQuery();
        while(rset.next())
        {

        }
        

        
    } catch (Exception e) {
        // TODO: handle exception
    }
}

public static void procall(){
    try{
 Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
                String str = "{CALL rox(?)}";
     CallableStatement cstmt = con.prepareCall(str);
    // cstmt.setInt(1, 601);
  //  int @M = 3;

     // Register the output parameter, specifying its type (e.g., INT)
     cstmt.registerOutParameter(1,  Types.INTEGER);
     cstmt.execute();
    int total=cstmt.getInt(1);
     System.out.println(total);

    
    }
    catch(Exception e){
       // System.out.println(e.getMessage());
       e.printStackTrace();
    }
}
public static void exists()
{
    try {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
                String str = "{CALL xyz(?)}";

                CallableStatement cstmt=con.prepareCall(str);
                cstmt.registerOutParameter(1,Types.INTEGER);
                cstmt.execute();
                int tot=cstmt.getInt(1);
            System.out.println(tot);
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}
public static void multiLine()
{
    try {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
                String str = "{CALL taxy()}";

                CallableStatement cstmt=con.prepareCall(str);
                
                cstmt.executeQuery();
                ResultSet resultSet=cstmt.getResultSet();
                int resultSetCount=0;
                
        // while(resultSet  != null) {
        //     System.out.println("hi");
        //     System.out.println("ResultSet " + (++resultSetCount) + ":");
        //     while (resultSet.next()) {
        //         Object data = resultSet.getObject(ColumnName);
        //         System.out.println("Data: " + data);
        //     }
        //     System.out.println();
        //     cstmt.getMoreResults();
        // }

        System.out.println("Number of ResultSets: " + resultSetCount+" "+resultSet);
        
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}

    
}
