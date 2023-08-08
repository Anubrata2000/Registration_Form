package com.sitmcajava.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
    public Connection con = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DbConnection dc = new DbConnection();
    dc.dbconnect();
	}
    public Connection dbconnect()
	{
		try {
			System.out.println("Connecting......");
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			System.out.println("Successfully Connected with the Database");
		}
		catch(Exception e){
			System.out.println("ERROR CANNOT FIND THE DATABASE");
			e.printStackTrace();
		}
		return con;
		
	}
}

