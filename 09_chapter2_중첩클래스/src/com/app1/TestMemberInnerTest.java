package com.app1;
//객체 생성 하는 곳 new 하는 곳(outer 하든지 메서드, 완전히 다른 클래스)
class Outer{
	
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	static int n5 = 50;
	
	public void methodOuter() {;
		Inner inner =  new Inner();
		inner.methodInner();
	}//outer 메서드에 객체를 생성한 경우
	class Inner{
		int x = 100;
//		static int x2 = 200 static을 못갖는다
		public void methodInner() {	
			System.out.println(x);
			System.out.println(n);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);
			System.out.println(n5);
		}
		
	}//end Inner
	
}//end class

public class TestMemberInnerTest {

	public static void main(String[] args) {
			Outer outer =  new Outer();
			outer.methodOuter();
			
			//다른 클래스에서 Inner 생성하는 방법
			Outer xx = new Outer();
			Outer.Inner inner = xx.new Inner();
			inner.methodInner();
	}

}
