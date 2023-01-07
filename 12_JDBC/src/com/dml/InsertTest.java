package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";
		
		Connection con =  null; //로컬변수 main 메서드 
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			
			String query = "insert into dept(deptno,dname,loc)"
					+ "values(?, ?, ?)";
			
			//?대신 값넣으면 
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,98);
			pstmt.setString(2,"개발");
//			pstmt.setString(2,"개발"); //이 부분을 사용을 안해도 됨 (직접 값을 입력한 경우)
			pstmt.setString(3,"제주");
			
			int n = pstmt.executeUpdate();

			//자바는 자동 commit이 됨
			
			
//			System.out.println(n + "개의 레코드의 개수");
			System.out.println("저장된 레코드 개수:" +n);
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
