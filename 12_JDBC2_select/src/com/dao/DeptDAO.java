package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DeptDTO;

// 역할: Dept 테이블 접근하는 전담 클래스
public class DeptDAO {

	public List<DeptDTO> deptAll(Connection con) {
		//DeptDTO 누적용
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String query = "select deptno as no, substr(dname,0,3),loc from dept";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while( rs.next()){
				 int deptno = rs.getInt("no");
				 String dname = rs.getString(2);
				 String loc = rs.getString("loc");
				 DeptDTO dto = new DeptDTO(deptno, dname, loc);
				 list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs !=null)  rs.close();
				if( pstmt !=null)  pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public int deptInsert(Connection con, DeptDTO dto)
	{
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			String query = "insert into dept(depno,dname,loc)"
					+ "values (?,?,?)";
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			n = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( pstmt !=null)  pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return n;
	}
}
}
