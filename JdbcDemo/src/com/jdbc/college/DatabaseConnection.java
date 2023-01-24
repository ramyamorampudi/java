package com.jdbc.college;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
 
public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("Connection eshtablished"); 
		String sql="select * from college";
		PreparedStatement ps=connection.prepareStatement(sql);
		ResultSet rs=ps.executeQuery("select * from college");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString("s_name")+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
	}

}