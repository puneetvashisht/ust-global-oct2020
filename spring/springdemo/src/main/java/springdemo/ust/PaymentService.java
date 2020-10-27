package springdemo.ust;

import org.springframework.stereotype.Component;

//@Injectible
@Component
public class PaymentService {
	
	
	public void execute() {
		System.out.println("execute in service");
	}

}
