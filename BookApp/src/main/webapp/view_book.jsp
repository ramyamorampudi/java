<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Application</title>
</head>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">Welcome to Book Application</h1>
<br><br><br>
<h2 align="center"> 
<a href="profile.jsp">Profile</a>
<a href="add_book.html">Add Book</a>
<a href="view_book.jsp">View Book</a>
<a href="index.html">Logout</a></h2>
<br><br><br>
<table border="2" width="400" height="200" cellpadding="20" align="center">
<tr>
<td>Book Id</td> <td>Book Name</td> <td>Book Price</td> <td>Book Author</td> <td>Publisher</td> <td>Year</td>
</tr>
<%@page import="java.sql.*" %>
<%@page import="com.ex.*" %>
<%
Connection con=DatabaseConnection.getConnection();
PreparedStatement ps=con.prepareStatement("select * from book");
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getInt(3)%></td><td><%=rs.getString(4)%></td> 
<td><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td>
</tr>  

<%}%>
</table>
</body>
</html>