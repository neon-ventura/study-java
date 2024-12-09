package model.entities;

public class CreditCard implements FormaDePagamento {
	@Override
	public void pagar(double quantity) {
		double quantityTax = quantity * (5.0 / 100);
		double calc = quantity + quantityTax;
		System.out.println("Payment via Credit Card made!");
		System.out.println("Quantity: " + quantity + " + " + "5% fee = " + calc);
	}
}
