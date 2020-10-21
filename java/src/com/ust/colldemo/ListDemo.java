package com.ust.colldemo;

import java.util.ArrayList;

public class ListDemo {
	
	public static void main(String[] args) {
		
		// Unbounded
		ArrayList<String> list = new ArrayList<>();
//		list.add(0);
		list.add("string value");
		
		for(String o : list) {
			System.out.println(o.substring(2));
		}
		
		System.out.println(list);
	}

}
