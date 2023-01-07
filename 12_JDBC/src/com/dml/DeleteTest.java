package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
		
		String query = "delete from dept where deptno = ?";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1,99);
		
		int n = pstmt.executeUpdate();
//		System.out.println(n + "개의 레코드의 개수");
		System.out.println("삭제된 레코드 개수:" +n);
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if(pstmt != null)pstmt.close();
			if(con != null)con.close();
		} catch(SQLException e) {
			e.printStackTrace();
			}	
		}
	}

}
