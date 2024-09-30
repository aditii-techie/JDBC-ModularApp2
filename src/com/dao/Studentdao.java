package com.dao;
import java.sql.*;

public class Studentdao {
	public void insertData() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?);");
		ps.setInt(1, 9);
		ps.setString(2, "Siya");
		ps.setInt(3, 21);
		ps.setString(4, "Chennai");
		ps.executeUpdate();
		System.out.println("Data inserted successfully");
		ps.close();
		con.close();
	}
	
	public void updateData() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
		PreparedStatement ps = con.prepareStatement("update student set city=? where id=?;");
		ps.setString(1, "Nagpur");
		ps.setInt(2, 5);
		ps.executeUpdate();
		System.out.println("Data updated successfully");
		ps.close();
		con.close();
	}
	
	public void fetchAllRecords() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
		PreparedStatement ps = con.prepareStatement("select *from student");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+", Name: "+rs.getString(2)+", Age: "+rs.getInt(3)+", City: "+rs.getString(4));
		}
		rs.close();
		ps.close();
		con.close();
	}
	
	public void deleteData() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
		PreparedStatement ps = con.prepareStatement("delete from student where id=?;");
		ps.setInt(1, 8);
		ps.executeUpdate();
		System.out.println("Data updated successfully");
		ps.close();
		con.close();
	}
}
