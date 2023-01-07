
public class TestPet2 {

	public static void main(String[] args) {
		
		//1. 일반적인 객체 생성 방법
		Pet p = new Pet("앵무새",2);
		Cat c = new Cat("야옹이1",2,"암컷");
		Dog d = new Dog("멍멍이,1",3,"화이트");
		
		//2. 다형성 ==> 변수 하나로 다양한 객체 관리가 가능하다. 재사용성이 증가
//		Pet p2 = new Pet("앵무새",2);
//		System.out.printf("이름:%s, 나이:%d", p2.getName(), p2.getAge());
//			p2 = new Cat("야옹이1",2,"암컷");
//		System.out.printf("이름:%s, 나이:%d", p2.getName(), p2.getAge(),getColor());	
//			p2 = new Dog("멍멍이1,1",3,"블랙");
//		System.out.printf("이름:%s, 나이:%d", p2.getName(), p2.getAge(),getColor());
		
		Pet p2 = new Pet("앵무새",2);
		System.out.printf("이름:%s, 나이:%d\n", p2.getName(), p2.getAge());
			p2 = new Cat("야옹이1",2,"암컷");
			
		//자식에서 추가된 멤버(변수,메서드)를 참조하기 위해서는 자식타입으로 형변환해야한다.
		Cat c2 = (Cat)p2;
		System.out.printf("이름:%s, 나이:%d, 성별:%s\n", c2.getName(), c2.getAge(),c2.getGender());	
		
			p2 = new Dog("멍멍이1",3,"블랙");
			
		Dog d2 = (Dog)p2;	
		System.out.printf("이름:%s, 나이:%d, 색상:%s\n", d2.getName(), d2.getAge(),d2.getColor());
		
		
		
		//다 저장을 할수있지만 자식에서 종속적으로 접근 못한다. 하지만 형변환을 사용을 하면 가능하다
	}

}
