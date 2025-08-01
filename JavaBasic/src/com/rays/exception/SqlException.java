package com.rays.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlException {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-04,", "root", "root");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			//System.out.println("abc");
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
