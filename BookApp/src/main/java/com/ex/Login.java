
package com.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
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
		HttpSession hs=request.getSession();
		
		try {

			ps=con.prepareStatement("select * from register where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2,password);
		
		ResultSet x=ps.executeQuery();
		if(x.next())
		{
			hs.setAttribute("id",x.getInt(1));
			hs.setAttribute("email",x.getString(4));	
		response.sendRedirect("./home.html");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}