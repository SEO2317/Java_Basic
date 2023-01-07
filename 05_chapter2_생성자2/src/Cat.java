//재사용 클래스
public class Cat {
	
	 String name;
	 private int age;
	 String gender;
	 
	 public Cat() {
		 
	 }
	 
	 //오버로딩 생성자
	 public Cat(String n) {
		 name = n;
	 }
	 
	 public Cat(String n, int a) {
		 name = n;
		 age = a;
	 }
	 
	 public Cat(String n, int a, String gen) {
		 name = n;
		 age  = a;
		 gender = gen;
	 }

}
