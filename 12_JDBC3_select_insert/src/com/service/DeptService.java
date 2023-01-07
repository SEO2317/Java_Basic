package com.service;

import java.util.List;

import com.dto.DeptDTO;

public interface DeptService {
	
	// 전체 보기
	public List<DeptDTO> deptAll();
	
	//저장
	public int deptInsert(int deptno,String dname,String loc);
	public int deptInsert(DeptDTO dto);
}
