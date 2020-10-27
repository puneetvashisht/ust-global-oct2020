package springdemo.ust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentComponent {
	
//	construction (paymentService: PaymentService)
	@Autowired
	PaymentService paymentService;
	
	
	public PaymentComponent(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}


	public void execute() {
		paymentService.execute();
		System.out.println("execute in component");
	}


	public boolean transferFunds(int account1, int account2, double amount) {
		if(amount< 0) {
			throw new RuntimeException("Amount not valid!!");
		}
		paymentService.execute();
		return true;
	}

}
