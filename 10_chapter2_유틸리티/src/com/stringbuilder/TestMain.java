package com.stringbuilder;

public class TestMain {

	public static void main(String[] args) {
		// StringBuffer StringBuilder
		
		StringBuffer buffer = new StringBuffer("hello");
		StringBuilder builder = new StringBuilder("hello");
		
		System.out.println(buffer);
		System.out.println(builder);
		System.out.println(buffer instanceof StringBuffer);
//		System.out.println(buffer instanceof String); string은 아니다
	}

}
