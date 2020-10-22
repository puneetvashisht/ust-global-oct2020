package com.demo.java8;

@FunctionalInterface
interface PaymentType{
	void pay();
}
class LocalPaymentType implements PaymentType{
	@Override
	public void pay() {
		System.out.println("Make local transfers in INR");		
	}
}

public class LamdasDemo {
	
	public static void payment(PaymentType paymentType) {
		paymentType.pay();
	}
	
	public static void main(String[] args) {
//		1. Pass supertypes to change functionalities
		payment(new LocalPaymentType());
		
//		2. Abstract classes
		payment(new PaymentType() {
			@Override
			public void pay() {
				System.out.println("Make internatinal transfers in USD");
			}		
		});
//		3. Lamdas is abiding by syntax - void pay()
		PaymentType jpyPaymentType = () -> System.out.println("Make internatinal transfers in JPY");
		payment(jpyPaymentType);
		
//		payment(() -> System.out.println("Make internatinal transfers in JPY"));
		
		Thread t = new Thread(()-> { 
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			
		});
		t.start();
	}

}
