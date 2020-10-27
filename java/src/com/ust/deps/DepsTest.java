package com.ust.deps;


class A{
	// loose coupling
	B b;
	C c;
	public A(B b, C c) {
		this.b = b;
		this.c = c;
	}
	void execute() {
		b.execute();
		c.execute();
		System.out.println("Execute in A");
	}
}

class B{
	void execute() {
		System.out.println("Execute in B");
	}
}

class C{
	void execute() {
		System.out.println("Execute in C");
	}
}

public class DepsTest {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		A a = new A(b, c);
		a.execute();

	}

}
