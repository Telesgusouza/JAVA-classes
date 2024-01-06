package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

		double basicQuote = contract.getTotalValue() / months;
				
		for (int i = 1; i <= months; i++) {
			// adiciona 1 mês 
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuote, i);
			double fee = onlinePaymentService.paymentFee(basicQuote + interest);
			double quote = basicQuote + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quote));
		}
		
	}

}
