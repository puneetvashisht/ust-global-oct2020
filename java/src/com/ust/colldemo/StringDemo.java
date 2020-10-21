package com.ust.colldemo;

public class StringDemo {

	public static void main(String[] args) {
//		String s = new String("");
		String s1 = new String("test");
		String s2 = "test";
		System.out.println(s2 == s1);
		System.out.println(s1.equals(s2));
		
//		StringBuffer sb;
//		sb.append()
		StringBuilder sbb;
		
		String sql = "select";
				sql += " * ";
				sql += " from ";
//				sql += " where ";
				sql += " table_name ";
				
			System.out.println(sql);
	}

}
