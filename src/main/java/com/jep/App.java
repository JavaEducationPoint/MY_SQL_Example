package com.jep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(  
        		"jdbc:mysql://localhost:3306/jep_05","root","test123");
		/*
		 * Statement stmt=con.createStatement(); ResultSet rs=
		 * stmt.executeQuery("Select * from employ"); while(rs.next()) {
		 * System.out.println(rs.getInt("empid")+","+rs.getString("ename")); }
		 */
        String query="update employ set ename=? where empid =?";
        PreparedStatement pstmt=con.prepareStatement(query);
        pstmt.setString(1,"Amit");
        pstmt.setString(2,"2");
        int row=pstmt.executeUpdate();
        System.out.println(row);
        
        con.close();
        
        
        
    }
}
