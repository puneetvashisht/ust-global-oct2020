package springdemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springdemo.ust.PaymentComponent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class DITest {
	
	@Autowired
	PaymentComponent component;

	@Test
	public void test() {
		B b = new B();
		assertTrue(b !=null);
		
	}
	
	@Test
	public void testExecute() {
		component.execute();
		assertTrue(true);
	}
	
	@Test
	public void testFundsTransfer() {
		int account1 = 123;
		int account2 = 234;
		double amount = 10000;
		boolean result = component.transferFunds( account1,  account2,  amount);
		assertTrue(result);
	}
	
	@Test(expected = RuntimeException.class)	
	public void testFundsTransferNegativeAmount() {
		int account1 = 123;
		int account2 = 234;
		double amount = -10000;
		boolean result = component.transferFunds( account1,  account2,  amount);
		assertTrue(result);
	}
	

}
