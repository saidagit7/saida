package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	
	public static void main(String []args) throws Exception {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "hr", "hr");
		 if(con==null)
			 System.out.println("connection is failed");
		 else
			 System.out.println("Connection is Succssfull");
	}
}
