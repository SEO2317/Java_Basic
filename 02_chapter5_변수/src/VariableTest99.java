
public class VariableTest99 {
	public static void main(String[] args) {
		char c1 = 'A';
		
		{
			char c2 = 'B';         	
			System.out.println(c1);
			System.out.println(c2);
			
		}
		
		
//		//블럭이 다르면 변수명 동일하게 지정가능해진다.
		{
			char c2 = 'B';
		
		}
		
		{
			char c2 = 'B';
			
		}
//		
		
	}

}
