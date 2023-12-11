package com.kgisl.Demo;
import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("userName");  
String p=request.getParameter("userPass");  
String e=request.getParameter("userEmail");  
String c=request.getParameter("userCountry");  
          
try{  
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
        "root",
        "");

  
PreparedStatement ps=con.prepareStatement(  
"insert into registeruser values(?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  
          

int rowsAffected = ps.executeUpdate();

if (rowsAffected > 0) {
    PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM registeruser");
    ResultSet resultSet = preparedStatement.executeQuery();

    out.println("<html><body>");
    out.println("<h2>Data from Database</h2>");
    out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Email</th></tr>");

    while (resultSet.next()) {
        String name = resultSet.getString("NAME");
        String pass = resultSet.getString("PASS");
        String email = resultSet.getString("EMAIL");
        String country = resultSet.getString("COUNTRY");

          out.println("<tr><td>" + name + "</td><td>" + pass + "</td><td>" + email + "</td><td>" + country + "</td></tr>");
    }

    out.println("</table>");
    out.println("</body></html>");
    out.println("Hi Daa");
} else {
    out.println("Failed to insert data.");
}   
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  