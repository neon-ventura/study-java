package model.entities;

public class Pix implements FormaDePagamento {
	
	@Override
	public void pagar(double quantity) {
		System.out.println("Payment via Pix made!");
		System.out.println("Quantity: " + quantity);
	}
}
