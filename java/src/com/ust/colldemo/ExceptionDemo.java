package com.ust.colldemo;

public class ExceptionDemo {

	public static void m2(int n) throws NegativeNumberException {
//		try{
//			int x = n/0;
//		}
//		catch(ArithmeticException ae){
//			System.out.println(ae.getMessage());
//		}
		if(n<1) throw new NegativeNumberException("no negative number please");
		System.out.println("m2");
	}
	public static void m1(int n)  {
		System.out.println("m1");
		m2(n);
		try {
			m2(n);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("this is always going to be executed");
		}
	}
	public static void main(String[] args) {
		m1(-2);
		System.out.println("main");
	}

}
