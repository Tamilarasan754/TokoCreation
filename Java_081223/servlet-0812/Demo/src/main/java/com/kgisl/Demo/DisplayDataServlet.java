package com.kgisl.Demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayDataServlet")
public class DisplayDataServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/tamil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
        "root",
        "");
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

            con.close();
        } catch (Exception e) {
            out.println("An error occurred: " + e.getMessage());
        }
    }
}
