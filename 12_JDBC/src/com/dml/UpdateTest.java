package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

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
		
		String query = "update dept set loc = ? , dname = ? " + "where deptno = ?";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(3,99); //데이터 타입 수치 setInt
		pstmt.setString(2,"개발부"); //데이터 타입 문자 setString
		pstmt.setString(1,"울릉도"); //데이터 타입 문자 setString

		
		int n = pstmt.executeUpdate();
//		System.out.println(n + "개의 레코드의 개수");
		System.out.println("수정된 레코드 개수:" +n);
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
