package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	
	public static void main(String []args) throws Exception {
		Connection con=null;
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 //connection
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "hr", "hr");
		//driver
		 if(con==null) {
			 System.out.println("connection is failed");
		 }//if
		 else {
			 System.out.println("Connection is Succssfull");
		 }//else
	}
}
