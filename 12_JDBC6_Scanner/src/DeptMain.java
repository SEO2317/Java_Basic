import java.util.List;
import java.util.Scanner;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {
		while(true) {
			System.out.println("부서정보 관리 프로그램");
			System.out.println("메뉴");
			System.out.println("1.부서 전체조회");
			System.out.println("2.부서 삭제");
			System.out.println("3.부서 등록");
			System.out.println("4.부서 수정");
			
			System.out.println("0.프로그램 종료");
			System.out.println("======================================");
			
			Scanner scan =  new Scanner(System.in);
			int num = scan.nextInt();
			if(num == 1) {
				DeptService service = new DeptServiceImpl();
				List<DeptDTO> list = service.deptAll();
				for (DeptDTO dept : list) {
					System.out.println(dept);
				}
				
			}else if(num == 2){
				System.out.println("삭제할 부서 번호를 입력하시오.");
				int deptno = scan.nextInt();
				DeptService service = new DeptServiceImpl();
				int n = service.deptDelete(deptno);
				System.out.println("삭제 성공" +n);
			}else if(num == 3) {
				System.out.println("부서 번호를 입력하시오.");
				int deptno = scan.nextInt();
				System.out.println("부서이름 입력 : ");
				String dname = scan.next();
				System.out.println("지역이름 입력 : ");
				String loc = scan.next();
				DeptService service = new DeptServiceImpl();
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				int n = service.deptInsert(dto);
				System.out.println("저장 성공" +n);
			}else if(num == 4) {
				System.out.println("수정할 부서번호 입력 : ");
				int deptno = scan.nextInt();
				System.out.println("수정할 부서이름 입력 : ");
				String dname = scan.next();
				System.out.println("수정할 지역이름 입력 : ");
				String loc = scan.next();
				DeptService service = new DeptServiceImpl();
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				int n = service.deptUpdate(dto);
				System.out.println("수정 성공" + n);
			}else if(num == 0) {
				
				System.out.println("프로그램 정상 종료");
				System.exit(0);
			}
		}
	}

		//저장
//		DeptService service =
//				new DeptServiceImpl();
		
//		DeptDTO dto = new DeptDTO(99, "인사", "뉴욕");
//		int n = service.deptInsert(dto);
//		System.out.println("저장된 레코드 갯수:" + n);
//		
		//삭제
//		int n = service.deptDelete(99);
//		System.out.println("삭제된 레코드 갯수:" +n);
//		
//		//전체 조회
//		List<DeptDTO> list = service.deptAll();
//		for (DeptDTO dept : list) {
//			System.out.println(dept);
	
//		//수정
//		DeptDTO dto = new DeptDTO(98, "인사", "뉴욕");
//		int n = service.deptUpdate(dto);
//		System.out.println("수정된 레코드 갯수:" + n);		
//		}
//	}

}
