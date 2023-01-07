package com.service;

import java.util.List;

import com.dto.DeptDTO;

public interface DeptService {
	
	//전체 보기
	public List<DeptDTO> deptAll();
	
	//전체 조회
	public int deptInsert(int deptno, String dname, String loc); //오버로딩 파라미터
	public int deptInsert(DeptDTO dto); //오버로딩 파라미터
}
