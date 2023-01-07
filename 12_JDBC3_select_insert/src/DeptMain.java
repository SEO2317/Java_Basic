import java.util.List;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {

		//저장
		DeptService service =
				new DeptServiceImpl();
		DeptDTO dto = new DeptDTO(99, "인사", "뉴욕");
		int n = service.deptInsert(dto);
		System.out.println("저장된 레코드 갯수:" + n);
		
		//전체 조회
		List<DeptDTO> list = service.deptAll();
		for (DeptDTO dept : list) {
			System.out.println(dept);
		}
	}

}
