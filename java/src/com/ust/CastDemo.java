package com.ust;

public class CastDemo {

	public static void main(String[] args) {
		int age = 130;
		
		byte a = (byte)age;
		
//		-2^7 to 2^7 - 1 = -128 to 127 
		
		System.out.println(age);
		System.out.println(a);

	}

}
