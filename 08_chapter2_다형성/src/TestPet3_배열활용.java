
public class TestPet3_배열활용 {

	public static void main(String[] args) {
		
		Pet [] pets = { new Cat("할퀴", 2, "암컷"),
				new Dog("망치", 3, "화이트"),
				new Cat("모모", 2, "암컷"),
				new Dog("두부", 3, "화이트"),
				new Cat("코모", 2, "암컷")};
		
		//출력하시오
		for (Pet p:pets) {
			//고양이? 강아지? ==> instanceof 연산자 이용하면 원래 타입을 식별함
			//문법  변수명 instanceof 클래스
			if(p instanceof Cat) {
				Cat c2 = (Cat)p;
				System.out.printf("이름:%s, 나이:%d, 성별:%s\n", c2.getName(), c2.getAge(),c2.getGender());	
			}else {
				Dog d2 = (Dog)p;
				System.out.printf("이름:%s, 나이:%d, 색상:%s\n", d2.getName(), d2.getAge(),d2.getColor());
			}
			
        }
		
	}//end main

}

/*
 * 
 * 1.다형성 활용
 * 고양이 10마리 강아지 20마리 
 * 가.개별적으로 객체 생성 저장 ==> 변수 30개 필요
 * 나.개별타입으로 객체생성 저장 ==> 변수 2개
 * 다.다형성 ==> 변수 1개
 * 
 * 
 */
