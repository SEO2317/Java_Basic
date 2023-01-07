package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.StudentDTO;

public class StudentDAO {

	List<StudentDTO> selectAllStudent(Connection con) {
		List <StudentDTO> list= new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		String sql = "select student_no 학번, student_name 이름, rpad(substr(student_ssn, 0, 8), 14, '*') 주민번호,";
		   sql += " case when student_address is null then '**주소미상**' else substr(student_address, 0, 10)||'...' end 주소,";
		   sql += " to_char(entrance_date, 'yyyy/mm/dd') 입학년도, absence_yn 휴학여부";
		   sql += " from tb_student where student_name like ? order by 1";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next)
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
