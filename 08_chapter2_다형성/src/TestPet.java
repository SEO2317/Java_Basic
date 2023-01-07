
public class TestPet {

	public static void main(String[] args) {
		
		//1. 일반적인 객체 생성 방법
		Pet p = new Pet("앵무새",2);
		System.out.printf("이름:%s, 나이:%d\n", p.getName(), p.getAge());
		
		Cat c = new Cat("야옹이1",2,"암컷");
		System.out.printf("이름:%s, 나이:%d, 성별:%s\n", c.getName(), c.getAge(),c.getGender());
		
		Dog d = new Dog("멍멍이,1",3,"화이트");
		System.out.printf("이름:%s, 나이:%d, 색상:%s\n", d.getName(), d.getAge(),d.getColor());
		
		
		//2. 다형성 ==> 변수 하나로 다양한 객체 관리가 가능하다. 재사용성이 증가
		Pet p2 = new Pet("앵무새",2);
			p2 = new Cat("야옹이1",2,"암컷");
			p2 = new Dog("멍멍이1",3,"블랙");
	}

}
