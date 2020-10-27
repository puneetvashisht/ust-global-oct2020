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

}
