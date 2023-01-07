package com.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		//드라이버 , 주소, DB계정, DB비밀번호
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";
		
		
		Connection con =  null; //로컬변수 main 메서드 
		PreparedStatement pstmt = null;
		ResultSet rs =  null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			
			String query = "select deptno,dname,loc  from dept";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname =  rs.getString("dname");
				String loc =  rs.getString("loc");
				System.out.println(deptno + "" + dname + " " + loc);
			}
			//DAO
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
