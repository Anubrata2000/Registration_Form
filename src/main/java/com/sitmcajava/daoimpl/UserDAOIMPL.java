package com.sitmcajava.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sitmcajava.dbconnection.DbConnection;
import com.sitmcajava.vo.UserVO;
import com.sitmcajava.vo.ResultVO;

public class UserDAOIMPL {
    
	public PreparedStatement ps = null;
	public Connection con = null;
	DbConnection dc = new DbConnection();
	ResultVO rvo = new ResultVO();
	
	public ResultVO datainsert(UserVO uvo) {
		try {
		//	Get Data from Servlet
			String name = uvo.getFname();
			String address = uvo.getAddress();
			String email = uvo.getEmail();
			String phone = uvo.getPhone();
			String pwd = uvo.getPwd();
			String age = uvo.getAge();
		// Check to Connection
			con = dc.dbconnect();
		// Sql query execution
			String insertQuery = "insert into user values (DEFAULT,?,?,?,?,?,?)";
			ps = con.prepareStatement(insertQuery);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, email);
			ps.setString(4, phone);
			ps.setString(5, pwd);
			ps.setString(6, age);
			
			int i = ps.executeUpdate();
			System.out.println(ps);
		// Status of transaction
			if(i>0) {
				System.out.println("Success");
			}
			else {
				System.out.println("Failed");
			}
		} catch (Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
		return rvo;
	}
}
