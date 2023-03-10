package com.stringbuilder;

public class TestMain2 {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("hello");
		
		System.out.println("1. 값추가: " +builder.append("Hello"));
		System.out.println("1. 값추가: " +builder.append(true));
		System.out.println("1. 값추가: " +builder.append(100));
		System.out.println("1. 값추가: " +builder.append(new char[] {'h','e','l','l','o'}));
		
		System.out.println("2. 중간삽입: " +builder.insert(0,"홍길동"));
		System.out.println("3. 삭제: " +builder.delete(1,5)); //1~4 삭제
		
		System.out.println("4. 특정문자 얻기: " + builder.charAt(0));
		System.out.println("5. 특정문자 위치값 얻기: " + builder.indexOf("홍"));
		System.out.println("6. 부분열얻기: " + builder.substring(1));
		System.out.println("6. 특정문자 위치값 얻기: " + builder.substring(1,5)); //1~4반환
		
		System.out.println("7. 거꾸로: " + builder.reverse());
		
		//String  타입에 저장
		String xxx = builder.toString();
		System.out.println("8. String타입로 변경: " + xxx + (xxx instanceof String));
		System.out.println("원본:" + builder);
	}

}
