
package com.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	Connection con=null;
	PreparedStatement ps= null; 
	public void init(ServletConfig config) {
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		String email= request.getParameter("email");
		long phone= Integer.parseInt(request.getParameter("phone"));
		
		try {
			ps=con.prepareStatement("insert into register(username,password,email,phone)values(?,?,?,?)");
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setLong(4,phone);
		int x=ps.executeUpdate();
		if(x!=0)
			response.sendRedirect("./login.html");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}