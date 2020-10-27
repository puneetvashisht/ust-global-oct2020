package springdemo;

public class A {
	
	B b;
	C c;
	public A(B b, C c) {
		super();
		this.b = b;
		this.c = c;
	}
	
	public void execute() {
		b.execute();
		c.execute();
		System.out.println("execute in A");
	}
	

}
