/**************************************************
 * Copyright (c) 2019 KNU DKE Lab. To Present
 * All rights reserved. 
 **************************************************/
package comp322.lab6; // package name 

import java.sql.*; // import JDBC package

/**
 * Sample Code for JDBC Practice
 * @author yksuh
 */
public class Lab6JDBC {
	public static final String URL = "jdbc:oracle:thin:@localhost:1600:xe";
	public static final String USER_KNU ="knu";
	public static final String USER_PASSWD ="comp322";
	
	public static void main(String[] args) {
		Connection conn = null; // Connection object
		Statement stmt = null;	// Statement object
		
		doTask1(conn, stmt);
		doTask2(conn, stmt);
		
		// Release database resources.
		try {
			// Close the Statement object.
			stmt.close(); 
			// Close the Connection object.
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void doTask1(Connection conn, Statement stmt) {
		// Fill out your code.
	}
	
	public static void doTask2(Connection conn, Statement stmt) {
		ResultSet rs = null;
		try {
			// Q1: Complete your query.
			String sql = "";
			rs = stmt.executeQuery(sql);
			System.out.println("<< query 1 result >>");
			while(rs.next()) {
				// Fill out your code		
			}
			rs.close();
			
			
			// Q2: Complete your query.
			sql = "";
			System.out.println("<< query 2 result >>");
			while(rs.next()) {
				// Fill out your code				
			}
			rs.close();
						
			// Q3: Complete your query.
			sql = "";		
			rs = stmt.executeQuery(sql);
			System.out.println("<< query 3 result >>");
			while(rs.next()) {
				// Fill out your code				
			}
			
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}