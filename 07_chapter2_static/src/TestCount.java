
 class Counter {
	 
	 int num; //인스턴스 변수 ==> 개별적인 데이터를 저장할시,자동초기화, 반드시 객체 생성후에 사용가능   //1 1 인스턴스는 매번 생성을 하여 
	 static int count; //static 변수 ==> 값을 누적하기 위해 주로 사용된다.  자동초기회, 객체(new) 생성전에 사용 가능 => new와 무관하다(인스턴스와 무관(heap 메모리쪽하고 관련없음)
	 public Counter() {
		 //갯수 세기
		 count++;
	 }
	 public int getNum() { //인스턴스 메서드
		 return num;
	 }
	 public int getCount() {//인스턴스 메서드에서는 static 변수 사용 가능 ==> static변수가 먼저생성하기 때문에
		 System.out.println(this.num);
		 return count;   //static 먼저 만들어져 사용이 가능하다
	 }
	 
	 //static 메서드 ==> 객체(new) 생성 전에 사용가능 => new 무관(heap메모리쪽 관련없음).
	 public static int getStaticCount() {
			/*
			 * System.out.println(this);
			 * return num;
			 * 인스턴스 변수라서 안됨
			 */
		 	return count; //같은 static 사용 가능
	 }
	 
}//end class

/*
 * 
 * 
 * counter 클래스 몇번 new 했는지 갯수 알아보기
 * 
 * 
 * 
 * 
 */
public class TestCount {
	public static void main(String[] args) {
		
		System.out.println(Counter.getStaticCount()); //클래스명.static메서드 //static변수접근 //객체생성없이 사용
		System.out.println(Counter.count); //클래스명.static변수명 //static변수접근 //누적용
		
		Counter c = new Counter();
		System.out.println(c.num); //객체명.count
		System.out.println(c.getCount());
		Counter c2 = new Counter();
		 System.out.println(c2.getCount());
	}

}


/*
 * 
 * System.out.println(Counter.count); //static변수는 객체 생성(new)전에 쓸 수 있고
		Counter c = new Counter();
		//인스턴스 변수는 객체 생성(new)후 쓸 수 있다.
		System.out.println(c.num);
 * 
 * 
 * 
 * 
 * */
