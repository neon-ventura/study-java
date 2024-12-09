package model.entities;

public class DebitCard implements FormaDePagamento{

	@Override
	public void pagar(double quantity) {
		
		System.out.println("Payment via Debit Card made!");
		System.out.println("Quantity: " + quantity);
	}

}
