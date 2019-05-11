package com.shreejit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {
	
	// Everything needed to connect to the DB
	String url = "jdbc:mysql://127.0.0.1:3307/jdbcdemo";
	String user = "root";
	String pw = "admin";
    String sql = "select * from loginservlet where uname=? and pass=?";
	public boolean check(String uname,String pass) {
		try {
				Class.forName("com.mysql.jdbc.Driver");
				// Used to issue queries to the DB
				Connection con = DriverManager.getConnection(url, user, pw);
				// Sends queries to the DB for results
				PreparedStatement ps = con.prepareStatement(sql);
						//Since we are passing the values
				ps.setString(1, uname);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					return true;
				}
				
			} catch (Exception e) {
					e.printStackTrace();
			} 
		return false;
	}
}
