package com.ust.oops;

public class MemoryDemo {

	public static void main(String[] args) throws InterruptedException {
//		String str = "";
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<1000000;i++) {
			//String is immutable
			Thread.sleep(200);
//			str +=i;
			sb.append(i);
//			str = null;
		}
		System.out.println(sb.toString());

	}

}
