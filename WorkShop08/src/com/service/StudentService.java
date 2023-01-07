package com.service;

import java.util.List;

import com.dto.StudentDTO;

public interface StudentService {
	//학생목록
	public List<StudentDTO> selectAllStudent();
	
	//이름검색
	public List<StudentDTO> selectNameStudent(String name);
}