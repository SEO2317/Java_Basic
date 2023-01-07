package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";
	
	//생성자
	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end 생성자
	
	// dept테이블 전체조회
	// Connection 얻기 작업까지만 진행한다.
	@Override
	public List<DeptDTO> deptAll() {
		List<DeptDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			DeptDAO dao = new DeptDAO();
			list = dao.deptAll(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( con !=null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}//end deptAll() 

	@Override
	public int deptInsert(int deptno, String dname, String loc) {
		return 0;
	}

	// Connection 얻기 작업까지만 진행한다.
	@Override
	public int deptInsert(DeptDTO dto) {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			DeptDAO dao = new DeptDAO();
			n = dao.deptInsert(con, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( con !=null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}
	// Connection 얻기 작업까지만 진행한다.
	@Override
	public int deptDelete(int deptno) {
		
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			DeptDAO dao = new DeptDAO();
			n = dao.deptDelete(con, deptno);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( con !=null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}

	@Override
	public int deptUpdate(DeptDTO dto) {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			DeptDAO dao = new DeptDAO();
			n = dao.deptUpdate(con, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if( con !=null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}
}//end 클래스








