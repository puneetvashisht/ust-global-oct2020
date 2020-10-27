package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.ust.PaymentComponent;

public class TestDI {

	public static void main(String[] args) {
//		No object creation using new keyword.
//		A a = new A();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		A a = context.getBean(A.class);
		a.execute();
		
		
		PaymentComponent component = context.getBean(PaymentComponent.class);
		component.execute();
	}

}
