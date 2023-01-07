
public class MyTest01 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		 System.out.println("이름은: "+name);
		 System.out.println("나이는: "+age+" 이고 "+"주소는 : "+address);
		 
		 System.out.println("===================================");
		 
		 System.out.print("이름은: "+name);
		 System.out.println();
		 
		 System.out.print("나이는: "+age+"이고 "+"주소는 : "+address+"\n");
		 
		 
		 
		 System.out.println("===================================");
		 
		
		 System.out.printf("이름은 %5s\n", name);
		 System.out.printf("나이는 %2d 이고 주소는 %2s",age,address);

	}

}
