
public class TestPet4_메서드_활용 {
	
	//정보 출력하는 메서드
	public static void info_print(Pet x) {
			if(x instanceof Cat) {
				Cat c = (Cat)x;
				System.out.printf(c.getGender());	
			}else if(x instanceof Cat){
				Dog d = (Dog)x;
				System.out.printf(d.getColor());
				
				System.out.printf(((Dog)x).getColor());
			}else if(x instanceof Pet){
				System.out.printf(x.getName()); //상속구조에서 부모타입을 가장 마지막에 비교한다.
			}
		}

	public static void main(String[] args) {
		
		Pet p = new Pet("앵무새",2);
		Cat c = new Cat("야옹이1",2,"암컷");
		Dog d = new Dog("멍멍이,1",3,"화이트");
	
		//정보 출력하기
		info_print(p);
		info_print(c);
		info_print(d);
		
	}//end main

}

